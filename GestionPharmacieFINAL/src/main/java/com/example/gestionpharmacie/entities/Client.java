package com.example.gestionpharmacie.entities;

import jakarta.persistence.*;
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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private String address;
    @OneToMany(mappedBy = "Client" , fetch = FetchType.LAZY)
    private List<CommandeC> commandeClient =new ArrayList<>();
}
