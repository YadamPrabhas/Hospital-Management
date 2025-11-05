package com.tiara.www.controller;

import com.tiara.www.model.Bill;
import com.tiara.www.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
@CrossOrigin(value = "http://localhost:3000")

public class BillingController {

    @Autowired
    private BillService billService;

    @PostMapping("/bills")
    public Bill createBill(@RequestBody Bill bill) {
        return billService.saveBill(bill);
    }
    @GetMapping("/billall")
    public List<Bill> getAllBills() {
        return billService.getAllBills();
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        return billService.getBillById(id);
    }

   

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable Long id, @RequestBody Bill bill) {
        return billService.updateBill(id, bill);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        billService.deleteBill(id);
    }
}
