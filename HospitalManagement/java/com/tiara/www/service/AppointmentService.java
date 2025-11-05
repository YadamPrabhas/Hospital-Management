package com.tiara.www.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiara.www.model.Appointment;
import com.tiara.www.repo.AppointmentRepo;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepository;

  
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }


    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

 
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        Appointment existing = getAppointmentById(id);
        if (existing != null) {
            existing.setDoctorId(appointment.getDoctorId());
            existing.setPatientId(appointment.getPatientId());
            existing.setAppointmentDate(appointment.getAppointmentDate());
            existing.setStatus(appointment.getStatus());
            return appointmentRepository.save(existing);
        }
        return null;
    }

  
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}

