import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class nurseMenuController implements Initializable {
    @FXML
    void toEnterVitals(ActionEvent event) throws IOException {
        Parent enterVitalsParent = FXMLLoader.load(getClass().getResource("enterVitals.fxml"));
        Scene enterVitalsScene = new Scene(enterVitalsParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(enterVitalsScene);
        window.show();
    }

    @FXML
    void toNurseMedicalForm(ActionEvent event) throws IOException {
        Parent nurseMedFormParent = FXMLLoader.load(getClass().getResource("nurseMedicalForm.fxml"));
        Scene nurseMedFormScene = new Scene(nurseMedFormParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(nurseMedFormScene);
        window.show();
    }

    @FXML
    void toNotes(ActionEvent event) throws IOException {
        Parent notesParent = FXMLLoader.load(getClass().getResource("viewNotes.fxml"));
        Scene notesScene = new Scene(notesParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(notesScene);
        window.show();
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        Parent logoutParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene logoutScene = new Scene(logoutParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }

    @FXML
    void backToEnterID(ActionEvent event) throws IOException {
        Parent backToIDParent = FXMLLoader.load(getClass().getResource("enterID.fxml"));
        Scene backToIDScene = new Scene(backToIDParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(backToIDScene);
        window.show();
    }

    @FXML
    void toPrintDischarge(ActionEvent event) throws IOException {
        Parent printDischargeParent = FXMLLoader.load(getClass().getResource("printDischarge.fxml"));
        Scene printDischargeScene = new Scene(printDischargeParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(printDischargeScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
