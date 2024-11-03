package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MediBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String nom;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    @Column(columnDefinition = "TEXT")
    private String description;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    @Column(columnDefinition = "TEXT")
    private String recommandation;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    @Column(columnDefinition = "TEXT")
    private String alerte;
    @OneToMany
    private List<Medicament>medic=new ArrayList<>();

}
