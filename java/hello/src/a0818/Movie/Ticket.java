package a0818.Movie;

/**
 * Ticket
 */
public class Ticket {
    private ReservationManager reservationManager; //예약관리자

    // 기존 예약관리자를 받아서 사용하도록 변경
    public Ticket(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
    }

}
