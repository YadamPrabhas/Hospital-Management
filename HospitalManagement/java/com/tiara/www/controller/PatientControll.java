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

import com.tiara.www.model.Patients;
import com.tiara.www.service.PatientService;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/patients")
public class PatientControll {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    public Patients addPatient(@RequestBody Patients patient) {
        return patientService.addPatient(patient);
    }
    @GetMapping("/patall")
    public List<Patients> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patients getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    
    @PutMapping("/{id}")
    public Patients updatePatient(@PathVariable Long id, @RequestBody Patients patient) {
        return patientService.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }
}
