import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
  public static void main(String[] args){
    System.out.println("Logs from your program will appear here!");

       int port = 6379;
       try (ServerSocket serverSocket = new ServerSocket(port)) {
        serverSocket.setReuseAddress(true);
        System.out.println("Server currently listening the port...");

         while(true) {
          Socket clientSocket = serverSocket.accept();
          System.out.println("Client connected!");

          clientSocket.close();
         }
       } catch (IOException e) {
         System.out.println("IOException: " + e.getMessage());
       }
  }
}
