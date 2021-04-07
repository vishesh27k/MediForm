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
import java.util.Date;
import java.text.SimpleDateFormat;

public class regNewPatientController implements Initializable {

    @FXML
    private TextField firstName1;

    @FXML
    private TextField lastName2;

    @FXML
    private TextField dateOfBirth1;

    @FXML
    private TextField address1;

    @FXML
    private TextField city1;

    @FXML
    private TextField state1;

    @FXML
    private TextField phoneNumber1;

    @FXML
    private TextField insuranceProvider1;

    @FXML
    private TextField primaryPhysician1;

    @FXML
    private TextField emergContactName1;

    @FXML
    private TextField emergPhoneNumber1;

    @FXML
    private TextField reasonForVisit1;

    @FXML
    private TextField patientID1;

    @FXML
    void toRegHome1(ActionEvent event) throws IOException {
        
        Date DOB = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth1.getText());
        int phone = Integer.parseInt(phoneNumber1.getText());
        int emergencyContactNumber = Integer.parseInt(emergPhoneNumber1.getText());

        Patient patient = new Patient(firstname1.getText(), lastName2.getText(), address1.getText(), city1.getText(), state1.getText(), phone, emergContactName1.getText(), emergencyContactNumber, insuranceProvider1.getText(), insuranceID1.getText(), primaryPhysician1.getText(), medicationName1.getText(), medicalHistory1.getText(), reasonForVisit1.getText(), DOB, DOV);

        DatabaseInterface.insertPatient(patient);

        Parent regHomeParent1 = FXMLLoader.load(getClass().getResource("regHome.fxml"));
        Scene regHomeScene1 = new Scene(regHomeParent1);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(regHomeScene1);
        window.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
