package fr.cda.flottejavafx.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

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
        System.out.println("Test ajout salarié");
    }

    @FXML
    public void onDepart() {
        System.out.println("Test départ");
    }

    @FXML
    public void onRetour() {
        System.out.println("Test retour");
    }

    public void onEnDeplacement() {
        System.out.println("Test déplacement");
    }

    public void onHistorique() {

        System.out.println("Test historique");
        resultTab.getChildren().clear();
        resultTab.getChildren().add(new Text(formMatricule.getText()));
    }

}
