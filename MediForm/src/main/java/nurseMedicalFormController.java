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

public class nurseMedicalFormController implements Initializable{
    @FXML
    void toNurseMenu(ActionEvent event) throws IOException {
        Parent regNewPatientParent = FXMLLoader.load(getClass().getResource("regNewPatient.fxml"));
        Scene regNewPatientScene = new Scene(regNewPatientParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(regNewPatientScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
