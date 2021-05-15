package Controller;

import Exceptions.UsernameAlreadyExistsException;
import Services.UserService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {

    @FXML
    private TextField Email;

    @FXML
    private PasswordField Password;

    @FXML
    private Button CancelButton;

    @FXML
    private Button RegistButton;

    @FXML
    private ChoiceBox role;

    @FXML
    public void initialize() {
        role.getItems().addAll("Festival Folk", "Festival Creator");
    }

    @FXML
    void CancelAction() {
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }



    @FXML
    void RegistAction() {
        try {
            UserService.addUser(Email.getText(), Password.getText(), (String)role.getValue());
            //registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            //registrationMessage.setText(e.getMessage());
        }
        Stage stage = (Stage) RegistButton.getScene().getWindow();
        stage.close();
    }

}
