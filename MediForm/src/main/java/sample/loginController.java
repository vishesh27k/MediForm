package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void toRegHome(ActionEvent event) throws IOException {

        //construct database object here

        User user = new User(database.findUser(username.getText()));

        //check entered pass against database pass
        if(password.getText() != user.getPassword()) {
            //reject login and prompt to re-enter login info?
        }
        
        switch(user.getRoleID()) {
            case 0:
                //code to send user to Reg
                //send user OBJ to next scene
                break;

            default:
                //code to send user to enterPatientID
                //send user OBJ to next scene
                break;
        }
        
        Parent regHomeParent = FXMLLoader.load(getClass().getResource("enterID.fxml"));
        Scene regHomeScene = new Scene(regHomeParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(regHomeScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

