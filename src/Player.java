import java.util.ArrayList;
import java.util.List;

public class Player {
	public int score;
	public String name;
	public List<String> friends = new ArrayList<String>();
	public int chips;
	
	public void register(String name, String password) {
		System.out.println("Registration was successful");
	}
	public void login(String name, String password) {
		System.out.println("Login was successful");
	}
	public void addFriend(String name) {
        friends.add(name);
	}
	public int viewScore() {
		return score;
	}
	public List<String> viewFriends(){
		return friends;
	}
}