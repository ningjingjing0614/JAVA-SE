package pack2;
public class Card {
    private int rank;//牌值
    private String suit;//花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%s %s]",suit, trank(rank));
    }
    String trank(int num){
        switch (num){
            case 1:return "A";
            case 11:return "J";
            case 12:return "Q";
            case 13:return "K";
            default:
                return String.valueOf(num);
        }
    }

    public static void main(String[] args) {
        Card car1 = new Card(1,"♥");
        System.out.println(car1);
        Card car2 = new Card(11,"♣");
        System.out.println(car2);
    }
}
