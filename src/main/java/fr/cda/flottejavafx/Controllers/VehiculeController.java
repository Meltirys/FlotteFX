package fr.cda.flottejavafx.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class VehiculeController {

    @FXML
    private TextField formImmatricule;

    @FXML
    private TextFlow resultTab;

    @FXML
    public void setResultTab(TextFlow resultTab) {

        this.resultTab = resultTab;
    }

    @FXML
    public void onAfficheFlotte() {

    }

    @FXML
    public void onAjoutVehicule() {

        AjoutVehiculeController ajoutVehiculeController = new AjoutVehiculeController();
        try {
            ajoutVehiculeController.ajoutSceneAddV(resultTab.getScene().getWindow());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void onRetireVehicule() {

    }

    @FXML
    public void onRechercheVehicule() {

    }

    @FXML
    public void onTrieFlotte() {

    }

}
