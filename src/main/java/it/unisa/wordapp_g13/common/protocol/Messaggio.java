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

public class Messaggio implements Serializable {

    private static final long serialVersionUID = 1L;

    private final TipoMessaggio tipo;
    private final Object payload;

    public Messaggio(TipoMessaggio tipo, Object payload) { 
    }

    public TipoMessaggio getTipo() { 
        return null;
    }

    public Object getPayload() { 
        return null;
    }

    @Override
    public String toString() { 
        return null;
    }
}
