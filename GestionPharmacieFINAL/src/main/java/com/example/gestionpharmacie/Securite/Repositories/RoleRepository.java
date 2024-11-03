package com.example.gestionpharmacie.Securite.Repositories;

import com.example.gestionpharmacie.Securite.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByRole(String role);
}
