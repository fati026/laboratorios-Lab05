package py.una.pol.par.servlet01.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    private List<Usuario> usuarios = new ArrayList<>();
    
 protected void processRequest(HttpServletRequest request, HttpServletResponse 
response)
 throws ServletException, IOException {
 }
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException { 
 
  response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lista de Usuarios</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista de Usuarios</h1>");
            out.println("<ul>");
            for (Usuario usuario : usuarios) {
                out.println("<li>" + usuario.getNombre() + " " + usuario.getApellido() + " - CI: " + usuario.getCi() + " - Teléfono: " + usuario.getTelefono() + "</li>");
            }
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
 }
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 String ci= request.getParameter("ci");
 String nombre= request.getParameter("nombre");
 String apellido= request.getParameter("apellido");
 String telefono= request.getParameter("telefono");
 
//Esto para validar que estamos recibiendo, para probar paso a paso el proceso
 System.out.println("CI es: " + ci);
 System.out.println("Nombre es: " + nombre);
 System.out.println("Apellido es: " + apellido);
 System.out.println("Teléfono es: " + telefono);
 
 
// Crear un nuevo objeto Usuario y añadirlo a la lista
 Usuario nuevoUsuario = new Usuario(ci, nombre, apellido, telefono);
 usuarios.add(nuevoUsuario);

// Redirigir al usuario a la lista de usuarios usando GET
 response.sendRedirect("SvUsuarios");
 
 }
 @Override
public String getServletInfo() {
 return "Short description";
 }// </editor-fold>
}
