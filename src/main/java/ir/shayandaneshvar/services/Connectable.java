package ir.shayandaneshvar.services;

public interface Connectable {

    boolean openConnection();

    String receive();

    void send(String string);
}
