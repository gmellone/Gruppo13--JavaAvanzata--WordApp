package it.unisa.wordapp_g13.common.model;

import java.io.Serializable;

public class Utente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private int partiteVinte;

    private String ruolo;

    private String domandaSicurezza;

    private String rispostaSicurezza;

    public Utente(String username, String password, int partiteVinte, String ruolo, String domandaSicurezza, String rispostaSicurezza) { 
    }

    public Utente(String username, String password, int partiteVinte, String ruolo) { 
    }

    public Utente(String username, String password, String ruolo) { 
    }

    public String getUsername() { 
        return null;
    }

    public void setUsername(String username) { 
    }

    public String getPassword() { 
        return null;
    }

    public void setPassword(String password) { 
    }

    public int getPartiteVinte() { 
        return 0;
    }

    public void setPartiteVinte(int partiteVinte) { 
    }

    public String getRuolo() { 
        return null;
    }

    public void setRuolo(String ruolo) { 
    }

    public boolean isAdmin() { 
        return false;
    }

    public String getDomandaSicurezza() { 
        return null;
    }

    public void setDomandaSicurezza(String domandaSicurezza) { 
    }

    public String getRispostaSicurezza() { 
        return null;
    }

    public void setRispostaSicurezza(String rispostaSicurezza) { 
    }

    @Override
    public String toString() { 
        return null;
    }
}
