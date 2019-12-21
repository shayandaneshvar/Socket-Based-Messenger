package ir.shayandaneshvar.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Client extends Entity {
    private String name;
    private String address;
    private Integer port;
    private HashMap<Client, List<StringBuilder>> receivedMessages;
    private HashMap<List<StringBuilder>, Client> sentMessages;

    public Client(String name, String address, Integer port) {
        this.name = name;
        this.address = address;
        this.port = port;
        receivedMessages = new LinkedHashMap<>();
        sentMessages = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPort() {
        return port;
    }

    public HashMap<Client, List<StringBuilder>> getReceivedMessages() {
        return (HashMap<Client, List<StringBuilder>>)
                receivedMessages.clone();
    }

    public HashMap<List<StringBuilder>, Client> getSentMessages() {
        return (HashMap<List<StringBuilder>, Client>) sentMessages.clone();
    }
}
