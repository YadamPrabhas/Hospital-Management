package com.tiara.www.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiara.www.model.Patients;
import com.tiara.www.repo.PatientRepo;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepository;

    public List<Patients> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patients getPatientById(Long id) {
        Optional<Patients> patient = patientRepository.findById(id);
        return patient.orElse(null);
    }

    public Patients addPatient(Patients patient) {
        return patientRepository.save(patient);
    }

    public Patients updatePatient(Long id, Patients updatedPatient) {
        Patients existing = patientRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedPatient.getName());
            existing.setGender(updatedPatient.getGender());
            existing.setDob(updatedPatient.getDob());
            existing.setContact(updatedPatient.getContact());
            existing.setAddress(updatedPatient.getAddress());
            return patientRepository.save(existing);
        }
        return null;
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
