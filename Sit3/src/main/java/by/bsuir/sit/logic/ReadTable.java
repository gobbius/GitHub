/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.sit.logic;

import by.bsuir.sit.model.Table;
import by.bsuir.sit.model.TableDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author notepad
 */
public class ReadTable {

    public static String read(HttpServletRequest request, HttpServletResponse response) {
        List<Table> list = null;
        try {
            list = new TableDAO().read();
            request.setAttribute("listTable", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/jsp/read.jsp";
    }
}
