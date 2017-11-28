package com.example.usuario.integrationmaps;

import com.example.usuario.mailsender.MailSender;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by ALUMNO on 28/11/2017.
 */

public class ñañiTest {

    @Test
    public void pruebaMockReturnBody() {
        MailSender mailSenderInterface = Mockito.mock(MailSender.class);
        //when(mailSenderInterface.get()).thenReturn("first");
    }
}
