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

public class DepartController {

    @FXML
    private TextField matricule;
    @FXML
    private TextField immatricule;
    @FXML
    private TextFlow resultTab;

    public void setResultTab(TextFlow resultTab) {

        this.resultTab = resultTab;
    }

    public void ajoutSceneDepart(Window w) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("ajout-depart.fxml"));
        Scene scene = new Scene(loader.load(), 400, 380);
        Stage stage = (Stage) w;
        stage.setTitle("Ajout départ");
        stage.setScene(scene);
        stage.show();
    }
}
