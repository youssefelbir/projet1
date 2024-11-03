package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("personnel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personnel extends Employé {
    private String service;
}
