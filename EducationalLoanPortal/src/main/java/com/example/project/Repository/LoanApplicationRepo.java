package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.LoanApplicationModel;
@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
