import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class nurseMedicalFormController implements Initializable{
    @FXML
    private TextField firstName1;

    @FXML
    private TextField lastName1;

    @FXML
    private TextField height1;

    @FXML
    private TextField temp1;

    @FXML
    private TextField weight1;

    @FXML
    private TextField bloodPress1;

    @FXML
    void submitVitals(ActionEvent event) throws IOException {
        Main.patient.setHeight(Float.parseFloat(height1.getText()));
        Main.patient.setWeight(Float.parseFloat(weight1.getText()));
        Main.patient.setTemperature(Float.parseFloat(height1.getText()));
        Main.patient.setBloodPressure(bloodPress1.getText());

        DatabaseInterface.updatePatient(Main.patient);
    }

    @FXML
    void toNurseMenu(ActionEvent event) throws IOException {
        Parent nurseMenuParent = FXMLLoader.load(getClass().getResource("nurseMenu.fxml"));
        Scene nurseMenuScene = new Scene(nurseMenuParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(nurseMenuScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
