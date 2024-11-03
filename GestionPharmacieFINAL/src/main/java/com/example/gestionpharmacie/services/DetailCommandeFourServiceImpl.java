package com.example.gestionpharmacie.services;
import com.example.gestionpharmacie.entities.DetailCommandeFour;
import com.example.gestionpharmacie.repositories.DetailCommandeFourRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class DetailCommandeFourServiceImpl implements DetailCommandeFourService{
    private DetailCommandeFourRepository detailCommandeFourRepository;
    @Override
    public DetailCommandeFour Save_Detail_Comm_Four(DetailCommandeFour detailcommfour) {
        return detailCommandeFourRepository.save(detailcommfour);
    }

    @Override
    public DetailCommandeFour Update_Detail_Comm_Four(DetailCommandeFour detailcommfour) {
        return detailCommandeFourRepository.save(detailcommfour);
    }

    @Override
    public void Deletedetailcommfourbyid(Long id) {
        detailCommandeFourRepository.deleteById(id);

    }

    @Override
    public void Deletealldetailcommfour(Long id) {
        detailCommandeFourRepository.deleteAll();
    }

    @Override
    public DetailCommandeFour Getdetailcommfourbyid(Long id) {
        return detailCommandeFourRepository.findById(id).get();
    }

    @Override
    public List<DetailCommandeFour> Getalldetailcommfour() {
        return detailCommandeFourRepository.findAll();
    }
}
