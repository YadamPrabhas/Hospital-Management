package com.tiara.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiara.www.model.Asset;

@Repository
public interface AssetRepo extends JpaRepository<Asset,Long> {

}
