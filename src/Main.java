

import java.util.Scanner;
import java.util.*;

public class Main {
	public String[][] players;
	@SuppressWarnings("null")
	public static void main(String [] args) {
		String username;
		String password;
		Player p = new Player();
		System.out.println("WELCOME TO OO TexasHoldem:\n");
		System.out.println("1.Log in");
		System.out.println("2.Sign up");
		System.out.println("3.Exit");
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("Enter your username: ");
			scanner = new Scanner(System.in);
			username = scanner.nextLine();
			System.out.println("Enter your password: ");
			password = scanner.nextLine();
			p.login(username, password);
		}
		else if(i == 2) {
			System.out.println("Enter your username: ");
			scanner = new Scanner(System.in);
			username = scanner.nextLine();
			System.out.println("Enter your password: ");
			password = scanner.nextLine();
			p.register(username, password);
		}
		else if(i == 3) {
			System.exit(0);
		}
		else {
			System.out.println("Not a valid input!");
		}
		System.out.println("1.Create a Game");
		System.out.println("2.Join a Game");
		System.out.println("3.Check Score");
		System.out.println("4.View Friends");
		System.out.println("5.Exit");
		i = sc.nextInt();
		if(i == 1) {
			System.out.println("1.Invite a Friend");
			System.out.println("2.Start a Game");
			i = sc.nextInt();
			if(i == 1) {
				System.out.println("Enter your friend's name:");
				String friend_name = scanner.nextLine();
				p.addFriend(friend_name);
				System.out.println("Your friend was invited.");
			}
			System.out.println("Ready to start? Y/N");
			String ans;
			ans = scanner.nextLine();
			while(true) {
			if(ans.equals("Y")) {
				System.out.println("creating a game...");
				break;
			}
			else if(ans.equals("N")) {
				System.exit(0);
			}
			else
				continue;
			}
			Game game = new Game();
			game.player_list.add(p);
			game.create_game(p);
			System.out.println("You entered a game!");
			TexasHoldem TexasHoldem = new TexasHoldem();
			Cards[] cards_52 = new Cards[52];
			
			int j = 0;
			int k = 1;
			for(j=0; j<12; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Diamonds";
				cards_52[j].value = k++; 
			}
			k = 1;
			for(j=13; j<25; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Hearts";
				cards_52[j].value = k++; 
			}
			k = 1;
			for(j=26; j<38; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Spades";
				cards_52[j].value = k++; 
			}
			k = 1;
			for(j=39; j<51; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Clubs";
				cards_52[j].value = k++; 
			}
			
				
			Observer ob = null;
			TexasHoldem.cards = cards_52;
			System.out.println("Dealing Cards...");
			ArrayList<Cards> deal_cards = new ArrayList<Cards>();
			
			ArrayList<Cards> result = TexasHoldem.deal(deal_cards, ob);
			
			System.out.println("\n\n1.bet");
			System.out.println("2.check");
			System.out.println("3.fold");
			System.out.println("4.leave");
			
			i = sc.nextInt();
			Choice choice = new Choice();
			choice.p = TexasHoldem;
			while(true) {
				if(i == 1) {
					System.out.println("Enter how much you want to bet:");
					i = sc.nextInt();
					choice.bet(i);
					System.out.printf("You bet %d ", i);
					i = sc.nextInt();
					break;
				}
				else if(i == 2) {
					choice.check();
					System.out.println("You checked.");
					break;
				}
				else if(i == 3) {
					choice.fold();
					System.out.println("You folded.");
					break;
				}
				else if(i == 4) {
					System.out.println("Left the table");
					System.exit(0);
				}
				else
					continue;
			}
			
		}
		else if(i == 2 ) {
			Game game = new Game();
			game.join_game(p);
			System.out.println("You just joined a Game!");
			
		}
		else if(i == 3) {
			System.out.println(p.viewScore());
		}
		else if(i == 4) {
			System.out.println(p.viewFriends());
		}
		else if(i == 5) {
			System.exit(0);
		}
		
		
		
	}
}
