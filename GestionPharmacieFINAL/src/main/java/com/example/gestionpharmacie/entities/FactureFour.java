package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FactureFour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double total;
    @OneToOne
    private CommandeFournisseur commandeFournisseur;
}
