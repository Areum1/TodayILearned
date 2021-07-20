import java.net.Socket;

public class ClientExample4 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("[경고] java ClientExample4 \"대화명\" 형식으로 실행해주세요.");
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
