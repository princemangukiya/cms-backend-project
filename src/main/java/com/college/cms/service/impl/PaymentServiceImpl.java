package com.college.cms.service.impl;

import com.college.cms.entity.Payment;
import com.college.cms.repository.PaymentRepository;
import com.college.cms.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Integer paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }

    @Override
    public Payment updatePayment(Integer paymentId, Payment payment) {

        Payment existingPayment = paymentRepository.findById(paymentId).orElse(null);

        if (existingPayment != null) {

            existingPayment.setFeeId(payment.getFeeId());
            existingPayment.setStudentId(payment.getStudentId());
            existingPayment.setPaidAmount(payment.getPaidAmount());
            existingPayment.setDate(payment.getDate());
            existingPayment.setPaymentMode(payment.getPaymentMode());
            existingPayment.setTransactionId(payment.getTransactionId());
            existingPayment.setStatus(payment.getStatus());

            return paymentRepository.save(existingPayment);
        }

        return null;
    }

    @Override
    public void deletePayment(Integer paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}