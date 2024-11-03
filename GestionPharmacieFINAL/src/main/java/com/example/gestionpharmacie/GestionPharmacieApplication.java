package com.example.gestionpharmacie;

import com.example.gestionpharmacie.Securite.Services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class GestionPharmacieApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionPharmacieApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(AccountService accountService){
        return args -> {
            accountService.createUser("admin","123","admin@gmail.com","123");
            accountService.createUser("client","123","client@gmail.com","123");
            accountService.createUser("personnel","123","personnel@gmail.com","123");
            accountService.createrole("ADMIN");
            accountService.createrole("PERSONNEL");
            accountService.createrole("USER");
            accountService.addRoletoUser("admin","ADMIN");
            accountService.addRoletoUser("admin","USER");
            accountService.addRoletoUser("client","USER");
            accountService.addRoletoUser("personnel","PERSONNEL");
            accountService.addRoletoUser("personnel","USER");
            accountService.removeRolefromUser("admin","USER");
            System.out.println(accountService.loadUserByUserName("personnel").getEmail());
           accountService.createUser("fati","fati","fati@gmail.com","fati");
            accountService.addRoletoUser("fati","ADMIN");
        System.out.println(accountService.loadUserByUserName("fati").getUserName());
        System.out.println(accountService.loadUserByUserName("fati").getPassword());
        System.out.println(accountService.loadUserByUserName("fati").getUserId());

        };
    }
}
