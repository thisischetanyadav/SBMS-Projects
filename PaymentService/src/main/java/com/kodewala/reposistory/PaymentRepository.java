package com.kodewala.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kodewala.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
