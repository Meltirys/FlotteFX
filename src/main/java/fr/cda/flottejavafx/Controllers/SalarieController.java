package fr.cda.flottejavafx.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class SalarieController {

    @FXML
    private TextField formMatricule;

    /**
     * Zone d'affichage que l'on va aller récupérer de
     * MenuController
     * */
    @FXML
    private TextFlow resultTab;

    /**
     * Méthode que l'on appelle dans MenuController pour
     * accéder à la zone d'affichage
     * */
    @FXML
    public void setResultTab(TextFlow resultTab) {

        this.resultTab = resultTab;
    }

    @FXML
    public void onAjoutSalarie() {

        AddSalarieController ajoutSalarie = new AddSalarieController();
        try {
            ajoutSalarie.ajoutSalarieScene(resultTab.getScene().getWindow());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    public void onDepart() {

        DepartController departController = new DepartController();
        try {
            departController.ajoutSceneDepart(resultTab.getScene().getWindow());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void onRetour() {

        RetourController retourController = new RetourController();
        try {
            retourController.ajoutSceneRetour(resultTab.getScene().getWindow());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onEnDeplacement() {

        System.out.println("Test déplacement");
    }

    public void onHistorique() {

        // Exemple d'affichage dans le tab de droite sur la saisie de matricule
        System.out.println("Test historique");
        resultTab.getChildren().clear();
        resultTab.getChildren().add(new Text(formMatricule.getText()));
    }

    public void onRetourMenu() {


    }

}
