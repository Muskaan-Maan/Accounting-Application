package com.dxc.userservice.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	private final JavaMailSender mailSender;

	public EmailSenderService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendConfirmationEmail(String toEmail, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("alchemyaccouting@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		mailSender.send(message);
	}
}
