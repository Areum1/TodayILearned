import java.net.Socket;

public class ClientExample3{

	public static void main(String[] args) {
		
		Socket soc = null;
		
		try {
			soc = new Socket("10.96.122.29", 9999);
			Thread th1 = new SenderThread(soc);
			Thread th2 = new ReceiverThread(soc);
			
			th1.start();
			th2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}