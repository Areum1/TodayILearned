import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread {
	
	Socket soc;
	
	public ReceiverThread(Socket soc) {
		this.soc = soc;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			while (true) {
				String str = reader.readLine();
				
				if (str == null) break;
				
				System.out.println(str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {soc.close();} catch (Exception e2) { e2.printStackTrace();}
		}
	}

}