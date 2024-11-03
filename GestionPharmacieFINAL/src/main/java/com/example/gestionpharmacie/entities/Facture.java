package com.example.gestionpharmacie.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Facture {
    @Id

    private String idFacture;
    private String prix;
    @OneToOne
    private CommandeC CommandeC;
}
