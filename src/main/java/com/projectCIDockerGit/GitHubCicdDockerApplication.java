package com.projectCIDockerGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCicdDockerApplication {
	       @GetMapping("/Welcom")
	public String welcome() {
		return "Welcome To GitHubProject"  ;
	}






	public static void main(String[] args) {
		SpringApplication.run(GitHubCicdDockerApplication.class, args);
		  

	}





}
