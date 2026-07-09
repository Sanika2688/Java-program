import java.io.*;
import java.net.*;

public class TempServer {
    private static final int PORT = 5000;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started. Listening on port " + PORT + "...");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Read input from client
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String input = in.readLine();
            try {
                double celsius = Double.parseDouble(input);
                double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.printf("Received: %.2f°C  →  Sending: %.2f°F%n", celsius, fahrenheit);
                out.printf("%.2f%n", fahrenheit);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input received: " + input);
                out.println("ERROR: Invalid temperature value.");
            }

            clientSocket.close();
            System.out.println("Client disconnected.\n");
        }
    }
}