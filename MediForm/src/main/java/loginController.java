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
    void loginUser(ActionEvent event) throws IOException {
        Main.user = DatabaseInterface.findUser(username.getText());

        //check entered pass against database pass
        if(password.getText() != Main.user.getPassword()) {
            //username.setText("Wrong");
            //return;
        }

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        switch(Main.user.getRoleID()) {
            case 1:              
                Parent regHomeParent = FXMLLoader.load(getClass().getResource("regHome.fxml"));
                Scene regHomeScene = new Scene(regHomeParent);
        
                window.setScene(regHomeScene);
                window.show();
                break;

            default:
                Parent enterIDParent = FXMLLoader.load(getClass().getResource("enterID.fxml"));
                Scene enterIDScene = new Scene(enterIDParent);
        
                window.setScene(enterIDScene);
                window.show();
                break;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}

