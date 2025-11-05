package com.tiara.www.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiara.www.model.Asset;
import com.tiara.www.service.AssetService;

@RestController
@RequestMapping("/api/assets")
@CrossOrigin(value = "http://localhost:3000")

public class AssetController {

    @Autowired
    private AssetService assetService;

    @PostMapping("/asset")
    public Asset createAsset(@RequestBody Asset asset) {
        return assetService.createAsset(asset);
    }

    @GetMapping("/assetAll")
    public List<Asset> getAllAssets() {
        return assetService.getAllAssets();
    }
    
    @GetMapping("/{id}")
    public Asset getAsset(@PathVariable Long id) {
        return assetService.getAssetById(id);
    }

   

    @PutMapping("/{id}")
    public Asset updateAsset(@PathVariable Long id, @RequestBody Asset asset) {
        return assetService.updateAsset(id, asset);
    }

    @DeleteMapping("/{id}")
    public void deleteAsset(@PathVariable Long id) {
        assetService.deleteAsset(id);
    }
}
