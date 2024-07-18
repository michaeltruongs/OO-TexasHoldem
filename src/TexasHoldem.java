import java.util.ArrayList;
import java.util.Random;


public class TexasHoldem {
	public Cards[] cards;
	public Cards[] seven_cards;
	public int pot;
	public ArrayList<Observer> observers;
	
	public ArrayList<Cards> deal(ArrayList<Cards> deal_cards, Observer ob) {
		
		Random rand = new Random();
		int  n = rand.nextInt(51) + 1;
		deal_cards.add(cards[n]);
		System.out.println("Your cards are:");
		System.out.printf("%s %d \n",cards[n].suit, cards[n].value);
		rand = new Random();
		n = rand.nextInt(51) + 1;
		deal_cards.add(cards[n]);
		System.out.printf("%s %d",cards[n].suit, cards[n].value);
		return deal_cards;
	}
	public ArrayList<Cards> flop(ArrayList<Cards> flop_cards, Observer ob) {
		Random rand = new Random();
		int  n = rand.nextInt(51) + 1;
		flop_cards.add(cards[n]);
		System.out.println("Your cards are:");
		System.out.printf("%s %d \n",cards[n].suit, cards[n].value);
		rand = new Random();
		n = rand.nextInt(51) + 1;
		flop_cards.add(cards[n]);
		System.out.printf("%s %d",cards[n].suit, cards[n].value);
		n = rand.nextInt(51) + 1;
		flop_cards.add(cards[n]);
		System.out.printf("%s %d \n",cards[n].suit, cards[n].value);
		return flop_cards;
	}
	public ArrayList<Cards> flip(ArrayList<Cards> flip_cards, Observer ob) {
		Random rand = new Random();
		int  n = rand.nextInt(51) + 1;
		flip_cards.add(cards[n]);
		System.out.println("Your cards are:");
		System.out.printf("%s %d \n",cards[n].suit, cards[n].value);
		rand = new Random();
		n = rand.nextInt(51) + 1;
		flip_cards.add(cards[n]);
		System.out.printf("%s %d",cards[n].suit, cards[n].value);
		return flip_cards;
	}
	public void update_pot (int chips) {
		pot += chips;
	}
	public void attach(Observer o) {
		observers.add(o);
	}
	public void notify1() {
		for(Observer obs : observers) {
			obs.update();
		}
	}
	public void detach(Observer o) {
		observers.remove(o);
	}
}
