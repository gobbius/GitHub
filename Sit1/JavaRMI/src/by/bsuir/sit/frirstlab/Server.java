package by.bsuir.sit.frirstlab;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Server implements Hello {

	public Server() {}

// ���������� ����������
    	public String sayHello(int a, int b) {
    		int three = Realization.gcd(a,b);
			 String string = Integer.toString(three);
		return string;
	}

   	 public static void main(String args[]) {

		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);
// ������� � ������������ ��������� ������
			Server obj = new Server();
			
    			Hello stub = 
				(Hello) UnicastRemoteObject.exportObject(obj, 0);

// ������������ ��������� ������ � RMI-������������ ��� ������
			 Registry registry = LocateRegistry.getRegistry();
			 
			
			 
   			 registry.bind("Hello", stub);

  			 System.err.println("Server ready");
		} catch (Exception e) {
			    System.err.println("Server exception: " + e.toString());
			    e.printStackTrace();
		}
    	}
}