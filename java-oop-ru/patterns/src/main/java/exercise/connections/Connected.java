package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection{
    TcpConnection tcp;

    public Connected(TcpConnection tcpConnection) {
        this.tcp = tcpConnection;
    }

    @Override
    public String getStatus() {
        return "connected";
    }

    @Override
    public void connect() {
        System.out.println("Error! Already connected!");
    }

    @Override
    public void disconnect() {
        this.tcp.setState(new Disconnected(this.tcp));
        System.out.println("disconnected");
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
// END
