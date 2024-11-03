package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.DetailCommandeFour;
import com.example.gestionpharmacie.repositories.CommandeFournisseurRepository;
import com.example.gestionpharmacie.repositories.DetailCommandeFourRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class Detail_Comm_Four_Service_Impl implements Detail_Comm_Four_Service{
    private DetailCommandeFourRepository detailCommandeFourRepository;
    @Override
    public DetailCommandeFour Save_Detail_Comm_Four(DetailCommandeFour detailcommfour) {
        return detailCommandeFourRepository.save(detailcommfour);
    }

    @Override
    public DetailCommandeFour Update_Detail_Comm_Four(DetailCommandeFour detailcommfour) {
        return null;
    }

    @Override
    public void Deletedetailcommfourbyid(Long id) {

    }

    @Override
    public void Deletealldetailcommfour(Long id) {

    }

    @Override
    public DetailCommandeFour Getdetailcommfourbyid(Long id) {
        return null;
    }

    @Override
    public List<DetailCommandeFour> Getalldetailcommfour() {
        return null;
    }
}
