package models;

// Ensure correct package usage

// Abstract Base Class
public abstract class Transport {
    protected String source;
    protected String destination;

    // Constructor
    public Transport(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
    public abstract void bookTicket();

}
