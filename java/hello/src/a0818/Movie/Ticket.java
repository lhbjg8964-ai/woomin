package a0818.Movie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Ticket
 */
// 의존성(Dependency) - Ticket 클래스가 정상적으로 동작하려면  ReservationManager(예약 관리자) 반드시 필요 -이를 의존한다 표현
// 주입(Injection) :  Ticket 이 직접 ReservationManager를 코드내부 생성하는것이아니라
// 객체를 만드는 주체(외부)가 생성해서 생성자의 매개변수로 쏙 넣어주는 (주입하는) 방식

public class Ticket {
    private ReservationManager reservationManager; //예약관리자
    
    //기존 예약 관리자를 받아서 사용하도록 변경 - DI (의존성 주입)
    public Ticket(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
    }

    public void printTicket(int reservationNum) {
        try {
            File dir = new File("d:\\movieTicker");
            if(!dir.exists()){//폴더가 없으면
                dir.mkdir();//디레토리(폴더) 생성
            }
            File file = new File(dir , "ticket_"+reservationNum+".txt");
            boolean isNewFile = file.createNewFile(); //파일이 없으면 생성
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
                if(file.canWrite()){
                    if(!isNewFile){
                        bufferedWriter.newLine(); //기존파일이면 개행(줄바꿈 추가)
                    }
                    //예매 정보를 가져와서 저장
                    String tickerInfo = reservationManager.getReservationDetails(reservationNum);
                    if(tickerInfo == null){
                        System.out.println("예매 정보를 찾을 수 없습니다.");
                        return;
                    }
                    bufferedWriter.write(tickerInfo);
                    bufferedWriter.flush(); //저장
                    System.out.println("티겟 출력 성공");

                }else{
                    System.out.println("티켓 출력 실패 : 권한문제");
                }   

            } 


        } catch (Exception e) {
            System.out.println("티켓 출력 실패 : " + e.getMessage());
        }
    }

   
    
}
