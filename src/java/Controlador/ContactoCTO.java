/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.ContactoDAO;
import Modelo.DTO.ContactoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yiver
 */
public class ContactoCTO extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Accion = request.getParameter("Accion");
        ContactoDAO DAO = new ContactoDAO();
        switch (Accion) {
            case "Crear":
                String Nombre = request.getParameter("txtnombre");
                String Correo = request.getParameter("txtcorreo");
                String Asunto = request.getParameter("txtasunto");
                String Mensaje = request.getParameter("txtmensaje");

                ContactoDTO DTO = new ContactoDTO(Nombre, Correo, Asunto, Mensaje);

                boolean res = DAO.Crear(DTO);
                if (res) {
                    PrintWriter out = response.getWriter();
                    out.println("<html>"
                            + "<head>"
                            + "<title>Respuesta</title>"
                            + "</head>"
                            + "<body><h1> Su comentario fue enviado con exito</h1>"
                            + "<a href=index.jsp>Volver</a></body>"
                            + "</html>");
                }
                break;
            case "Listar":
                
                List<ContactoDTO> List = DAO.readAll();
                PrintWriter out = response.getWriter();
                out.println("<html>"
                        + "<head>"
                        + "<title>Respuesta</title>"
                        + "<style> table,th,td {"
                        + "border: 1px solid black;"
                        + "border-collapse: collapse;"
                        + "}"
                        + "th, td{"
                        + "padding:15px;"
                        + "}"
                        + "</style>"
                        + "</head>"
                        + "<body><table>"
                        + "<caption> Lista de mensajes</caption>"
                        + "<th>Nombre</th>"
                        + "<th>Correo</th>"
                        + "<th>Asunto</th>"
                        + "<th>Mensaje</th>");
                for (ContactoDTO i : List) {
                    out.println("<tr><td>" + i.getNombre() + "</td>"
                            + "<td>" + i.getCorreo() + "</td>"
                            + "<td>" + i.getAsunto() + "</td>"
                            + "<td>" + i.getComentario() + "</td>"
                            + "</tr>");
                }

                out.println("</table></body></hmtl>");

                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
