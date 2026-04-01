import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.println("<h1>Lista de Funcionários</h1>");
        out.println("<a href='index.html'>Novo Funcionário</a><br><br>");

        List<Emp> list = EmpDao.getAllEmployees();

        out.println("<table border='1'>");
        out.println("<tr><th>ID</th><th>Nome</th><th>Email</th><th>País</th><th>Ação</th></tr>");

        for (Emp e : list) {
            out.println("<tr>");
            out.println("<td>" + e.getId() + "</td>");
            out.println("<td>" + e.getName() + "</td>");
            out.println("<td>" + e.getEmail() + "</td>");
            out.println("<td>" + e.getCountry() + "</td>");
            out.println("<td><a href='DeleteServlet?id=" + e.getId() + "'>Excluir</a></td>");
            out.println("</tr>");
        }

        out.println("</table>");
    }
}
