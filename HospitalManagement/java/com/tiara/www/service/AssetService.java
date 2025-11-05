package com.tiara.www.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiara.www.model.Asset;
import com.tiara.www.repo.AssetRepo;

@Service
public class  AssetService {

    @Autowired
    private AssetRepo assetRepository;

  
    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

   
    public Asset getAssetById(Long id) {
        return assetRepository.findById(id).orElse(null);
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

   
    public Asset updateAsset(Long id, Asset asset) {
        Asset existing = getAssetById(id);
        if (existing != null) {
            existing.setName(asset.getName());
            existing.setType(asset.getType());
            existing.setDetails(asset.getDetails());
            existing.setStatus(asset.getStatus());
            return assetRepository.save(existing);
        }
        return null;
    }

    public void deleteAsset(Long id) {
        assetRepository.deleteById(id);
    }
}
