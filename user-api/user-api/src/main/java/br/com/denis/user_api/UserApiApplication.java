package br.com.denis.user_api;

import br.com.denis.user_api.domain.User;
import br.com.denis.user_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		userRepository.saveAll(List.of(
				new User(null, "Denis Machado", "denis@machado.com", "123", 20.0),
				new User(null, "Jari Maenpaa", "Jari@machado.com", "123", 30.0)
		));
	}

}
