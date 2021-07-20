import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

// ���ڿ� ���� �� ����
public class ClientExample2 {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("10.96.122.65", 9999);
			
			BufferedReader reader =  new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			writer.println("�ȳ� ������");
			writer.flush(); // ���������� �� ���� ����!
			
			String str = reader.readLine();
			System.out.println(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try { socket.close(); } catch (Exception e2) { e2.printStackTrace(); }
		}//finally
		
	} //main
}
