package it.unisa.wordapp_g13.common.model;

import java.io.Serializable;

public class VoceClassifica implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private int punteggio;

    private int vittorie;

    private int partiteTotali;

    private double tempoMedio;

    public VoceClassifica(String username, int punteggio, int vittorie, int partiteTotali, double tempoMedio) { 
    }

    public String getUsername() { 
        return null;
    }

    public int getPunteggio() { 
        return 0;
    }

    public int getVittorie() { 
        return 0;
    }

    public int getPartiteTotali() { 
        return 0;
    }

    public double getTempoMedio() { 
        return 0;
    }

    @Override
    public String toString() { 
        return null;
    }
}
