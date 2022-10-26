package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection{
    TcpConnection tcp;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcp = tcpConnection;
    }

    @Override
    public String getStatus() {
        return "disconnected";
    }

    @Override
    public void connect() {
        this.tcp.setState(new Connected(this.tcp));
        System.out.println("connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public void write(String value) {
        System.out.println("Error! already disconnected");
    }
}
// END
