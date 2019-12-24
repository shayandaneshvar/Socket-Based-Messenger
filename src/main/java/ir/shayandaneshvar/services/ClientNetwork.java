package ir.shayandaneshvar.services;

public abstract class ClientNetwork implements Connectable {
    private String address;
    private Integer port;

    public ClientNetwork(String address, Integer port) {
        this.address = address;
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ClientNetwork{" +
                "address='" + address + '\'' +
                ", port=" + port +
                '}';
    }

}
