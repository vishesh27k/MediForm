import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class viewNotesController implements Initializable{


    @FXML
    private TextField notes;

    @FXML
    private TextField addNote;

    @FXML
    void add(ActionEvent event) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(Main.patient.getNotes());
        
        sb.append("\r\n");
        sb.append(addNote.getText());

        Main.patient.setNotes(sb.toString());
        notes.setText(sb.toString());

        DatabaseInterface.updatePatient(Main.patient);
    }

    @FXML
    void toMainMenu1(ActionEvent event) throws IOException {
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        switch(Main.user.getRoleID()) {
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
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        notes.setText(Main.patient.getNotes());
    }
}