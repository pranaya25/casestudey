package com.example.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersRepo usersRepo;
	
	@RequestMapping("/getall")
	public List<UserInfo> getUsers() {
		return (List<UserInfo>) usersRepo.findAll();
		
//		return Collections.singletonList(
//				
//				new UserInfo("pranaya","tayota","npr@gmail","ap123"));
	}

	@PostMapping("/adduser")
	public String saveadmin(@RequestBody UserInfo user)
	{
		usersRepo.save(user);
		return " user saved successfully with id :"+user.getName();
	}
	
	@GetMapping("/alluser")
	public List<UserInfo> getuser()
	{
		return usersRepo.findAll();
	}
	@PutMapping("/edit") 
	public String saveuser(@RequestBody UserInfo user)
	{
		List<UserInfo> users =  usersRepo.findAll();
		for(var u : users) {
			if(u.getId().equals(user.getId())) {
				usersRepo.save(user);
				return " user saved successfully :"+user.getId();
			}
		}

		return "No records matced with id "+user.getId();
	
}
}
