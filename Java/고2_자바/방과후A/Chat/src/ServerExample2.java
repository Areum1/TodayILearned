import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9999);
			socket = serverSocket.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			String str = reader.readLine();
			System.out.println(str);
			
			writer.println("안녕 클라이언트~");
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try { socket.close(); } catch (Exception e2) { e2.printStackTrace(); }
			try { serverSocket.close(); } catch (Exception e2) { e2.printStackTrace(); }
		}
		
	} // main
}
