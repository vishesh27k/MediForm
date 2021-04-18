import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class enterIDController implements Initializable {
    @FXML
    private TextField patientID;

    @FXML
    void toNurseMenu(ActionEvent event) throws IOException {
        if(patientID.getText().length() == 0){
            Alert alert1 = new Alert(Alert.AlertType.ERROR);
            alert1.setContentText("Patient ID field is empty.");
            alert1.showAndWait();
            return;
        }
                
        Main.patient = DatabaseInterface.findPatient(patientID.getText());

        if(!patientID.getText().equals(Main.patient.getPatientID())) {
            Alert alert1 = new Alert(Alert.AlertType.ERROR);
            alert1.setContentText("Patient ID does not exist.");
            alert1.showAndWait();
            return;
        }

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        switch(Main.user.getRoleID()) {
            case 1:
                Parent viewRegInfoParent = FXMLLoader.load(getClass().getResource("viewRegForm.fxml"));
                Scene viewRegInfoScene = new Scene(viewRegInfoParent);
        
                window.setScene(viewRegInfoScene);
                window.show();
                break;

            case 2:
                Parent nurseMenuParent = FXMLLoader.load(getClass().getResource("nurseMenu.fxml"));
                Scene nurseMenuScene = new Scene(nurseMenuParent);
        
                window.setScene(nurseMenuScene);
                window.show();
                break;
            
            case 3:
                Parent physicianMenuParent = FXMLLoader.load(getClass().getResource("physicianMenu.fxml"));
                Scene physicianMenuScene = new Scene(physicianMenuParent);
        
                window.setScene(physicianMenuScene);
                window.show();
                break;

            case 4:
                Parent billParent = FXMLLoader.load(getClass().getResource("bill.fxml"));
                Scene billScene = new Scene(billParent);
        
                window.setScene(billScene);
                window.show();
                break;
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
