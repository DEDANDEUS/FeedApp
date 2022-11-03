package com.bptn;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FeedAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeedAppApplication.class, args);
		
	}
}






