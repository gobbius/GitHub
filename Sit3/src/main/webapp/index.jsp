<%-- 
    Document   : index
    Created on : May 26, 2015, 8:26:38 PM
    Author     : notepad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="controller" method="POST">
            <ul>
                <li><input type="submit" value="Create" name="button" />
                    <ul>
                        <li>Фамилия <input type="text" name="lastName" value="" /></li>
                        <li>Имя <input type="text" name="name" value="" /></li>
                        <li>Отчество <input type="text" name="surName" value="" /></li>
                    </ul>
                </li>
                <li><input type="submit" value="Read" name="button" /></li>
                <li><input type="submit" value="Update" name="button" />
                    <ul>
                        <li>Фамилия <input type="text" name="lastNameUpdate" value="" /></li>
                        <li>Имя <input type="text" name="nameUpdate" value="" /></li>
                        <li>Отчество <input type="text" name="surNameUpdate" value="" /></li>
                    </ul>
                </li>
                <li><input type="submit" value="Delete" name="button" />
                    <ul>
                        <li>Фамилия <input type="text" name="lastNameDelete" value="" /></li>
                        <li>Имя <input type="text" name="nameDelete" value="" /></li>
                        <li>Отчество <input type="text" name="surNameDelete" value="" /></li>
                    </ul>
                </li>
            </ul>
        </form>
    </body>
</html>
