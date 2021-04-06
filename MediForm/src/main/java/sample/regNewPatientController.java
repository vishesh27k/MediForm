package sample;

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

public class regNewPatientController implements Initializable {

    @FXML
    void toRegHome1(ActionEvent event) throws IOException {
        Parent regHomeParent1 = FXMLLoader.load(getClass().getResource("regHome.fxml"));
        Scene regHomeScene1 = new Scene(regHomeParent1);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(regHomeScene1);
        window.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
