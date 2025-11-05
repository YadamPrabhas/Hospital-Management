package com.tiara.www.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiara.www.model.Nurse;
import com.tiara.www.repo.NurseRepo;

@Service
public class  NurseService {

    @Autowired
    private NurseRepo nurseRepository;

    
    public Nurse addNurse(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    
    public Nurse getNurseById(Long id) {
        return nurseRepository.findById(id).orElse(null);
    }

   
    public List<Nurse> getAllNurses() {
        return nurseRepository.findAll();
    }

  
    public Nurse updateNurse(Long id, Nurse nurse) {
        Nurse existing = getNurseById(id);
        if (existing != null) {
            existing.setName(nurse.getName());
            existing.setDepartment(nurse.getDepartment());
            existing.setContact(nurse.getContact());
            existing.setShiftTime(nurse.getShiftTime());
            return nurseRepository.save(existing);
        }
        return null;
    }

 
    public void deleteNurse(Long id) {
        nurseRepository.deleteById(id);
    }
}
