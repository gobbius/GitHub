package by.bsuir.sit.controller;

import by.bsuir.sit.logic.CreateTable;
import by.bsuir.sit.logic.DeleteTable;
import by.bsuir.sit.logic.ReadTable;
import by.bsuir.sit.logic.UpdateTable;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;
        if (request.getParameter("button").equalsIgnoreCase("create")) {
            page = CreateTable.create(request, response);
        }
        else if (request.getParameter("button").equalsIgnoreCase("read")) {
            page = ReadTable.read(request, response);
        }
        else if (request.getParameter("button").equalsIgnoreCase("update")) {
            page = UpdateTable.update(request, response);
        }
        else if (request.getParameter("button").equalsIgnoreCase("delete")) {
            page = DeleteTable.delete(request, response);
        }
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(page);
        requestDispatcher.forward(request, response);

    }
}
