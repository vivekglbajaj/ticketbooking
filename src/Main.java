import models.Transport;
import models.Flight;
import models.Train;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Transport train = new Train("Delhi", "Mumbai"); // ✅ Now recognized correctly
        train.bookTicket(); // Calls Train's bookTicket()

        // Booking a Flight ticket
        Transport flight = new Flight("Bangalore", "Chennai"); // ✅ Now recognized correctly
        flight.bookTicket(); // Calls Flight's bookTicket()
    }
}