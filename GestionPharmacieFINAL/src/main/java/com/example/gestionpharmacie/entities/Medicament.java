package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String label;
    //@NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    @Min(value=10)
    @Max(value=200)
    private int stock;
    private int Dose;
    //@NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private double prix;
    @ManyToOne
    private MediBase mediBases;
    @OneToMany(mappedBy = "medicament" , fetch = FetchType.LAZY)
    //private List<DetailPharmacie> detailPharmacies =new ArrayList<>();
    Set<DetailPharmacie> detailPharmacieSet;
    @OneToMany(mappedBy = "medicaments" , fetch = FetchType.LAZY)
    private List<DetailCommandeC> detailCommandeClients =new ArrayList<>();
    @OneToMany(mappedBy = "medicamentt" , fetch = FetchType.LAZY)
    private List<DetailCommandeFour> detailCommandeFours =new ArrayList<>();




}
