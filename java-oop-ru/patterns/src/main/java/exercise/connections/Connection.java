package exercise.connections;

public interface Connection {
    // BEGIN
    String getStatus();
    void connect();
    void disconnect();
    void write(String value);
    // END
}
