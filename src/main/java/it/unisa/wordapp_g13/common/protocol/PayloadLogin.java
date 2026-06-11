/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.wordapp_g13.common.protocol;

import java.io.Serializable;
/**
 *
 * @author angelo
 */

public class PayloadLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String username;
    private final String password;
    private final String domandaSicurezza;
    private final String rispostaSicurezza;

    public PayloadLogin(String username, String password) { 
    }

    public PayloadLogin(String username, String password, String domandaSicurezza, String rispostaSicurezza) { 
    }

    public String getUsername() { 
        return null;
    }

    public String getPassword() { 
        return null;
    }

    public String getDomandaSicurezza() { 
        return null;
    }

    public String getRispostaSicurezza() { 
        return null;
    }
}

