public class Main {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");
        Movie movie1 = new Movie("Rambo",135,1996);
        Movie movie2 = new Movie("Pride and Prejudice",98,2005);
        Movie movie3 = new Movie("Hunger Games",120,2018);
        Movie movie4 = new Movie("Wuthering Heights",109,2013);
        Movie movie5 = new Movie("Coco",115,2012);
        ScreeningRoom room1 = new ScreeningRoom("1");
        room1.addSeats("seat1","seat2","seat3","seat4","seat5","seat6","seat7","seat8","seat9","seat10","seat11","seat12",
                "seat13","seat14","seat15","seat16","seat17","seat18","seat19","seat20","seat21","seat22","seat23","seat24","seat25");
        ScreeningRoom room2 = new ScreeningRoom("2");
        room1.addSeats("seat1","seat2","seat3","seat4","seat5","seat6","seat7","seat8","seat9","seat10","seat11","seat12",
                "seat13","seat14","seat15","seat16","seat17","seat18","seat19","seat20","seat21","seat22","seat23","seat24","seat25");
        ScreeningRoom room3 = new ScreeningRoom("3");
        room1.addSeats("seat1","seat2","seat3","seat4","seat5","seat6","seat7","seat8","seat9","seat10","seat11","seat12",
                "seat13","seat14","seat15","seat16","seat17","seat18","seat19","seat20","seat21","seat22","seat23","seat24","seat25");
        cinema1.addRoom(room1);
        cinema1.addRoom(room2);
        cinema1.addRoom(room3);
        Screening screening1 = new Screening(movie1,2025-3-12-20,room1);
        Screening screening2 = new Screening(movie2,2025-3-12-18,room2);
        Screening screening3 = new Screening(movie3,2025-3-12-16,room3);
        cinema1.addScreening(screening1);
        cinema1.addScreening(screening2);
        cinema1.addScreening(screening3);
        cinema1.printProgramme();
        screening1.buyTicket("seat1","seat2","seat3","seat4","seat5");
        screening2.reserveSeat(123,"seat1","seat2","seat3","seat4","seat5");
        screening3.reserveSeat(345,"seat1","seat2","seat6"); // reservation for registered customer
        //movie1 = cinema1.findMovie("James Bon");
        // ... etc ...
    }
}