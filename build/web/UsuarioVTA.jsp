<%-- 
    Document   : UsuarioVTA
    Created on : 26/08/2021, 05:10:24 PM
    Author     : yiver
--%>

<%@page import="Modelo.DTO.UsuarioDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Correo</th>
                    <th>Rol</th>
                </tr>
            </thead>   
            <tbody>
                <%
                    Object Lista = request.getAttribute("List");
                    List<Object> ListObj = (List) Lista;
                    for (Object i : ListObj) {
                        UsuarioDTO usu = (UsuarioDTO) i;
                %>
                <tr>
                    <td> <%=usu.getId()%> </td>
                    <td> <%=usu.getNombre()%> </td>
                    <td> <%=usu.getCorreo()%> </td>
                    <td> <%=usu.getRol() %> </td>
                </tr>
                <%}
                %>
            </tbody>

        </table>
    </body>
</html>
