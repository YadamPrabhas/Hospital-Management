package com.tiara.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tiara.www.model.Complaints;
import com.tiara.www.repo.ComplaintRepo;

@Service
public class  ComplaintService {

    @Autowired
    private ComplaintRepo complaintRepository;

    public Complaints createComplaint(Complaints complaint) {
        return complaintRepository.save(complaint);
    }

    
    public Complaints getComplaintById(Long id) {
        return complaintRepository.findById(id).orElse(null);
    }

   
    public List<Complaints> getAllComplaints() {
        return complaintRepository.findAll();
    }

   
    public Complaints updateComplaint(Long id, Complaints complaint) {
        Complaints existing = getComplaintById(id);
        if (existing != null) {
            existing.setEmployee(complaint.getEmployee());
            existing.setTitle(complaint.getTitle());
            existing.setDescription(complaint.getDescription());
            existing.setStatus(complaint.getStatus());
            return complaintRepository.save(existing);
        }
        return null;
    }

    
    public void deleteComplaint(Long id) {
        complaintRepository.deleteById(id);
    }


	
}
