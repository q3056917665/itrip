package com.example.service.UserService.Impl;

import com.example.service.UserService.ImailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class ImailServiceImpl implements ImailService {
    /***
     *  Spring Boot 提供了一个发送邮件的简单抽象，使用的是下面这个接口，这里直接注入即可使用
     */
    @Resource
    private JavaMailSender mailSender;

    @Value("${spring.mail.from}")
    private String formEmail;

    @Override
    public boolean sendSimpleMail(String to, String subject, String content) {
        //创建SimpleMailMessage对象
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //邮件发送人
        simpleMailMessage.setFrom(formEmail);
        //邮件接收人
        simpleMailMessage.setTo(to);
        //邮件主题
        simpleMailMessage.setSubject(subject);
        //邮件内容
        simpleMailMessage.setText(content);
        //发送邮件
        mailSender.send(simpleMailMessage);
        return true;
    }

    @Override
    public boolean sendHtmlMail(String to, String subject, String content) {
        //获取MimeMessage对象
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper;
        try {
            messageHelper = new MimeMessageHelper(message, true);
            //邮件发送人
            messageHelper.setFrom(formEmail);
            //邮件接收人
            messageHelper.setTo(to);
            //邮件主题
            messageHelper.setSubject(subject);
            //邮件内容
            messageHelper.setText(content, true);

            mailSender.send(message);
            return true;
        } catch (MessagingException e) {
            System.out.println("发生错误了");
            return false;
        }
    }

    @Override
    public boolean sendAttachmentsMail(String to, String subject, String content, String filePath) {
        //获取MimeMessage对象
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(formEmail);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);

            FileSystemResource file = new FileSystemResource(new File(filePath));
            String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
            helper.addAttachment(fileName, file);
            mailSender.send(message);
            System.out.println("邮件已经发送。");
            return true;
        } catch (MessagingException e) {
            System.out.println("发送邮件时发生异常！");
            return false;
        }
    }
}
