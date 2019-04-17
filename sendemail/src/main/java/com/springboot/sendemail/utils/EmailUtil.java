package com.springboot.sendemail.utils;

import com.springboot.sendemail.entity.Sendeamil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Component
public class EmailUtil {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${mail.fromMail.addr}")
    private String from;

    private  static  final int SEND_EMAIL = 0;


    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
      //  try{
            mailSender.send(message);
            System.out.println("success");
//        }catch (Exception e){
//            System.out.println("fail"+e);
//        }
    }

    public void sendHtmlMail(String to, String subject, String content) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
     //   try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);   //true表示需要创建一个multipart message
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            mailSender.send(message);
            System.out.println("html邮件发送成功");
//        } catch (MessagingException e) {
//            System.out.println("发送html邮件时发生异常！"+e);
//        }
    }

    public void sendAttachmentMail(String to, String subject, String content, String filePath) {
        MimeMessage message = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);

            FileSystemResource file = new FileSystemResource(new File(filePath));
            String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
            helper.addAttachment(fileName, file);
            //helper.addAttachment("test"+fileName, file);

            mailSender.send(message);
            System.out.println("带附件的邮件已经发送。");
        } catch (MessagingException e) {
            System.out.println("发送带附件的邮件时发生异常！"+e);
        }
    }

    public void insertTitle(String title, String description) {

        Sendeamil sendeamil = new Sendeamil();
        sendeamil.setTitle(title);
        sendeamil.setDescription(description);
        sendeamil.setStatus(SEND_EMAIL);

//        SendeamilExample sendeamilExample = new SendeamilExample();
//        sendeamilExample.createCriteria().andStatusEqualTo(SEND_EMAIL);
//        List<Sendeamil> sendeamils = sendeamilMapper.selectByExample(sendeamilExample);
//
//        SimpleMailMessage message = new SimpleMailMessage();
//
//        for (Sendeamil send : sendeamils) {
//            if (send.getStatus() == SEND_EMAIL){
//                message.setFrom(from);
//                message.setTo("1048388981@qq.com");
//                message.setSubject("收到新的申报");
//                message.setText("test");
//                try{
//                    mailSender.send(message);
//                    System.out.println("success");
//                }catch (Exception e){
//                    System.out.println("fail"+e);
//                }
//                break;
//            }
//
//        }


    }

}
