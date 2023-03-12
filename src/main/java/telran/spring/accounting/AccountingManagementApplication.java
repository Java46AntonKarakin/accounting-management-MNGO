package telran.spring.accounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class AccountingManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountingManagementApplication.class, args);
	}

}
