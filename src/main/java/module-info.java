module api.gui.flotte {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.cda.flottejavafx to javafx.fxml;
    opens fr.cda.flottejavafx.Controllers to javafx.fxml;
    exports fr.cda.flottejavafx;
}