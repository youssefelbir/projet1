package com.example.gestionpharmacie.Securite.Services;

import com.example.gestionpharmacie.Securite.Entities.Role;
import com.example.gestionpharmacie.Securite.Entities.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailServiceImplementation implements UserDetailsService {
    private AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=accountService.loadUserByUserName(username);
        if(user==null)throw new UsernameNotFoundException("User Not Found");
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUserName())
                .password(user.getPassword())
                .roles(user.getRoles().stream().map(Role::getRole).toArray(String[]::new))
                .build();
    }
}
