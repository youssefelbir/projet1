package com.example.gestionpharmacie.Securite.Services;

import com.example.gestionpharmacie.Securite.Entities.Role;
import com.example.gestionpharmacie.Securite.Entities.User;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    User createUser(String username,String password,String email,String confirmpassword);
    Role createrole(String newRole);
    void addRoletoUser(String username,String newRole);
    void removeRolefromUser(String username,String newRole);
    User loadUserByUserName(String username);
}
