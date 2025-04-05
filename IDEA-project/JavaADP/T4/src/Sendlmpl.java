import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sendlmpl implements Runnable{
    private Socket socket;
    public Sendlmpl(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        try {
            OutputStream os=socket.getOutputStream();
            String str=sc.nextLine();
            os.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
