package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("gerant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gérant extends Employé {
    private String role;
    private int bonus;
}

