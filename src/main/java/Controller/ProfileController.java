package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {

    @FXML
    private Label labelEmail;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        labelEmail.setText(LoginController.email);
    }
}
