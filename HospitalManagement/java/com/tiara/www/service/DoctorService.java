package com.tiara.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiara.www.model.Doctor;
import com.tiara.www.repo.DoctorRepo;

@Service
public class DoctorService{

    @Autowired
    private DoctorRepo doctorRepository;

  
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

  
    public Doctor updateDoctor(Long id, Doctor doctor) {
        Doctor existing = getDoctorById(id);
        if (existing != null) {
            existing.setName(doctor.getName());
            existing.setSpecialization(doctor.getSpecialization());
            existing.setContact(doctor.getContact());
            existing.setEmail(doctor.getEmail());
            existing.setRoomNumber(doctor.getRoomNumber());
            return doctorRepository.save(existing);
        }
        return null;
    }

   
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}
