package mx.ipn.cic.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.ipn.cic.model.User;

@Service
public class UserService {
	
	List<User> users = new ArrayList();
	private long max = 0;
	
	public List<User> getAll(){
		return users;
	}
	
	public User create(User user){
		user.setId(++max);
		users.add(user);
		return user;
	}
	
	public User getById(long id){
		for (User user: users){
			if(user.getId() == id)
				return user;
		}
		return null;
	}

	public boolean delete(long id){
		User user = getById(id);
		return users.remove(user);
	}
	
	public User update(User user){
		return user;
	}
}