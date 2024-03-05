package user;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GameAddServlet")
public class GameAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gameName = request.getParameter("gameName");
        String gameCategory = request.getParameter("gameCategory");
        double fileSize = Double.parseDouble(request.getParameter("fileSize"));
        String image = request.getParameter("image");

        boolean isTrue;

        isTrue = GameDBUtil.insertGame(gameName, gameCategory, fileSize, image);
        
        if (isTrue == true) {
            RequestDispatcher dis = request.getRequestDispatcher("GameDetails.jsp");
            dis.forward(request, response);
        } else {
            RequestDispatcher dis2 = request.getRequestDispatcher("error.jsp");
            dis2.forward(request, response);
        }
    }
}
