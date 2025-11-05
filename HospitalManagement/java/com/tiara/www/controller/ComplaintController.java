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


import com.tiara.www.model.Complaints;
import com.tiara.www.service.ComplaintService;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(value = "http://localhost:3000")

public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @PostMapping("/com")
    public Complaints createComplaint(@RequestBody Complaints complaint) {
        return complaintService.createComplaint(complaint);
    }

    @GetMapping("/{id}")
    public Complaints getComplaintById(@PathVariable Long id) {
        return complaintService.getComplaintById(id);
    }

    @GetMapping("/comall")
    public List<Complaints> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @PutMapping("/{id}")
    public Complaints updateComplaint(@PathVariable Long id, @RequestBody Complaints complaint) {
        return complaintService.updateComplaint(id, complaint);
    }

    @DeleteMapping("/{id}")
    public void deleteComplaint(@PathVariable Long id) {
        complaintService.deleteComplaint(id);
    }
}
