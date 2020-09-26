import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class MyListener implements Runnable {
	Socket socket = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;
	String msg = "";

	public MyListener(Socket s) {
		this.socket = s;
	}
	@Override
	public void run() {
		try {
			System.out.println("Client connected " + this.socket.getInetAddress().getHostName());
			out = new ObjectOutputStream(socket.getOutputStream());
			out.flush();
			in = new ObjectInputStream(socket.getInputStream());
			do {
				try {
					msg = (String)in.readObject();
					System.out.println("client> " +msg);
					if(msg.equals("exit")){
						break;
						}
					if(msg.equals("Get Sonet")){
						FileConnect fc = new FileConnect();
						sendMessage(fc.GetSonet());
					}
					else{
						int endIndex=0;
						char []str = msg.toCharArray();
						for(char s : str) {
							endIndex++;
							if(s=='-') break;
						}
						String clientIP = msg.substring(0, endIndex);
						String messageToClient = msg.substring(endIndex);
						Socket socketReciver = new Socket(clientIP.trim(), socket.getPort());
						sendMessageToAnotherClient(socketReciver, messageToClient);
					}
		
					} catch (ClassNotFoundException ex) {}
				
				} while (!msg.equals("exit"));
			
			} catch (IOException ex) {}
		}
	
	void sendMessageToAnotherClient(Socket s, String m) {
		try {
			ObjectOutputStream out2=new ObjectOutputStream(s.getOutputStream());
			out2.flush();
			out2.writeObject(m);
			out2.flush();
		} catch (IOException ex) {}
	
	}
	
	void sendMessage(String m) {
		try {
			out.writeObject(m);
			out.flush();
		} catch (IOException ex) {}
	}
}