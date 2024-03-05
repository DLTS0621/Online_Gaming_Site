package user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateGame")
public class UpdateGameServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gameId = request.getParameter("gameId");
        String gameName = request.getParameter("gameName");
        String gameCategory = request.getParameter("gameCategory");
        String fileSize = request.getParameter("fileSize");
        String image = request.getParameter("image");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_gaming_site", "root", "it22183590");
            String updateQuery = "UPDATE game SET gameName = ?, gameCategory = ?, fileSize = ?, image = ? WHERE gameId = ?";
            PreparedStatement ps = con.prepareStatement(updateQuery);
            ps.setString(1, gameName);
            ps.setString(2, gameCategory);
            ps.setString(3, fileSize);
            ps.setString(4, image);
            ps.setString(5, gameId);

            int rowsUpdated = ps.executeUpdate();

//            if (rowsUpdated > 0) {
//                response.sendRedirect("/GameDetailsServlet.java"); // Redirect to a success page
//            } else {
//                response.sendRedirect("/your-error-page.html"); // Redirect to an error page
//            }

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/your-error-page.html"); // Redirect to an error page on exception
        }
    }
}
