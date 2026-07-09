import java.sql.*;

class JDBCExample {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test",
            "root",
            "password"
        );

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        con.close();
    }
}