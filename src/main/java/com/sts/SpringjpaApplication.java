package com.sts;

 
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sts.dao.UserRepo;
import com.sts.model.User;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringjpaApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		
//		-- create 
		/*
		 * User user1 = new User(); user1.setName("Pial"); user1.setCity("Dhaka");
		 * user1.setStatus("I am pial");
		 * 
		 * User res1 = userRepo.save(user1);
		 * 
		 * 
		 * User user2 = new User(); user2.setName("Ehashan"); user2.setCity("Dinajpur");
		 * user2.setStatus("I am ehashan");
		 * 
		 * User res2 = userRepo.save(user2);
		 * 
		 * 
		 * List<User> users = List.of(user1,user2); Iterable<User> result =
		 * userRepo.saveAll(users);
		 */
		
		/*
		 * result.forEach(user->{ System.out.println(user); }) ;
		 */
		
		// update user id with 53
		/*
		 * Optional<User> optional = userRepo.findById(53); User user = optional.get();
		 * System.out.println(user);
		 * 
		 * user.setName("Ehashan Ahmed") ; user = userRepo.save(user) ;
		 * System.out.println(user);
		 */
		
		// how to get the data 
		// findById(id) -- return Optional Containing data
		// findAll() ;
		
		Iterable<User> itr = userRepo.findAll();
		/*
		 * Iterator<User> iterator = itr.iterator();
		 * 
		 * while(iterator.hasNext()) { System.out.println(iterator.next()); }
		 */
		
		/*
		 * itr.forEach(new Consumer<User>() {
		 * 
		 * @Override public void accept(User t) { System.out.println(t); }
		 * 
		 * });
		 */
		
		/*
		 * itr.forEach(user->{ System.out.println(user); }) ;
		 */
		
		//----------- Delete ----------- //
		/*
		 * userRepo.deleteById(52); System.out.println("deleted");
		 */
		
		/*
		 * Iterable<User> allUsers = userRepo.findAll(); userRepo.deleteAll(allUsers);
		 */
		
		
		// -------- custom finder method // 
		/*
		 * List<User> users = userRepo.findByName("Ehashan Ahmed") ;
		 * users.forEach(user-> { System.out.println(user); }) ;
		 */
//		
//		List<User> users = userRepo.findByNameAndCity("Subah", "Khulna");
//		users.forEach(user-> { System.out.println(user); }) ;
		
		List<User> usersByName = userRepo.getUserByName("Subah");
		usersByName.forEach(e-> { System.out.println(e); }) ;
		
		
	}

}
