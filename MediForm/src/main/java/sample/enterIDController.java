package sample;

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
        Patient patient = new Patient(database.findPatient(patientID.getText()))

        switch(user.getRoleID()) {
            case 0:
                Parent nurseMenuParent = FXMLLoader.load(getClass().getResource("viewRegInfo.fxml"));
                Scene nurseMenuScene = new Scene(nurseMenuParent);
        
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(nurseMenuScene);
                window.show();
                break;

            case 1:
                Parent nurseMenuParent = FXMLLoader.load(getClass().getResource("nurseMenu.fxml"));
                Scene nurseMenuScene = new Scene(nurseMenuParent);
        
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(nurseMenuScene);
                window.show();
                break;
            
            case 2:
                //code to send user to physicanMainMenu
                //send user and patient OBJ to next scene
                break;

            case 3:
                //code to send user to billing
                //send user and patient OBJ to next scene
                break;
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
