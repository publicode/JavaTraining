package com.practicaljava.lesson19;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

class MyMailAuthenticator extends Authenticator { 
    protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication ("yfain11@yahoo.com", "password123");
    }
}
