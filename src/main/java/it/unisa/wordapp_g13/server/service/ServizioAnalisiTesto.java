package it.unisa.wordapp_g13.server.service;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;

public class ServizioAnalisiTesto extends Service<Map<String, Integer>> {

    private final File fileDaAnalizzare;
    private final File fileOutputSer;

    private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList(
        "il", "lo", "la", "i", "gli", "le", "un", "uno", "una", "di", "a", "da", "in", "con", "su", "per", "tra", "fra",
        "e", "o", "ma", "che", "non", "ho", "ha", "hai", "abbiamo", "avete", "hanno", "sono", "sei", "è", "siamo", "siete",
        "era", "eri", "eravamo", "eravate", "erano", "anche", "come", "questo", "questa", "questi", "queste", "quello",
        "quella", "quelli", "quelle", "mi", "ti", "ci", "vi", "si", "lo", "li", "gli", "le", "ne", "se", "perché", "quindi",
        "del", "dello", "della", "dei", "degli", "delle", "dell",
        "al", "allo", "alla", "ai", "agli", "alle", "all",
        "dal", "dallo", "dalla", "dai", "dagli", "dalle", "dall",
        "nel", "nello", "nella", "nei", "negli", "nelle", "nell",
        "sul", "sullo", "sulla", "sui", "sugli", "sulle", "sull",
        "col", "coi", "quest", "quell"
    ));

    public ServizioAnalisiTesto(File fileDaAnalizzare, File fileOutputSer) { 
    }

    @Override
    protected Task<Map<String, Integer>> createTask() { 
        return null;
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Integer> caricaAnalisi(File fileSer) throws IOException, ClassNotFoundException { 
        return null;
    }
}
