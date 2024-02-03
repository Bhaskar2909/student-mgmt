package com.Bhaskar.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {
	
	@Autowired
	private JavaMailSender mailsender;

	public boolean sendEmail(String to,String body,String sub) {
		
		boolean isSent=false;
		
		try{
			
		MimeMessage mimemessage=mailsender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage);
		String subject = null;
		helper.setSubject(subject);
		helper.setText(body,true);
		helper.setTo(to);
		
		mailsender.send(mimemessage);
		isSent=true;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSent;
	}
}
