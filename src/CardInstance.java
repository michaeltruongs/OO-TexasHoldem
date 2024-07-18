import java.util.ArrayList;
import java.util.List;



// Singleton class to create a deck of cards for a poker game
public class CardInstance {
    // static instance of the singleton class 
    private static DeckOfCards instance = null;
    // array of strings to hold the suits of the cards
    private static String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    // array of strings to hold the values of the cards
    private static String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    // a list to hold all of the cards
    private static List<String> deck;
 
    // private constructor to prevent creating an instance directly
    private CardInstance(){
        deck = new ArrayList<String>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                deck.add(values[j] + " of " + suits[i]);
            }
        }
    }
 
    // static method to get an instance of the class
    public static DeckOfCards getInstance(){
        if (instance == null)
            instance = new DeckOfCards();
 
        return instance;
    }
}
