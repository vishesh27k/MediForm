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

public class enterIDController implements Initializable {
    @FXML
    private TextField patientID;

    @FXML
    void toNurseMenu(ActionEvent event) throws IOException {
        Patient patient = new Patient(DatabaseInterface.findPatient(patientID.getText()));

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        switch(user.getRoleID()) {
            case 0:
                Parent viewRegInfoParent = FXMLLoader.load(getClass().getResource("viewRegInfo.fxml"));
                Scene viewRegInfoScene = new Scene(viewRegInfoParent);
        
                window.setScene(viewRegInfoScene);
                window.show();
                break;

            case 1:
                Parent nurseMenuParent = FXMLLoader.load(getClass().getResource("nurseMenu.fxml"));
                Scene nurseMenuScene = new Scene(nurseMenuParent);
        
                window.setScene(nurseMenuScene);
                window.show();
                break;
            
            case 2:
                Parent physicianMenuParent = FXMLLoader.load(getClass().getResource("physicianMenu.fxml"));
                Scene physicianMenuScene = new Scene(physicianMenuParent);
        
                window.setScene(physicianMenuScene);
                window.show();
                break;

            case 3:
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
