package HomeWork28;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    double interestRate;
    String cardType;

    Card(double interestRate,String cardType){
        this.interestRate=interestRate;
        this.cardType=cardType;
    }
    public void interest(){
        System.out.println("Your interest fee is 20%");
    }
    public void cardType(){
        System.out.println("What is your card type?");
    }

    public static void main(String[] args) {
        Card amex=new Card(0.20,"Amex");
        Card visa= new Card(0.18,"Visa");
        Card master=new Card(0.23,"Master");

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(amex);
        cards.add(visa);
        cards.add(master);

        for (int i = 0; i < cards.size(); i++) {
            Card card=cards.get(i);
            card.interest();
            card.cardType();

        }

        for (Card c:cards) {
            c.interest();
            c.cardType();
        }
        Iterator<Card> iterator= cards.iterator();
        while (iterator.hasNext()){
            Card c=iterator.next();
            c.interest();
            c.cardType();
        }
    }
}
