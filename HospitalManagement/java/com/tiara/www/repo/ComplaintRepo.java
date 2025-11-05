package com.tiara.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiara.www.model.Complaints;

@Repository
public interface ComplaintRepo extends JpaRepository<Complaints,Long>  {

}
