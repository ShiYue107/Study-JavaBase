import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Receivelmpl implements Runnable{
    private Socket socket;

    public Receivelmpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true){
            try {
                InputStream is=socket.getInputStream();
                byte[] b=new byte[1024];
                int length=is.read(b);
                System.out.println("接收到消息："+new String(b,0,length));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
