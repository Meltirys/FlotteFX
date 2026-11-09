package fr.cda.flottejavafx.Controllers;

import fr.cda.flottejavafx.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class AddSalarieController {

    @FXML
    private TextField formNom;

    @FXML
    private TextField formPrenom;

    @FXML
    private TextField formMatricule;

    @FXML
    private TextFlow resultTab;

    @FXML
    public void setResultTab(TextFlow resultTab) {
        this.resultTab = resultTab;
    }

    public void onValidate() {

    }

    public void ajoutSalarieScene(Window w) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("ajout-salarie.fxml"));
        Scene scene = new Scene(loader.load(), 400, 380);
        Stage stage = (Stage) w;
        stage.setTitle("Ajout salarié");
        stage.setScene(scene);
        stage.show();

    }
}
