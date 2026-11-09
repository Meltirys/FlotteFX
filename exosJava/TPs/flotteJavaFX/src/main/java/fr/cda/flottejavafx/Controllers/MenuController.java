package fr.cda.flottejavafx.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class MenuController {

    @FXML
    private VBox menuField;

    /** Zone d'affichage du menu principal (Son attribut est donné au
     * champ dans menu-view.fxml
    */
    @FXML
    private TextFlow resultTab;

    @FXML
    private void onSalarieClick() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fr/cda/flottejavafx/menu-salarie.fxml"));
        VBox menuSalarie = loader.load();
        SalarieController salarieController = loader.getController();
        salarieController.setResultTab(resultTab);
        menuField.getChildren().setAll(menuSalarie);
    }
}
