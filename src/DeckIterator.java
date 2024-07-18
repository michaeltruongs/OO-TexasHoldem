import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
 
public class DeckIterator implements Iterator<Card> { // DeckIterator implements the Iterator interface
   
    private List<Card> deck; // the deck of cards
    private int currentIndex; // the current index of the deck
 
    public DeckIterator(List<Card> deck) { // constructor
        this.deck = deck;
        this.currentIndex = 0;
    }
 
    public boolean hasNext() { // return true if there are more cards in the deck
        if (currentIndex < deck.size()) {
            return true;
        } else {
            return false;
        }
    }
 
    public Card next() { // return the next card in the deck 
        Card card = deck.get(currentIndex);
        currentIndex++;
        return card;
    }
}

class Deck extends DeckIterator{
 
    private ArrayList<Card> deck;
 
    public Deck() {
        deck = new ArrayList<Card>();
        // populate the deck with all 52 cards
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++)
                deck.add(new Card(rank, suit));
        }
    }
} 
