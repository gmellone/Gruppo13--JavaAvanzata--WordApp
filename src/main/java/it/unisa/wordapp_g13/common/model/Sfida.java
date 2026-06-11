package it.unisa.wordapp_g13.common.model;

import java.io.Serializable;

public class Sfida implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String utente1;

    private String utente2;

    private int documentoId;

    private int classificaId;

    private Difficolta difficolta;

    private String parolaCifrata;

    private int chiaveCesar;

    private String oraInizio;

    private String oraFine;

    private Integer tempoRisposta1;

    private Integer tempoRisposta2;

    private String esito1;

    private String esito2;

    public Sfida(int id, String utente1, String utente2, int documentoId, int classificaId,
                 Difficolta difficolta, String parolaCifrata, int chiaveCesar,
                 String oraInizio, String oraFine, Integer tempoRisposta1, Integer tempoRisposta2,
                 String esito1, String esito2) {
        this.id = id;
        this.utente1 = utente1;
        this.utente2 = utente2;
        this.documentoId = documentoId;
        this.classificaId = classificaId;
        this.difficolta = difficolta;
        this.parolaCifrata = parolaCifrata;
        this.chiaveCesar = chiaveCesar;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.tempoRisposta1 = tempoRisposta1;
        this.tempoRisposta2 = tempoRisposta2;
        this.esito1 = esito1;
        this.esito2 = esito2;
    }

    public Sfida(String utente1, String utente2, int documentoId, int classificaId,
                 Difficolta difficolta, String parolaCifrata, int chiaveCesar,
                 String oraInizio, String oraFine, Integer tempoRisposta1, Integer tempoRisposta2,
                 String esito1, String esito2) {
        this(-1, utente1, utente2, documentoId, classificaId, difficolta,
                parolaCifrata, chiaveCesar, oraInizio, oraFine, tempoRisposta1, tempoRisposta2,
                esito1, esito2);
    }

    public int getId() { 
        return 0;
    }
    public void setId(int id) { 
    }

    public String getUtente1() { 
        return null;
    }
    public void setUtente1(String utente1) { 
    }

    public String getUtente2() { 
        return null;
    }
    public void setUtente2(String utente2) { 
    }

    public int getDocumentoId() { 
        return 0;
    }
    public void setDocumentoId(int documentoId) { 
    }

    public int getClassificaId() { 
        return 0;
    }
    public void setClassificaId(int classificaId) { 
    }

    public Difficolta getDifficolta() { 
        return null;
    }
    public void setDifficolta(Difficolta difficolta) { 
    }

    public String getParolaCifrata() { 
        return null;
    }
    public void setParolaCifrata(String parolaCifrata) { 
    }

    public int getChiaveCesar() { 
        return 0;
    }
    public void setChiaveCesar(int chiaveCesar) { 
    }

    public String getOraInizio() { 
        return null;
    }
    public void setOraInizio(String oraInizio) { 
    }

    public String getOraFine() { 
        return null;
    }
    public void setOraFine(String oraFine) { 
    }

    public Integer getTempoRisposta1() { 
        return null;
    }
    public void setTempoRisposta1(Integer tempoRisposta1) { 
    }

    public Integer getTempoRisposta2() { 
        return null;
    }
    public void setTempoRisposta2(Integer tempoRisposta2) { 
    }

    public String getEsito1() { 
        return null;
    }
    public void setEsito1(String esito1) { 
    }

    public String getEsito2() { 
        return null;
    }
    public void setEsito2(String esito2) { 
    }

    @Override
    public String toString() { 
        return null;
    }
}
