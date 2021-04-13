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

public class physicianMedicalFormController implements Initializable{

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
    private TextField symptoms1;

    @FXML
    private TextField medications1;

    @FXML
    private TextField tests1;

    @FXML
    private TextField diagnosis1;
    @FXML
    void toPhysicianMenu(ActionEvent event) throws IOException {
        Parent physicianMenuParent = FXMLLoader.load(getClass().getResource("physicianMenu.fxml"));
        Scene physicianMenuScene = new Scene(physicianMenuParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(physicianMenuScene);
        window.show();
    }

    @FXML
    void toDiagnose(ActionEvent event) throws IOException {
        Parent diagnoseParent = FXMLLoader.load(getClass().getResource("diagnose.fxml"));
        Scene diagnoseScene = new Scene(diagnoseParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(diagnoseScene);
        window.show();
    }
    
    @FXML
    void toOrderMeds(ActionEvent event) throws IOException {
        Parent orderMedsParent = FXMLLoader.load(getClass().getResource("orderMeds.fxml"));
        Scene orderMedsScene = new Scene(orderMedsParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(orderMedsScene);
        window.show();
    }

    @FXML
    void toOrderTest(ActionEvent event) throws IOException {
        Parent orderTestParent = FXMLLoader.load(getClass().getResource("orderTest.fxml"));
        Scene orderTestScene = new Scene(orderTestParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(orderTestScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
