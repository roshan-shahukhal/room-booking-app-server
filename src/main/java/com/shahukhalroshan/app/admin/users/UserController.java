package com.shahukhalroshan.app.admin.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahukhalroshan.app.dto.ResponseDTO;

@RestController
@RequestMapping("/room-booking/admin")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<ResponseDTO> getUsers() {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setData(this.userService.getAllUsers());
		
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}

}
