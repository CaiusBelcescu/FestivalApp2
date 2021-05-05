package Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
public class RegisterController {
    @FXML
    Button CancelButton;
    @FXML
    private void CancelAction(){
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }
}
