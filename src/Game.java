import java.util.ArrayList;
import java.util.List;

public class Game {
	public ArrayList<Player> player_list = new ArrayList<Player>();
	public List<Integer> board = new ArrayList<Integer>();
	
	public void create_game(Player p) {
        player_list.add(p);
        board.add(p.score);
	}
	public void join_game(Player p) {
        player_list.add(p);
        board.add(p.score);
	}
	public void leave_game(Player p) {
        player_list.remove(p);
        board.remove(p.score);
	}
	public List<Integer> checkBoard() {
		return board;
	}
}
