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

    @FXML
    void orderMeds(ActionEvent event) throws IOException {
        Main.patient.setPain(Integer.parseInt(pain.getText()));
        Main.patient.setAnticoagulant(Integer.parseInt(antiCoagulant.getText()));
        Main.patient.setBetaBlocker(Integer.parseInt(betaBlocker.getText()));
        Main.patient.setAntiretroviral(Integer.parseInt(antiRetroviral.getText()));
        Main.patient.setInsulin(Integer.parseInt(insulin.getText()));
        Main.patient.setAntiInflammatory(Integer.parseInt(antiInflammatory.getText()));
        Main.patient.setUrsodiol(Integer.parseInt(ursodiol.getText()));
        Main.patient.setCalciumReducer(Integer.parseInt(calciumReducer.getText()));

        DatabaseInterface.updatePatient(Main.patient);

        Parent orderMedsParent = FXMLLoader.load(getClass().getResource("physicianMedicalForm.fxml"));
        Scene orderMedsScene= new Scene(orderMedsParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(orderMedsScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
