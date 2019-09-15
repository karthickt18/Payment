package com.payment.controller;

import com.payment.model.Payment;
import com.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;

    @RequestMapping(value = "/getPayment", method = RequestMethod.GET)
    public List<Payment> getPaymentList(){
        return paymentService.getPaymentList();
    }

    @RequestMapping(value = "/getPaymentById/{id}", method = RequestMethod.GET)
    public Optional<Payment> getPaymentById(@PathVariable Integer id){
        return paymentService.getPaymentById(id);
    }

    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.addPayment(payment);
    }

    @RequestMapping(value = "/updatePayment", method = RequestMethod.PUT)
    public Payment updatePayment(@RequestBody Payment payment){
        return paymentService.updatePayment(payment);
    }

    @RequestMapping(value = "/deletePayment", method = RequestMethod.DELETE)
    public void deletePayment(@RequestBody Payment payment){
        paymentService.deletePayment(payment);
    }

}
