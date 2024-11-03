package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class DetailCommandeC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Getter

    private int Quantite;
    @Getter
    @ManyToOne
    private CommandeC commandeC;
    @Getter
    @ManyToOne
    private Medicament medicaments;

    public DetailCommandeC(int quantite,  Medicament medicaments) {
        this.Quantite = quantite;
        this.commandeC = commandeC;
        this.medicaments = medicaments;
    }

    public DetailCommandeC(int quantite, Medicament medicament, CommandeC commandeC) {
        this.Quantite = quantite;
        this.commandeC = commandeC;
        this.medicaments = medicaments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int quantite) {
        Quantite = quantite;
    }

    public CommandeC getCommandeC() {
        return commandeC;
    }

    public void setCommandeC(CommandeC commandeC) {
        this.commandeC = commandeC;
    }

    public Medicament getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Medicament medicaments) {
        this.medicaments = medicaments;
    }
}