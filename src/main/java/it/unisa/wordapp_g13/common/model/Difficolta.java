package it.unisa.wordapp_g13.common.model;

public enum Difficolta {

    FACILE(1, 5),

    MEDIO(6, 10),

    DIFFICILE(11, 15);

    private final int shiftMin;

    private final int shiftMax;

    Difficolta(int shiftMin, int shiftMax) { 
    }

    public int getShiftMin() { 
        return 0;
    }

    public int getShiftMax() { 
        return 0;
    }
}
