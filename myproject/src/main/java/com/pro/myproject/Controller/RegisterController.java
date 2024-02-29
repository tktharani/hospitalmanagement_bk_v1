package com.pro.myproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pro.myproject.Model.Register;
import com.pro.myproject.Repo.RegisterRepo;

@RestController
@RequestMapping("/registers")

public class RegisterController {
	
	@Autowired
	private RegisterRepo registerRepo;
	
	@PostMapping("/add")
	public ResponseEntity<?> addRegister(@RequestBody Register register){
		Register savedEntity =registerRepo.saveAndFlush(register);
		return ResponseEntity.status(HttpStatus.OK)
				.body(register);	
	}
	@GetMapping("/check")
	public ResponseEntity<?> RegisterId(@RequestParam String username,@RequestParam String password){
		List<Register> register= registerRepo.findBy(username, password);
		return ResponseEntity.status(HttpStatus.OK)
				.body(register);	
	}

}
