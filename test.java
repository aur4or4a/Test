import java.io.*;
import java.net.*;

public class test{
    public static void main(String[] args) throws IOException {
        // 1. Create a TCP ServerSocket listening on port 4444
        ServerSocket server = new ServerSocket(4444);
        System.out.println("Listening on port 4444...");

        while (true) {
            // 2. Wait for the HTML form to connect
            Socket client = server.accept(); 
            System.out.println("Browser connected!");

            // 3. Read the HTTP request (the form data)
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String requestLine = in.readLine();
            System.out.println("Browser sent: " + requestLine);

            // 4. Send the TCP/HTTP response back to the HTML client
            PrintWriter out = new PrintWriter(client.getOutputStream());
            
            // HTTP Headers (Crucial: The browser needs these to understand the response)
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println("\r\n"); // A blank line MUST separate headers from the body
            
            // The actual HTML data you are sending back
            out.println("<h1>Success!</h1><p>I received your form data.</p>");
            out.flush(); // Force the TCP packets to send

            // 5. Close the connection
            client.close();
        }
    }
}
