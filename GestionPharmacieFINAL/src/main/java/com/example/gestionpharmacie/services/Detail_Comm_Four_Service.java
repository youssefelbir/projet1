package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.DetailCommandeFour;
import com.example.gestionpharmacie.repositories.DetailCommandeFourRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Detail_Comm_Four_Service {
    DetailCommandeFour Save_Detail_Comm_Four(DetailCommandeFour detailcommfour);
    DetailCommandeFour Update_Detail_Comm_Four(DetailCommandeFour detailcommfour);
    void Deletedetailcommfourbyid(Long id);
    void Deletealldetailcommfour(Long id);
    DetailCommandeFour Getdetailcommfourbyid(Long id);
    List<DetailCommandeFour> Getalldetailcommfour();
}
