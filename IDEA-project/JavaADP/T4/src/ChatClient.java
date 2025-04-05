import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try {
            ServerSocket server =new ServerSocket(9990);
            Socket socket=server.accept();
            Sendlmpl spl=new Sendlmpl(socket);
            Receivelmpl rpl=new Receivelmpl(socket);
            new Thread(spl).start();
            new Thread(rpl).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
