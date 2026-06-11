package it.unisa.wordapp_g13.client;

import it.unisa.wordapp_g13.client.net.ConnessioneServer;
import it.unisa.wordapp_g13.common.model.Utente;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicazioneClient extends Application {

    private static final Logger LOGGER = Logger.getLogger(ApplicazioneClient.class.getName());

    private static Stage primaryStage;
    private static Properties clientProperties;
    private static Utente utenteConnesso;

    @Override
    public void start(Stage stage) { 
    }

    public static void cambiaScena(String fxmlPath) throws IOException { 
    }

    private void caricaProperties() { 
    }

    public static Properties getProperties() { 
        return null;
    }

    public static Utente getUtenteConnesso() { 
        return null;
    }

    public static void setUtenteConnesso(Utente utente) { 
    }

    public static Stage getStage() { 
        return null;
    }

    public static void main(String[] args) { 
    }
}
