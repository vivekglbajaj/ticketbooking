package models; // Ensure correct package usage

// Flight class inheriting from Transport
public class Flight extends Transport {
    public Flight(String source, String destination) {
        super(source, destination);
    }

    @Override
    public void bookTicket() {
        System.out.println("✈️ Flight ticket booked from " + source + " to " + destination);
    }


}
