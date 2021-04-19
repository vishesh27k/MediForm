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

public class regNewPatientController implements Initializable {

    @FXML
    private TextField firstName1;

    @FXML
    private TextField lastName1;

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
    private TextField insuranceID1;

    @FXML
    private TextField currentMeds1;

    @FXML
    private TextField medHistory1;
    
    @FXML
    private TextField dateOfVisit1;

    @FXML
    private TextField patientID1;

    @FXML
    void submitRegForm(ActionEvent event) throws IOException {
        Main.patient = new Patient();

        Main.patient.setName(firstName1.getText(), lastName1.getText());
        Main.patient.setAddress(address1.getText());
        Main.patient.setCity(city1.getText());
        Main.patient.setState(state1.getText());
        Main.patient.setPhone(phoneNumber1.getText());
        Main.patient.setEmergencyContactName(emergContactName1.getText());
        Main.patient.setEmergencyContactNumber(emergPhoneNumber1.getText());
        Main.patient.setInsuranceProvider(insuranceProvider1.getText());
        Main.patient.setInsuranceID(insuranceID1.getText());
        Main.patient.setPrimaryPhysician(primaryPhysician1.getText());
        Main.patient.setMedicationName(currentMeds1.getText());
        Main.patient.setMedicalHistory(medHistory1.getText());
        Main.patient.setSymptoms(reasonForVisit1.getText());
        Main.patient.setDateOfBirth(dateOfBirth1.getText());
        Main.patient.setDateOfVisit(dateOfVisit1.getText());

        DatabaseInterface.insertPatient(Main.patient);

        Parent regHomeParent = FXMLLoader.load(getClass().getResource("regHome.fxml"));
        Scene regHomeScene = new Scene(regHomeParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(regHomeScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        patientID1.setText(Main.patient.getPatientID()); 
    }
}
