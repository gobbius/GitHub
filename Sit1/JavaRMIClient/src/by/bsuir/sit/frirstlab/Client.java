package by.bsuir.sit.frirstlab;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;



public class Client {

	private Client() {}

    	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
// Получаем стаб регистратора с хоста, определенного в командной строке
// если в командной строке хост не указывается, то он считается как localhost
			Registry registry = LocateRegistry.getRegistry(host);
// получаем стаб удаленного объекта от регистратора сервера
			Hello stub = (Hello) registry.lookup("Hello");
			Scanner scanOne = new Scanner(System.in);
			 Scanner scanTwo = new Scanner(System.in);
			 int one=scanOne.nextInt();
			 int two=scanTwo.nextInt();
			String response = stub.sayHello(one,two);
			System.out.println("response: " + response);
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
    	}
}

