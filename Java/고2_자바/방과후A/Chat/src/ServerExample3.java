import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample3 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9999);
			socket = serverSocket.accept();
			
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			thread1.start();
			thread2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try { serverSocket.close(); } catch (Exception e2) { e2.printStackTrace(); }
		}//finally
	}
}
