package br.com.estudos.hrpayroll.service;

import org.springframework.stereotype.Service;

import br.com.estudos.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}