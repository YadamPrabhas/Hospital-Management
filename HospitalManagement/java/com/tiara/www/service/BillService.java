package com.tiara.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiara.www.model.Bill;
import com.tiara.www.repo.BillRepository;

@Service
public class  BillService {

    @Autowired
    private BillRepository billRepository;

   
    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }


    public Bill getBillById(Long id) {
        return billRepository.findById(id).orElse(null);
    }

  
    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

   
    public Bill updateBill(Long id, Bill bill) {
        Bill existing = billRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setPatientId(bill.getPatientId());
            existing.setServices(bill.getServices());
            existing.setTotalAmount(bill.getTotalAmount());
            existing.setPaymentStatus(bill.getPaymentStatus());
            return billRepository.save(existing);
        }
        return null;
    }

   
    public void deleteBill(Long id) {
        billRepository.deleteById(id);
    }
}
