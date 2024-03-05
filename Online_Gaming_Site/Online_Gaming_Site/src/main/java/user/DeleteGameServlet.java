package user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteGame")
public class DeleteGameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gameId = request.getParameter("gameId");
        
        if (gameId != null) {
            try {
                // Delete the game with the specified gameId from the database
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_gaming_site", "root", "it22183590");
                PreparedStatement deleteStatement = con.prepareStatement("DELETE FROM game WHERE gameId = ?");
                deleteStatement.setString(1, gameId);
                int rowsDeleted = deleteStatement.executeUpdate();

//                if (rowsDeleted > 0) {
//                    // Redirect to the GET request of the original page (fetchData)
//                    response.sendRedirect(request.getContextPath() + "/fetchData");
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

