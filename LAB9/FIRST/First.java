import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.*;

public class First {
    public static void main(String[] args) {
        String[] urls = {
            "jdbc:oracle:thin:@localhost:1521:xe",
            "jdbc:oracle:thin:@192.168.1.100:1521:xe"
        };
        
        String username = "CSCE037";
        String password = "CSCE037";
     
        System.out.println("Running network diagnostics...");
        checkNetwork("192.168.1.100", 1521);
        
        for (String url : urls) {
            try {
                System.out.println("\nAttempting connection to: " + url);
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connection successful!");
                
               
                conn.close();
                return;
                
            } catch (SQLException e) {
                System.err.println("Connection failed: " + e.getMessage());
                System.err.println("SQL State: " + e.getSQLState());
                System.err.println("Error Code: " + e.getErrorCode());
            }
        }
        
        System.err.println("\nAll connection attempts failed. Please:");
        System.err.println("1. Verify Oracle service is running on the server");
        System.err.println("2. Check listener.ora and tnsnames.ora configuration");
        System.err.println("3. Disable firewall temporarily for testing");
        System.err.println("4. Contact your DBA for correct connection details");
    }
    
    private static void checkNetwork(String host, int port) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), 5000);
            System.out.println("Network test: Successfully connected to " + host + ":" + port);
        } catch (Exception e) {
            System.err.println("Network test FAILED to " + host + ":" + port);
            System.err.println("Error: " + e.getMessage());
            System.err.println("Possible causes:");
            System.err.println("- Server is down");
            System.err.println("- Firewall blocking port " + port);
            System.err.println("- Network routing issues");
        }
    }
}