package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Livreur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "ERROR FIRSTNAME")
    private String firstname;
    private String lastname;
    @NotBlank(message = "ERROR EMAIL")
    private String email;
    private String address;
    @NotBlank(message = "ERROR TELEPHONE")
    private String telephone;
    @NotBlank(message = "ERROR ZONE")
    private String zone;
    @OneToMany(mappedBy = "Livreur" , fetch = FetchType.LAZY)
    private List<CommandeC> CommandeC =new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<com.example.gestionpharmacie.entities.CommandeC> getCommandeC() {
        return CommandeC;
    }

    public void setCommandeC(List<com.example.gestionpharmacie.entities.CommandeC> commandeC) {
        CommandeC = commandeC;
    }
}

