package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection state;

    public TcpConnection(String ip, int port) {
        this.state = new Disconnected(this);
    }

    public void setState(Connection state) {
        this.state = state;
    }

    public String getState() {
        return state.getStatus();
    }

    public String getCurrentState() {
        return state.getStatus();
    }

    public void connect() {
        state.connect();
    }

    public void disconnect() {
        state.disconnect();
    }

    public void write(String value) {
        this.state.write(value);
    }
}
// END
