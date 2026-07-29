package a0729.card1;

public class Cardtest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("== 카드1 ==");
        System.out.println("무늬 : " + c1.kind);
        System.out.println("숫자 : " + c1.number);
        //System.out.println("크기 : " + c1.width + "X" + c1.height);
        System.out.println("크기 : " + Card.width + "X" + Card.height);
        
        System.out.println();

        System.out.println("== 카드2 ==");
        System.out.println("무늬 : " + c2.kind);
        System.out.println("숫자 : " + c2.number);
        System.out.println("크기 : " + Card.width + "X" + Card.height);

        System.out.println();

        Card.width=120;
        Card.height=300;
        System.out.println("== 카드 크기 변경 후 ==");

        System.out.println("카드1 : " + Card.width + "X" + Card.height);
    }
    
}
