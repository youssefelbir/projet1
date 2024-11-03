package com.example.gestionpharmacie.Securite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(authCustomizer -> authCustomizer
                                .requestMatchers("/ClientsList", "/ajoutDetailPharmacie",
                                        "/saveDetailPharmacie","/deleteDetailPharmacie","/editdetailpharmacie",
                                        "/updateDetailPharmacie","/ajoutEmploye","/newEmploye","/listeemployes","/deleteEmploye",
                                        "/editEmploye","/updateEmploye","/CreateFacture","/saveFacture","/FactureList","/deleteFacture",
                                        "/EditFacture","/updateFacture","/CreateLivreur","/saveLivreur","/LivreurList","/deleteLivreur",
                                        "/EditLivreur","/updateLivreur","/ajoutMediBase","newMediBase","/deleteMediBase",
                                        "/editMediBase","/updateMediBase","/ajoutMedicament","newMedicament",
                                        "/deleteMedicament","/editMedicament","/updateMedicament","/ajoutPharmacie","/newPharmacie",
                                        "/deletePharmacie","/editPharmacie","/updatePharmacie","/ajoutCommandeFour", "/newCommandeFour",
                                        "/listecommandefour", "/deleteCommandeFour", "/editCommandeFour", "/updateCommandeFour",
                                        "/ajoutDetailCommandeFour", "/saveDetailCommandeFour", "/listeDetailCommandeFour",
                                        "/deleteDetailCommandeFour", "/ajoutFactureFour", "/newFactureFour", "/ListeFactureFour",
                                        "/deleteFactureFour", "/editFactureFour", "/updateFactureFour", "/ajoutGerant",
                                         "/deleteGerant", "/editGerant", "/updateGerant", "/ajoutPersonnel",
                                         "/deletePersonnel", "/editPersonnel", "/UpdatePersonnel").hasAnyRole("ADMIN","PERSONNEL")
                                .requestMatchers("/login","/webjars/**","/","/listegerant","/listepersonnel","/CreateClient","saveClient","/deleteClient","/EditClient","/updateClient","/CreateCommandeC","saveCommandeC","/CommandeCList","/deleteCommandeC","/EditCommandeC",
                                        "/updateCommandeC","/CreateDetailCommandeC","saveDetailCommandeC","/DetailCommandeCList", "/deleteDetailCommandeC","/EditDetailCommandeC","/updateDetailCommandeC","/pharmaciesliste","/listemedibase","/listemedicaments","/listeDetailPharmacie","/").permitAll()
                                .anyRequest().authenticated()


                )
                /*.formLogin(
                        formLogin -> formLogin
                                .loginPage("/login")
                                .defaultSuccessUrl("/")
                                .failureUrl("/login?error=true")
                )*/
                .exceptionHandling(e -> e.accessDeniedPage("/accessDenied"))
                .build();


    }
    //@Bean
    /*public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(
                User.withUsername("gerant").password(bCryptPasswordEncoder().encode("123")).roles("ADMIN").build(),
                User.withUsername("personnel").password(bCryptPasswordEncoder().encode("123")).roles("PERSONNEL").build(),
                User.withUsername("client").password(bCryptPasswordEncoder().encode("123")).roles("USER").build(),
                User.withUsername("user").password(bCryptPasswordEncoder().encode("123")).roles("USER").build()
        );
    }*/
}