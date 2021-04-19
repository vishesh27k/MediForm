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

public class billController implements Initializable{
    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField patientID;

    @FXML
    private TextField medCost;

    @FXML
    private TextField testCost;

    @FXML
    private TextField overnightCost;

    @FXML
    private TextField totalCost;

    @FXML
    void toEnterID(ActionEvent event) throws IOException {
        Parent enterIDParent = FXMLLoader.load(getClass().getResource("enterID.fxml"));
        Scene enterIDScene = new Scene(enterIDParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(enterIDScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String name = Main.patient.getName();
        String[] nameSplit = name.split(" ");
        firstName.setText(nameSplit[0]);
        lastName.setText(nameSplit[1]);
        patientID.setText(Main.patient.getPatientID());

        Main.patient.calculatePrices();

        medCost.setText(Integer.toString(Main.patient.getPriceMed()));
        testCost.setText(Integer.toString(Main.patient.getPriceTest()));
        overnightCost.setText(Integer.toString(Main.patient.getOvernightCost()));
        totalCost.setText(Integer.toString(Main.patient.getTotal()));
    }
}
