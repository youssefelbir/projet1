package com.example.gestionpharmacie.Securite.Services;

import com.example.gestionpharmacie.Securite.Entities.Role;
import com.example.gestionpharmacie.Securite.Entities.User;
import com.example.gestionpharmacie.Securite.Repositories.RoleRepository;
import com.example.gestionpharmacie.Securite.Repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class AccountServiceImplementtion implements AccountService {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public User createUser(String username, String password, String email, String confirmpassword) {
        /*User user1 = new User();
        user1.setUserId(UUID.randomUUID().toString());
        user1.setUserName(username);
        user1.setPassword(bCryptPasswordEncoder.encode(password));
        user1.setEmail(email);
        userRepository.save(user1);*/

        User user1=userRepository.findByUserName(username);
        if (user1 !=null) throw new RuntimeException("User Already Exists");
        if(!password.equals(confirmpassword)) throw new RuntimeException("Passwords Do Not Match");
        user1=User.builder()
                .userId(UUID.randomUUID().toString())
                .userName(username)
                .password(bCryptPasswordEncoder.encode(password))
                .email(email)
                .build();
        return userRepository.save(user1);

    }

    @Override
    public Role createrole(String newRole) {
        Role role1=roleRepository.findByRole(newRole);
        if(role1!=null)throw new RuntimeException("Role Already Exist");
        role1=Role.builder()
                .role(newRole)
                .build();
        return roleRepository.save(role1);
    }

    @Override
    public void addRoletoUser(String username, String newRole) {
        User user1=userRepository.findByUserName(username);
        Role role1=roleRepository.findByRole(newRole);
        user1.getRoles().add(role1);

    }

    @Override
    public void removeRolefromUser(String username, String newRole) {
        User user1=userRepository.findByUserName(username);
        Role role1=roleRepository.findByRole(newRole);
        user1.getRoles().remove(role1);
    }

    @Override
    public User loadUserByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
