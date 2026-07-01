package com.college.cms.controller;

import com.college.cms.entity.Payment;
import com.college.cms.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Save Payment
    @PostMapping
    public Payment savePayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }

    // Get All Payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Get Payment By ID
    @GetMapping("/{paymentId}")
    public Payment getPaymentById(@PathVariable Integer paymentId) {
        return paymentService.getPaymentById(paymentId);
    }

    // Update Payment
    @PutMapping("/{paymentId}")
    public Payment updatePayment(@PathVariable Integer paymentId,
                                 @RequestBody Payment payment) {

        return paymentService.updatePayment(paymentId, payment);
    }

    // Delete Payment
    @DeleteMapping("/{paymentId}")
    public String deletePayment(@PathVariable Integer paymentId) {

        paymentService.deletePayment(paymentId);

        return "Payment Deleted Successfully";
    }
}