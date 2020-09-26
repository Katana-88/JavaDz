import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	ServerSocket listener = null;
	Socket client = null;
	int maxCount = 10; // max number of clients
	int count = 0; // current client number
	int port = 8888;

	public static void main(String[] args) {
		ChatServer chat = new ChatServer();
		chat.createConnection();
	}

	void createConnection() {
		try {
			listener = new ServerSocket(port, maxCount);
			while (count <= maxCount) {
				count++;
				client = listener.accept();
				MyListener ml = new MyListener(client);
				Thread t = new Thread(ml);
				t.setDaemon(true);
				t.start();
			}
		} catch (IOException ex) {}
	}
}