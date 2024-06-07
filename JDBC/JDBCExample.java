// import java.sql.*;

// public class JDBCExample {
//     public static void main(String[] args) {

//         //jdbc:dbname://ip:port/databasename
//         String url = "jdbc:postgresql://localhost:5432/mydatabase";
//         String user = "postgres";
//         String password = "123";

//         Class.forName("org.postgresql.Driver");

//                  //  connection  is use for db connection with dburl,username and password
//         try (Connection connection = DriverManager.getConnection(url, user, password))
//          {
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

//             while (resultSet.next()) {
//                 System.out.println(resultSet.getString("name"));
                
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }