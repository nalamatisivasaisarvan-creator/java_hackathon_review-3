
class CinemaBooking {
    String movieName;
    double ticketPrice;
    int numberOfTickets;
    String customerName;

    // Default constructor
    CinemaBooking() {
        movieName = "Unknown Movie";
        ticketPrice = 0;
        numberOfTickets = 0;
        customerName = "Unknown";
    }

    // Parameterized constructor
    CinemaBooking(String movieName, double ticketPrice,
                  int numberOfTickets, String customerName) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        this.customerName = customerName;
    }

    // Overloaded booking method
    void bookTickets(int tickets) {
        numberOfTickets = tickets;
        displayBooking();
    }

    // Overloaded booking method
    void bookTickets(int tickets, String customer) {
        numberOfTickets = tickets;
        customerName = customer;
        displayBooking();
    }

    // Display booking details
    void displayBooking() {
        if (numberOfTickets <= 0) {
            System.out.println("Invalid number of tickets!");
            return;
        }

        double total = ticketPrice * numberOfTickets;
        double discount = 0;

        if (numberOfTickets >= 5) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("\n--- Cinema Booking Summary ---");
        System.out.println("Movie Name: " + movieName.toUpperCase());
        System.out.println("Customer Name: " + customerName.toUpperCase());
        System.out.println("Ticket Price: Rs. " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Amount: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount: Rs. " + finalAmount);
    }

    // Compare customer names
    void compareCustomers(String name) {
        if (customerName.equalsIgnoreCase(name)) {
            System.out.println("Customer names match.");
        } else {
            System.out.println("Customer names do not match.");
        }
    }

    public static void main(String[] args) {
        // Create booking using parameterized constructor
        CinemaBooking b1 = new CinemaBooking(
            "Pushpa 2", 200, 5, "Sarvan"
        );

        // Book tickets using one argument
        b1.bookTickets(5);

        // Compare customer names
        b1.compareCustomers("sarvan");

        // Create booking using default constructor
        CinemaBooking b2 = new CinemaBooking();
        b2.movieName = "Devara";
        b2.ticketPrice = 150;
        b2.customerName = "Gowtham";

        // Book tickets using two arguments
        b2.bookTickets(3, "Gowtham");
    }
}



