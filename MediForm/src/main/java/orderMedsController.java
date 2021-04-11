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

public class orderMedsController implements Initializable{


    @FXML
    private TextField pain;

    @FXML
    private TextField antiCoagulant;

    @FXML
    private TextField betaBlocker;

    @FXML
    private TextField antiRetroviral;

    @FXML
    private TextField insulin;

    @FXML
    private TextField antiInflammatory;

    @FXML
    private TextField ursodiol;

    @FXML
    private TextField calciumReducer;

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
