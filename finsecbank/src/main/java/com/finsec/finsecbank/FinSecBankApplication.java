package com.finsec.finsecbank;

import com.finsec.finsecbank.model.User;
import com.finsec.finsecbank.repository.UserRepository;
import com.finsec.finsecbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinSecBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinSecBankApplication.class, args);
	}

}
