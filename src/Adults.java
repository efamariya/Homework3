public class Adults {


    public int ticketPrice; // стоимость билета
    public double ticketDiscount; // скидка
    public int  numberOfTickets; // количество билетов

    public Adults(int ticketPrice, double ticketDiscount, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.ticketDiscount = ticketDiscount;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculate() {
        return   ticketPrice  * numberOfTickets;

    }

}
