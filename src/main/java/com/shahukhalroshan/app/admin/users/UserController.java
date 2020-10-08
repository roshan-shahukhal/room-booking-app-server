package com.shahukhalroshan.app.admin.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahukhalroshan.app.dto.ResponseDTO;
import com.shahukhalroshan.app.model.User;

@RestController
@RequestMapping("/room-booking/admin")
public class UserController {
	
	@GetMapping("/users")
	public ResponseEntity<ResponseDTO> getUsers() {
		
		User user = new User(1, "Jenny Mills", "password");
		User user2 = new User(2, "James Doe", "password");
		
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user2);
			
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setData(users);
		
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
		
	}

}
