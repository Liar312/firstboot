package ru.victor.springmvc.firstboot.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.victor.springmvc.firstboot.rest.simple.WithExceptionHandler.models.ErrorDetails;
import ru.victor.springmvc.firstboot.rest.simple.WithExceptionHandler.models.NotEnoughMoneyException;
import ru.victor.springmvc.firstboot.rest.simple.WithExceptionHandler.models.PaymentDetails;
import ru.victor.springmvc.firstboot.services.PaymentService;

@RestController
public class PaymentController {

    private final PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    @GetMapping("/payment")
    public ResponseEntity<?> makePayment(){
        try{
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        }
        catch (NotEnoughMoneyException e) {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment");
            return ResponseEntity
                    .badRequest()
                    .body(errorDetails);
        }
    }
}
