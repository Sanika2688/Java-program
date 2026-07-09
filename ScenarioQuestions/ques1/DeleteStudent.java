import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/school?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "javauser";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number to delete: ");
        int rollNumber = scanner.nextInt();

        String sql = "DELETE FROM Student WHERE roll_number = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, rollNumber);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("✅ Record deleted successfully! Rows affected: " + rowsAffected);
            } else {
                System.out.println("⚠️  No record found with Roll Number: " + rollNumber);
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}