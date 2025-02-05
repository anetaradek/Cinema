public class Ticket {
    Screening screening;
    Boolean reservation = false;
    User user = null;

    public Ticket(Screening screening, Boolean reservation, User user) {
        this.screening = screening;
        this.reservation = reservation;
        this.user = user;
    }

    public void printTicketInfo(){
        System.out.println(screening.toString());
        System.out.println(reservation.toString());
        System.out.println(user.toString());
    }
}
