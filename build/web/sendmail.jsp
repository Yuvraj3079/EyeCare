<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.util.Properties"%>
<%
                     
                          Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session2 = Session.getInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("gtbemailtrial@gmail.com","GTBinstitute123");
				}
			});
		try {
			Message message = new MimeMessage(session2);
        message.addHeader("Content-type", "text/html; charset=UTF-8");
	message.setFrom(new InternetAddress("gtbemailtrial@gmail.com"));
	message.setRecipients(Message.RecipientType.TO,	InternetAddress.parse("gtbemailtrial@gmail.com"));
	message.setSubject(request.getParameter("subject"));
       
        message.setText("Name : " + request.getParameter("name") + "\nPhone:" + request.getParameter("phone")+ "\nEmail:" + request.getParameter("email")+ "\nMessage :" + request.getParameter("message"));




			Transport.send(message);
                        out.print("Mail sent Successfully");


		}
                catch (MessagingException e)
                {
			throw new RuntimeException(e);
		}


                   
                        
                        
                     %>