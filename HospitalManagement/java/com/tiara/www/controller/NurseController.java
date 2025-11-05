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

import com.tiara.www.model.Nurse;
import com.tiara.www.service.NurseService;

@RestController
@RequestMapping("/api/nurses")
@CrossOrigin(origins = "*")
public class NurseController {

    @Autowired
    private NurseService nurseService;

    @PostMapping("nurse")
    public Nurse createNurse(@RequestBody Nurse nurse) {
        return nurseService.addNurse(nurse);
    }

    @GetMapping("/{id}")
    public Nurse getNurse(@PathVariable Long id) {
        return nurseService.getNurseById(id);
    }

    @GetMapping("/nurseall")
    public List<Nurse> getAllNurses() {
        return nurseService.getAllNurses();
    }

    @PutMapping("/{id}")
    public Nurse updateNurse(@PathVariable Long id, @RequestBody Nurse nurse) {
        return nurseService.updateNurse(id, nurse);
    }

    @DeleteMapping("/{id}")
    public void deleteNurse(@PathVariable Long id) {
        nurseService.deleteNurse(id);
    }
}
