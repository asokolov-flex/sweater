package com.firesolution.sweater.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.Session;
import java.util.Properties;

@Configuration
public class MailConfig {
    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.password}")
    private String password;

    @Value("${spring.mail.port}")
    private int port;

    @Value("${spring.mail.protocol}")
    private String protocol;

    @Value("${spring.mail.smtp.auth}")
    private String smtpAuth;

    @Value("${spring.mail.smtp.starttls.enable}")
    private String smtpEnable;

    @Value("${spring.mail.smtp.socketFactory.class}")
    private String smtpSocketFactory;

    @Value("${mail.debug}")
    private String debug;

    @Bean
    public JavaMailSender getMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost(host);
        mailSender.setPort(port);

        mailSender.setUsername(username);
        mailSender.setPassword(password);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", protocol);
        props.put("mail.smtp.auth", smtpAuth);
        props.put("mail.smtp.starttls.enable", smtpEnable);
        props.put("mail.debug", debug);


//        mailSender.setHost(host);
//        mailSender.setPort(port);
//        mailSender.setUsername(username);
//        mailSender.setPassword(password);
//
//        Properties properties = mailSender.getJavaMailProperties();
//
//        properties.setProperty("mail.transport.protocol", protocol);
//        properties.setProperty("mail.debug", debug);
//        properties.setProperty("mail.smtp.auth", smtpAuth);
//        properties.setProperty("mail.smtp.ssl.enable",smtpEnable);
//        properties.setProperty("mail.smtp.socketFactory.class", smtpSocketFactory);
//        properties.put("mail.smtp.host"               , host);
//        properties.put("mail.smtp.port"               , port );
//        properties.put("mail.smtp.auth"               , "true"     );
//        properties.put("mail.smtp.ssl.enable"         , "true"     );



        return mailSender;
    }
}