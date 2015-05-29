/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.sit.logic;

import by.bsuir.sit.model.Table;
import by.bsuir.sit.model.TableDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author notepad
 */
public class DeleteTable {

    public static String delete(HttpServletRequest request, HttpServletResponse response) {
        Table entity = new Table();
        entity.setLastName(request.getParameter("lastNameDelete"));
        entity.setName(request.getParameter("nameDelete"));
        entity.setSurName(request.getParameter("surNameDelete"));
        try {
            boolean result = new TableDAO().delete(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/jsp/delete.jsp";
    }
}
