package com.ecommerce.backend.Services;
import com.ecommerce.backend.Utils.ResponseMessage;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServices {

    @Autowired
    private JavaMailSender emailSender;

    public ResponseMessage contactUs(String toEmail,String name,String subject,String mesage) throws MessagingException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        String htmlMsg = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>dmc weekend - India's Premier Digital Art Fest</title>\n" +
                "    <style>\n" +
                "      \n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f2f2f2;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 0 auto;\n" +
                "            padding: 20px;\n" +
                "            background-color: #ffffff;\n" +
                "            border-radius: 10px;\n" +
                "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n" +
                "        }\n" +
                "\n" +
                "        .header {\n" +
                "            text-align: center;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "\n" +
                "        .header h1 {\n" +
                "            font-size: 28px;\n" +
                "            color: #6d49fc;\n" +
                "        }\n" +
                "\n" +
                "        .header p {\n" +
                "            font-size: 18px;\n" +
                "            color: #444;\n" +
                "        }\n" +
                "\n" +
                "        .fest-details {\n" +
                "            margin-top: 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .fest-details h2 {\n" +
                "            font-size: 24px;\n" +
                "            color: #6d49fc;\n" +
                "        }\n" +
                "\n" +
                "        .fest-details p {\n" +
                "            font-size: 18px;\n" +
                "            color: #444;\n" +
                "        }\n" +
                "\n" +
                "        .fest-details a {\n" +
                "            text-decoration: none;\n" +
                "            color: #6d49fc;\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "\n" +
                "        .fest-details a:hover {\n" +
                "            color: #55cc55;\n" +
                "        }\n" +
                "\n" +
                "        .celebrities {\n" +
                "            margin-top: 30px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .celebrities h2 {\n" +
                "            font-size: 24px;\n" +
                "            color: #6d49fc;\n" +
                "        }\n" +
                "\n" +
                "        .celebrities p {\n" +
                "            font-size: 18px;\n" +
                "            color: #444;\n" +
                "        }\n" +
                "\n" +
                "        .footer {\n" +
                "            text-align: center;\n" +
                "            margin-top: 30px;\n" +
                "        }\n" +
                "\n" +
                "        .footer p {\n" +
                "            font-size: 16px;\n" +
                "            color: #888;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"header\">\n" +
                "            <h1>Thanks "+ name +" for contacting EShop</h1>\n" +
                "            <p>India's Largest Shopping Website</p>\n" +
                "        </div>\n" +
                "        <div class=\"fest-details\">\n" +
                "            <h2>Event Details</h2>\n" +
                "\n" +
                "            <p>Join us for an incredible celebration of digital art and creativity. Explore cutting-edge art, participate in workshops, and more. Visit our website for event details: <a href=\"https://www.ecommerce.shubhamiitbhu.in/\" target=\"_blank\">ECommerce</a></p>\n" +
                "        </div>\n" +
                "        <div class=\"celebrities\">\n" +
                "            <h2>Special Guests</h2>\n" +
                "            <p>We're thrilled to announce that many celebrities will be gracing our event. Stay tuned for updates on our star-studded lineup!</p>\n" +
                "        </div>\n" +
                "        <div class=\"footer\">\n" +
                "            <p>&copy; 2023 ECommerce- Initiative by Shubham IIT BHU</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";



        try {
            helper.setText(htmlMsg, true);
            helper.setTo(toEmail);
            helper.setSubject(subject);
            helper.setFrom("Shubham");
            emailSender.send(mimeMessage);

            return new ResponseMessage("Mail sent successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseMessage("Mail not sent", HttpStatus.BAD_REQUEST);
        }
    }
}
