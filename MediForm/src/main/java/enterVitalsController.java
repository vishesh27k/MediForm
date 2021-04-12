import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class enterVitalsController implements Initializable{
    @FXML
    void submitVitals(ActionEvent event) throws IOException {
        Parent nurseMedFormParent = FXMLLoader.load(getClass().getResource("nurseMedicalForm.fxml"));
        Scene nurseMedFormScene = new Scene(nurseMedFormParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(nurseMedFormScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
