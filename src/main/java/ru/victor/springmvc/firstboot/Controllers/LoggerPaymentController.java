package ru.victor.springmvc.firstboot.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.victor.springmvc.firstboot.models.Payment;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class LoggerPaymentController {
    private static Logger logger = Logger.getLogger(PaymentController.class.getName()); // здесь мы заводим логер котрый будет собирать инфу по каким либ событиям
    @PostMapping("/payment_1")
    public ResponseEntity<Payment> createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment){
        logger.info("Received with id" + " "+ requestId + ";" + "Payment amount:"+ " " + payment);
        payment.setId(UUID.randomUUID().toString());//устанавливаем рандомный id и возвращаем его стринг значением

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(payment);
    }
}