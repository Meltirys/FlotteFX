package fr.cda.flottejavafx.Controllers;

import fr.cda.flottejavafx.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class AjoutVehiculeController {

    @FXML
    private TextField immatricule;
    @FXML
    private TextField marque;
    @FXML
    private TextField modele;
    @FXML
    private TextField miseEnCirculation;
    @FXML
    private TextField kilometrage;
    @FXML
    private TextFlow resultTab;

    public void ajoutSceneAddV(Window w) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("ajout-vehicule.fxml"));
        Scene scene = new Scene(loader.load(), 400, 420);
        Stage stage = (Stage) w;
        stage.setTitle("Ajout d'un véhicule");
        stage.setScene(scene);
        stage.show();
    }
}
