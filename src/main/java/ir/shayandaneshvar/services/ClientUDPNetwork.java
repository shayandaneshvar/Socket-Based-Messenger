package ir.shayandaneshvar.services;

import java.io.IOException;
import java.net.*;

public class ClientUDPNetwork extends ClientNetwork {
    private DatagramSocket socket;
    private InetAddress ip;
    private Boolean isConnected;
    private Thread send = null, receive = null;

    public ClientUDPNetwork(String address, Integer port) {
        super(address, port);
        isConnected = false;
    }

    @Override
    public boolean openConnection() {
        if (isConnected) {
            return true;
        }
        try {
            ip = InetAddress.getByName(super.getAddress());
            socket = new DatagramSocket(super.getPort());
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String receive() {
        byte[] data = new byte[2048];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        try {
            socket.receive(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = new String(packet.getData());
        return string;
    }

    @Override
    public void send(String string) {
//        send(string);
    }

    public void send(byte[] data) {
        if(send==null){
            send = new Thread(()->{
                DatagramPacket packet = new DatagramPacket(data, data.length,
                        ip,getPort());
                try {
                    socket.send(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            },"Send-Thread");
        }
    }

}
