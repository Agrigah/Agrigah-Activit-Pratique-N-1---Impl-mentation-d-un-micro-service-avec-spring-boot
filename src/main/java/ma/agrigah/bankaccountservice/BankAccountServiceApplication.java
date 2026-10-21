package ma.agrigah.bankaccountservice;

import ma.agrigah.bankaccountservice.entities.BankAccount;
import ma.agrigah.bankaccountservice.enums.AccountType;
import ma.agrigah.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository){
        return  args -> {
            for(int i = 0 ; i<=10 ;i++){
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .balance(Math.random()*10000)
                        .createdAt(new java.util.Date())
                        .accountType(Math.random()>0.5? AccountType.CURRENT_ACCOUNT: AccountType.SAVING_ACCOUNT)
                        .currency("MAD")
                        .build();

                bankAccountRepository.save(bankAccount);
            }
        };

    }

}

