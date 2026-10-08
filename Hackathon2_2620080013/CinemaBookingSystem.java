import java.util.Scanner;

class MovieTicket {
    // Data members
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculates total ticket amount: ticket price × number of tickets
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Calculates discount: 10% discount if tickets >= 5, otherwise 0
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    // Calculates final amount after deducting discount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Displays the complete booking bill
    public void displayBill() {
        System.out.println("\n----------- Booking Bill -----------");
        System.out.println("Movie Name        : " + movieName);
        System.out.printf("Ticket Price      : $%.2f\n", ticketPrice);
        System.out.println("Number of Tickets : " + numberOfTickets);
        System.out.printf("Total Amount      : $%.2f\n", calculateTotal());
        System.out.printf("Discount          : $%.2f\n", calculateDiscount());
        System.out.printf("Final Amount      : $%.2f\n", calculateFinalAmount());
        System.out.println("------------------------------------");
    }
}

public class CinemaBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();
        System.out.print("Enter number of tickets: ");
        int numberOfTickets = scanner.nextInt();
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        
        ticket.displayBill();

        scanner.close();
    }
}
