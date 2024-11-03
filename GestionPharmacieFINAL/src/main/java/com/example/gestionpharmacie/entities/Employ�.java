package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "employe_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employé {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String nom;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String prenom;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    @Column(unique = true)
    @Email
    private String mail;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    private String tel;
    @NotBlank(message = "REMPLIT TOUS LES CHAMPS")
    @Column(unique = true)
    private String cin;
    @ManyToOne
    private Pharmacie pharmacie;


}
