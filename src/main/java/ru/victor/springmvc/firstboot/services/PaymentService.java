package ru.victor.springmvc.firstboot.services;

import org.springframework.stereotype.Service;
import ru.victor.springmvc.firstboot.rest.simple.WithExceptionHandler.models.NotEnoughMoneyException;
import ru.victor.springmvc.firstboot.rest.simple.WithExceptionHandler.models.PaymentDetails;

@Service

public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
