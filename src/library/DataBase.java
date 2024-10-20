package library;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	
	List<User> users= new ArrayList<User>();
	List<String> usersNames= new ArrayList<String>();
	
	public void addUser(User user) {
		users.add(user);
		usersNames.add(user.getName());
	
	}

	public int loginUser(String phone,String email) {
		int n  = -1;
		for(User u: users) {
			if(u.getPhoneNumber().matches(phone) && u.getEmail().matches(email)) {
				n=users.indexOf(u);
			}
		}
		return n;
			
		}
	
	public User getUser(int n) {
		
		return users.get(n);
		
	}
}
