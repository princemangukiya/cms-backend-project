package com.college.cms.service;

import com.college.cms.entity.Payment;

import java.util.List;

public interface PaymentService {

    // Save Payment
    Payment savePayment(Payment payment);

    // Get All Payments
    List<Payment> getAllPayments();

    // Get Payment By ID
    Payment getPaymentById(Integer paymentId);

    // Update Payment
    Payment updatePayment(Integer paymentId, Payment payment);

    // Delete Payment
    void deletePayment(Integer paymentId);

}