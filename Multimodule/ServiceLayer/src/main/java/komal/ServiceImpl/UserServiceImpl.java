package komal.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import komal.Repository.UserRepo;
import komal.Service.UserService;
import komal.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
		
		User newUser = new User();
		newUser.setEmail(user.getEmail());
		newUser.setName(user.getName());
		User user1  = userRepo.save(newUser);
		return user1;
	}

}
