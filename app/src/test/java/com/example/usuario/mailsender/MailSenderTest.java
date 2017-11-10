package com.example.usuario.mailsender;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by axi_e on 10/11/2017.
 */
public class MailSenderTest {

    private MailSender mailsender;

    @Before
    public void init(){

        mailsender = new MailSender("Iting", "asier.elorza@opendeusto.es", "Arzak", "007");
    }

    @Test
    public void envio_mail() throws Exception {

        assertTrue(mailsender.envio_mail("Iting", "asier.elorza@opendeusto.es", "Arzak", "007"));

    }

}