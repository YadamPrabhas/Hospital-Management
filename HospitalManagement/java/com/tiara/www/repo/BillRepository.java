package com.tiara.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiara.www.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
}
