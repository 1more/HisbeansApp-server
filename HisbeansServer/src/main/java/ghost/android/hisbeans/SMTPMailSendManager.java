package ghost.android.hisbeans;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author Hyeonwook Kim
 * @email khw0867@gmail.com
 * @classname SMTPMailSendManager.java
 * @package ghost.android.hisbeans
 * @date 2012. 10. 28.
 * @purpose : Send e-mail with SMTP protocol can modify e-mail address in
 *          GlobalVariables.java file
 * 
 * @comment :
 * 
 */

public class SMTPMailSendManager {
	private static final String emailHost = GlobalVariables.ADMIN_EMAIL_HOST;
	private static final String emailId = GlobalVariables.ADMIN_EMAIL_ID;
	private static final String emailPw = GlobalVariables.ADMIN_EMAIL_PASSWORD;

	public void sendEmail(String from, String to, String subject, String content) {
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", emailHost);
		props.put("mail.smtp.auth", "true");
		EmailAuthenticator authenticator = new EmailAuthenticator(emailId,
				emailPw);

		Session session = Session.getInstance(props, authenticator);

		try {
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));

			msg.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));

			msg.setSubject(subject);
			msg.setContent(content, "text/html; charset=EUC-KR");
			msg.setSentDate(new Date());
			Transport.send(msg);

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	class EmailAuthenticator extends Authenticator {
		private String id;
		private String pw;

		public EmailAuthenticator(String id, String pw) {
			this.id = id;
			this.pw = pw;
		}

		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(id, pw);
		}
	}
}
