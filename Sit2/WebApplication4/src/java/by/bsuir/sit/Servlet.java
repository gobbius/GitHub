/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.sit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet extends HttpServlet {

    public void Method(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setAttribute("Method", req.getMethod());
        req.setAttribute("RequestURI", req.getRequestURI());
        req.setAttribute("Protocol", req.getProtocol());
        req.setAttribute("PathInfo", req.getPathInfo());
        req.setAttribute("RemoteAdress", req.getRemoteAddr());
        req.setAttribute("Cookies", req.getCookies());
        forward("/response.jsp", req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Method(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Method(req, resp);
    }

    public void forward(String to, HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(to);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
