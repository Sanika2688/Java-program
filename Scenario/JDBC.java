import java.sql.*;

class JDBC {

    public static void main(String[] args) throws java.lang.Exception {

        String url = "jdbc:mysql://localhost:3306/anu1";
        String username = "root";
        String password = "Rohit123!";
        String query = "select * from student";

        // Load driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

        con.close();
    }
}