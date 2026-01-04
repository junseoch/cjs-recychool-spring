package com.app.recychool.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j

class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    @Transactional
    void completePayment() {
    }

    @Test
    void getReserve() {
    }
}