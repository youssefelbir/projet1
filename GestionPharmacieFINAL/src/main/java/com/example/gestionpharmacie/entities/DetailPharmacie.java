package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
public class DetailPharmacie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double quantite;

    @ManyToOne
    private Medicament medicament;

    @ManyToOne
    private Pharmacie pharmacies ;

    public DetailPharmacie(double quantite, Medicament medicament,Pharmacie pharmacie) {
        this.quantite=quantite;
        this.medicament=medicament;
        this.pharmacies=pharmacie;
    }


    public DetailPharmacie() {

    }
}
