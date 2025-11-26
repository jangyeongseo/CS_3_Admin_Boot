package admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import admin.security.crypto.EncryptionUtil;

@SpringBootApplication
public class CsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsApplication.class, args);

	}

}
