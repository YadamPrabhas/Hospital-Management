package com.tiara.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiara.www.model.Nurse;

@Repository
public interface NurseRepo extends JpaRepository<Nurse,Long> {

}
