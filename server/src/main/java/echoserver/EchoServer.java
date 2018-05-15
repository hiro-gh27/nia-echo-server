package echoserver;

public class EchoServer {
    private final int port;

    public EchoServer(int p) {
        this.port = p;
    }

    public static void main(String[] args) {
        if (args.length != 1){
            System.err.println("hoge");
        }
    }
}
