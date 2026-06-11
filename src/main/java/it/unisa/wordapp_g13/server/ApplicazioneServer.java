package it.unisa.wordapp_g13.server;

import it.unisa.wordapp_g13.server.db.RepositoryJdbc;
import it.unisa.wordapp_g13.server.net.AscoltatoreServer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicazioneServer extends Application {

    private static final Logger LOGGER = Logger.getLogger(ApplicazioneServer.class.getName());

    private static RepositoryJdbc repository;
    private static Properties serverProperties;

    @Override
    public void start(Stage primaryStage) { 
    }

    private void caricaProperties() { 
    }

    private void verificaCartelleLavoro() { 
    }

    public static RepositoryJdbc getRepository() { 
        return null;
    }

    public static Properties getProperties() { 
        return null;
    }

    public static void main(String[] args) { 
    }
}
