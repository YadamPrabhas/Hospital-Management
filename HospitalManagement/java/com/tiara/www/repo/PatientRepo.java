package com.tiara.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiara.www.model.Patients;

@Repository
public interface PatientRepo extends JpaRepository<Patients,Long> {

}
