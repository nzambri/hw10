package CountEachWord;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/word_occurrences";
        String username = "root";
        String password = "NickIsAwesome!";



        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database.");
            // Use the connection here.
            conn.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
