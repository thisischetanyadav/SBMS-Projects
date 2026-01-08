package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.Payment;
import com.kodewala.reposistory.PaymentRepository;
import com.kodewala.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment makePayment(Payment payment) {
        payment.setStatus("SUCCESS"); // simple simulation
        return paymentRepository.save(payment);
    }
}
