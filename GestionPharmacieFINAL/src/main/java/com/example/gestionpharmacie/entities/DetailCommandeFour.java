package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetailCommandeFour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double Quantité;
    @ManyToOne
    private CommandeFournisseur commandeFour;
    @ManyToOne
    private Medicament medicamentt ;

    public DetailCommandeFour(double quantité, Medicament medicament, CommandeFournisseur commandeFournisseur) {
        Quantité=quantité;
        commandeFour=commandeFournisseur;
        medicamentt=medicament;
    }

    public DetailCommandeFour() {

    }
}
