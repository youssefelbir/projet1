package com.example.gestionpharmacie.Securite.Repositories;

import com.example.gestionpharmacie.Securite.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String > {
    User findByUserName(String username);
}
