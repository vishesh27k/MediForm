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

public class physicianMedicalFormController implements Initializable{
    @FXML
    void toPhysicianMenu(ActionEvent event) throws IOException {
        Parent physicianMenuParent = FXMLLoader.load(getClass().getResource("physicianMenu.fxml"));
        Scene physicianMenuScene = new Scene(physicianMenuParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(physicianMenuScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
