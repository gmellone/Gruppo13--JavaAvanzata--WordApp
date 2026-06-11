package it.unisa.wordapp_g13.common.model;

import java.io.Serializable;

public class Documento implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private boolean analizzato;

    public Documento(int id, String nome, boolean analizzato) { 
    }

    public Documento(String nome) { 
    }

    public String getWdmPath() { 
        return null;
    }

    public int getId() { 
        return 0;
    }

    public void setId(int id) { 
    }

    public String getNome() { 
        return null;
    }

    public void setNome(String nome) { 
    }

    public boolean isAnalizzato() { 
        return false;
    }

    public void setAnalizzato(boolean analizzato) { 
    }

    @Override
    public String toString() { 
        return null;
    }
}
