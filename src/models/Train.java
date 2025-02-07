package models; // Ensure correct package usage

// Train class inheriting from Transport
public class Train extends Transport {
    public Train(String source, String destination) {
        super(source, destination);
    }

    @Override
    public void bookTicket() {
        System.out.println("✅ Train ticket booked from " + source + " to " + destination);
    }

}
