public class Retiree {

    public int ticketPrice; // стоимость билета
    public double ticketDiscount; // скидка
    public int  numberOfTickets; // количество билетов

    public Retiree(int ticketPrice, double ticketDiscount, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.ticketDiscount = ticketDiscount;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculate() {
        return (ticketPrice - ticketPrice * ticketDiscount / 100) * numberOfTickets;
    }
}
