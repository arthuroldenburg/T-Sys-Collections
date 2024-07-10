import java.util.ArrayList;

public class NetworkSimulator<T> {
    private ArrayList<T> connections;

    public NetworkSimulator() {
        connections = new ArrayList<>();
    }

    public void addConnection(T connection) {
        connections.add(connection);
    }

    public void removeConnection(T connection) {
        connections.remove(connection);
    }

    public void displayConnections() {
        for (T connection : connections) {
            System.out.println(connection);
        }
    }

}
