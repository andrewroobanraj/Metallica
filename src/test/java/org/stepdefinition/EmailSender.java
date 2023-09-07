package org.stepdefinition;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

	public static void main(String[] args) {
		final String username = "andrewroobanrajs@unitedtechno.com";
		final String appPassword = "uuqdusfkuwcvissd";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, appPassword);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("andrewroobanrajs@unitedtechno.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("andrewroobanraaj@gmail.com"));
			message.setSubject("Test Automation Report");

			// Create the email body with report link or attachment
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("Please find the attached report.");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);

			messageBodyPart = new MimeBodyPart();
			String filename = "C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\AllReports\\JVMReport\\cucumber-html-reports\\overview-tags.html";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName("Regression report.html");
			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			Transport.send(message);

			System.out.println("Email sent successfully!");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
