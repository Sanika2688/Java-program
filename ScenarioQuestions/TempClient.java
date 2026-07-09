import java.io.*;
import java.net.*;

public class TempClient {
    private static final String HOST = "localhost";
    private static final int PORT = 5000;

    public static void main(String[] args) throws IOException {
        double[] testTemps = { 0, 100, -40, 37, 22.5 };

        for (double celsius : testTemps) {
            Socket socket = new Socket(HOST, PORT);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            // Send Celsius value to server
            out.println(celsius);

            // Receive Fahrenheit response
            String response = in.readLine();
            System.out.printf("Sent: %.2f°C  →  Received: %s°F%n", celsius, response);

            socket.close();

            // Small delay between requests
            try { Thread.sleep(300); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}