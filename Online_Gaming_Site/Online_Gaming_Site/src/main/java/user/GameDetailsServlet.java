package user;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/fetchData")
public class GameDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            response.setContentType("text/html");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_gaming_site", "root", "it22183590");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM game");
            ResultSet rs = ps.executeQuery();
            PrintWriter out = response.getWriter();
            out.println("<html>"
                    + "<head>"
                    + "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">"
                    + "<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>"
                    + "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"></script>"
                    + "<link rel=\"stylesheet\" href=\"style/footer.css\">"
                    + "</head>"
                    + "<body>"
                    + "<br/><br/>"
                    + "<div class=\"container\">"
                    + "<h1>All Game Details</h1>"
                    + "<hr class=\"border border-primary border-3 opacity-75\">"
                    + "<table class=\"table table-striped\">"
                    + "<tr>"
                    + "<td scope=\"col\"><b>Game ID</b></td>"
                    + "<td scope=\"col\"><b>Game Name</b></td>"
                    + "<td scope=\"col\"><b>Game Category</b></td>"
                    + "<td scope=\"col\"><b>File Size(GB)</b></td>"
                    + "<td scope=\"col\"><b>Description</b></td>"
                    + "<td scope=\"col\"><b>Actions</b></td>"
                    + "</tr>");
            while (rs.next()) {
                out.println("<tr>"
                        + "<td>" + rs.getString(1) + "</td>"
                        + "<td>" + rs.getString(2) + "</td>"
                        + "<td>" + rs.getString(3) + "</td>"
                        + "<td>" + rs.getString(4) + "</td>"
                        + "<td>" + rs.getString(5) + "</td>"
                        + "<td><a href='deleteGame?gameId=" + rs.getString(1) + "'><button class=\"btn btn-danger\">Delete</button></a> | "
                        + "<button class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#updateModal" + rs.getString(1) + "\">Update</button></td>"
                        + "</tr>");

                // Modal for Update
                out.println("<div class=\"modal fade\" id=\"updateModal" + rs.getString(1) + "\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"updateModalLabel\" aria-hidden=\"true\">"
                        + "<div class=\"modal-dialog\" role=\"document\">"
                        + "<div class=\"modal-content\">"
                        + "<div class=\"modal-header\">"
                        + "<h5 class=\"modal-title\" id=\"updateModalLabel\">Update Game</h5>"
                        + "<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">"
                        + "<span aria-hidden=\"true\">&times;</span>"
                        + "</button>"
                        + "</div>"
                        + "<div class=\"modal-body\">"
                        + "<form action='updateGame' method='POST'>"
                        + "<input type='hidden' name='gameId' value='" + rs.getString(1) + "'>"
                        + "<div class=\"form-group\">"
                        + "<label for=\"gameName\">Game Name</label>"
                        + "<input type=\"text\" class=\"form-control\" id=\"gameName\" name=\"gameName\" value='" + rs.getString(2) + "'>"
                        + "</div>"
                        + "<div class=\"form-group\">"
                        + "<label for=\"gameCategory\">Game Category</label>"
                        + "<input type=\"text\" class=\"form-control\" id=\"gameCategory\" name=\"gameCategory\" value='" + rs.getString(3) + "'>"
                        + "</div>"
                        + "<div class=\"form-group\">"
                        + "<label for=\"fileSize\">File Size</label>"
                        + "<input type=\"text\" class=\"form-control\" id=\"fileSize\" name=\"fileSize\" value='" + rs.getString(4) + "'>"
                        + "</div>"
                        + "<div class=\"form-group\">"
                        + "<label for=\"image\">Image</label>"
                        + "<input type=\"text\" class=\"form-control\" id=\"image\" name=\"image\" value='" + rs.getString(5) + "'>"
                        + "</div>"
                        + "<br/>"
                        + "<button type=\"submit\" class=\"btn btn-primary\">Update</button>"
                        + "</form>"
                        + "</div>"
                        + "</div>"
                        + "</div>"
                        + "</div>");
            }

            out.println("</table></div>"
            		+ "<br/><br/><br/>"
            		+ "<footer class=\"bg-dark text-light p-5\">\r\n"
            		+ "        <div class=\"container\">\r\n"
            		+ "            <div class=\"row\">\r\n"
            		+ "                <div class=\"col-md-6\">\r\n"
            		+ "                    <h2>Connect with Us</h2>\r\n"
            		+ "                    <p>Join the gaming community and stay updated:</p>\r\n"
            		+ "                    <ul class=\"list-unstyled\">\r\n"
            		+ "                        <li><a href=\"#\"><i class=\"fab fa-facebook\"></i> Facebook</a></li>\r\n"
            		+ "                        <li><a href=\"#\"><i class=\"fab fa-twitter\"></i> Twitter</a></li>\r\n"
            		+ "                        <li><a href=\"#\"><i class=\"fab fa-instagram\"></i> Instagram</a></li>\r\n"
            		+ "                    </ul>\r\n"
            		+ "                </div>\r\n"
            		+ "                <div class=\"col-md-6 text-end\">\r\n"
            		+ "                    <h2>Quick Links</h2>\r\n"
            		+ "                    <ul class=\"list-unstyled\">\r\n"
            		+ "                        <li><a href=\"#\">Home</a></li>\r\n"
            		+ "                        <li><a href=\"#\">Games</a></li>\r\n"
            		+ "                        <li><a href=\"#\">About Us</a></li>\r\n"
            		+ "                        <li><a href=\"#\">Contact</a></li>\r\n"
            		+ "                    </ul>\r\n"
            		+ "                </div>\r\n"
            		+ "            </div>\r\n"
            		+ "        </div>\r\n"
            		+ "    </footer>"
            		+ "</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
