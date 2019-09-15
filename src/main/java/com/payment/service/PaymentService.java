package com.payment.service;

import com.payment.model.Payment;
import java.util.List;
import java.util.Optional;

public interface PaymentService {

    public List<Payment> getPaymentList();

    public Optional<Payment> getPaymentById(Integer id);

    public Payment addPayment(Payment payment);

    public Payment updatePayment(Payment payment);

    public void deletePayment(Payment payment);

}
