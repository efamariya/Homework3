public class Main {

    public static void main(String[] args) {

        var adultsTicket = new Adults(70, 0, 9);
        var retireeTicket = new Retiree(70,30,5);
        var childrenTicket = new Children(70,50,11);

        //int ticket = 70; // стоимость билета
        //double discountRetiree = 30; // скидк пенсионерам
        //double discountChildren = 50; // скидка детям

        //int adults = 9; // количество взрослых
        //int retiree = 5; // количество пенсионеров
        //int children = 11; // количество детей


       double sum = adultsTicket.calculate() + retireeTicket.calculate() + childrenTicket.calculate();

        System.out.println( "Общая стоимость билетов составляет " + sum + " монет");
    }
}