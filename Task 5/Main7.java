

interface INetworkProtocol {

    void broadcastMessage(String msg);
}

class BluetoothMeshNetwork implements INetworkProtocol {

    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via Bluetooth Mesh: " + msg);
    }
}

class WiFiDirectNetwork implements INetworkProtocol {

    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via WiFi Direct : " + msg);
    }
}

class DisasterAlterSystem {

    private INetworkProtocol network;

    public DisasterAlterSystem(INetworkProtocol network) {
        this.network = network;
    }

    public void triggerAlert(String alterData) {
        network.broadcastMessage(alterData);
    }
}

public class Main7 {

    public static void main(String[] args) {
        INetworkProtocol bluetooth = new BluetoothMeshNetwork();
        DisasterAlterSystem alter1 = new DisasterAlterSystem(bluetooth);
        alter1.triggerAlert("Earthquake Warning!");

        INetworkProtocol wifi = new WiFiDirectNetwork();
        DisasterAlterSystem alter2 = new DisasterAlterSystem(wifi);
        alter2.triggerAlert("Flood Warning!");

    }
}
