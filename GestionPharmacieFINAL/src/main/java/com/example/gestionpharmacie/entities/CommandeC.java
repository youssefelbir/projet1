package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CommandeC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommande;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCommande;
    @NotBlank(message = "ERROR ADRESSELIV")
    private String adresseLiv;
    @OneToMany(mappedBy = "commandeC")
    private List<DetailCommandeC> DetailCommandeC;
    @ManyToOne
    private Client Client;
    @ManyToOne
    private Livreur Livreur;
    @OneToOne
    private Facture Facture;

    @Override
    public String toString() {
        return "CommandeC{" +
                "idCommande=" + idCommande +
                ", dateCommande=" + dateCommande +
                ", adresseLiv='" + adresseLiv + '\'' +
                ", Client=" + Client +
                ", Livreur=" + Livreur +
                ", Facture=" + Facture +
                '}';
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getAdresseLiv() {
        return adresseLiv;
    }

    public void setAdresseLiv(String adresseLiv) {
        this.adresseLiv = adresseLiv;
    }

    public List<com.example.gestionpharmacie.entities.DetailCommandeC> getDetailCommandeC() {
        return DetailCommandeC;
    }

    public void setDetailCommandeC(List<com.example.gestionpharmacie.entities.DetailCommandeC> detailCommandeC) {
        DetailCommandeC = detailCommandeC;
    }

    public com.example.gestionpharmacie.entities.Client getClient() {
        return Client;
    }

    public void setClient(com.example.gestionpharmacie.entities.Client client) {
        Client = client;
    }

    public com.example.gestionpharmacie.entities.Livreur getLivreur() {
        return Livreur;
    }

    public void setLivreur(com.example.gestionpharmacie.entities.Livreur livreur) {
        Livreur = livreur;
    }

    public com.example.gestionpharmacie.entities.Facture getFacture() {
        return Facture;
    }

    public void setFacture(com.example.gestionpharmacie.entities.Facture facture) {
        Facture = facture;
    }
}
