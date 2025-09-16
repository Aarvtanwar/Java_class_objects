class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(int seat, double newPrice) {
        this.seatNumber = seat;
        this.price = newPrice;
        System.out.println("Ticket booked for seat " + seat);
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket("Avengers", 0, 0);
        mt.bookTicket(15, 250);
        mt.displayDetails();
    }
}
