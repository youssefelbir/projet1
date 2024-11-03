package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pharmacie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String nomPh;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String ville;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String zone;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    @Email
    private String mailPh;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String telPh;
    private boolean garde;
    @OneToMany(mappedBy = "pharmacie",fetch = FetchType.LAZY)
    private List<Employé>employés=new ArrayList<>();
    @OneToMany(mappedBy = "pharmacies" , fetch = FetchType.LAZY)
    //private List<DetailPharmacie> detailPharmacies =new ArrayList<>();
    Set<DetailPharmacie> detailPharmacieSet;



}
