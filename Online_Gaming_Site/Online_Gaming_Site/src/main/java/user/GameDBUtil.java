package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameDBUtil {

    // Insert function
    public static boolean insertGame(String gameName, String gameCategory, double fileSize, String image) {
        boolean isSuccess = false;

        try (Connection con = DBConnect.getConnection()) {
            String sql = "INSERT INTO game (gameName, gameCategory, fileSize, image) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                preparedStatement.setString(1, gameName);
                preparedStatement.setString(2, gameCategory);
                preparedStatement.setDouble(3, fileSize);
                preparedStatement.setString(4, image);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    isSuccess = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

}
