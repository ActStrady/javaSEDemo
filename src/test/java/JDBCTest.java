import java.sql.*;

public class JDBCTest {

    private static String url = "jdbc:mysql://192.168.2.128/seckill";
    private static String user = "root";
    private static String password = "RooT..00";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from table_seckill");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
