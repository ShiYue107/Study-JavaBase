import java.io.IOException;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",9990);
            Sendlmpl spl=new Sendlmpl(socket);
            new Thread(spl).start();
            Receivelmpl rpl=new Receivelmpl(socket);
            new Thread(rpl).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
