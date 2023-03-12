package telran.spring.accounting.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import telran.spring.accounting.model.Account;

@Getter
@Setter
@Document(collection = "accounts")
public class AccountEntity {
	
	@Id
	@Setter(AccessLevel.NONE)
	private String email;
	private String password;
	private LocalDateTime expiration;
	private boolean revoked;
	private String[] roles;

	public static AccountEntity of(Account accountDto) {
		AccountEntity account = new AccountEntity();
		account.password = accountDto.password;
		account.email = accountDto.username;
		account.revoked = false;
		account.roles = accountDto.roles;
		return account;
	}
}
