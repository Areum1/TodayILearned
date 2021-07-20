import java.net.Socket;

public class ClientExample4 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("[���] java ClientExample4 \"��ȭ��\" �������� �������ּ���.");
			return;
		}
		
		try {
			Socket soc = new Socket("10.96.122.51", 9999);
			Thread th1 = new SenderThread(soc, args[0]);
			Thread th2 = new ReceiverThread(soc);
			
			th1.start();
			th2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
