import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PerClientThread extends Thread{
	//미완성
	
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>()); //화장실가면 문잠구는거
	Socket socket;
	PrintWriter writer;	
	public PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			
			writer = new PrintWriter(socket.getOutputStream()); //문자열을 바이트로 바꾼것
			list.add(writer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String name = null;
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //안,녕을 안녕으로 하려면 buffer사용
			name = reader.readLine();
			sendAll("#" + name + "님이 들어오셨습니다.");
			
			while(true) {
				String str = reader.readLine(); //대화내용
				if(str == null)break;
				sendAll(name + ">"+ str);
			}
			
		} catch (Exception e) {
			
		}
		finally {
			list.remove(writer);
			sendAll("#"+name+"님이 나가셨습니다.");
			try { socket.close(); } catch (Exception e2) { e2.printStackTrace(); }
		}//finally
	}
	
	public void sendAll(String str) {
		for(PrintWriter writer : list) { //list돌아다니면서 str다 뿌림
			writer.println(str);
			writer.flush();
		}
	}
}
