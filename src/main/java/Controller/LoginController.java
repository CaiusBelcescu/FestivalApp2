package Controller;

import Exceptions.UsernameAlreadyExistsException;
import Services.UserService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField userField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private void exit(ActionEvent event)
    {
        System.exit(0);
    }

    @FXML
    private void RegisterButtonAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Register.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600,622);
        Stage stage1 = new Stage();
        stage1.setTitle("Register");
        stage1.setScene(scene);
        stage1.setResizable(false);
        stage1.show();
    }
    //jjj
    @FXML
    void LoginButtonAction(ActionEvent event) throws IOException {

        if(UserService.check(userField.getText(), passwordField.getText()))
        {
            FXMLLoader fxmlLoader1 = new FXMLLoader();
            String role=UserService.checkFolkOrCreator(userField.getText(),passwordField.getText());
            if(role.equals("Festival Folk")) {
                fxmlLoader1.setLocation(getClass().getResource("/FestivalFolk.fxml"));
            }
            else if(role.equals("Festival Creator"))
            {
                fxmlLoader1.setLocation(getClass().getResource("/FestivalCreator.fxml"));
            }

            Scene scene = new Scene((Parent) fxmlLoader1.load(),1635,933);
            Stage stage1 = new Stage();


            stage1.setScene(scene);

            stage1.show();

            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();

        }
        else{
            loginMessageLabel.setText("E-mail or password are incorrect");
        }

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginMessageLabel.setText("Wellcome");
    }



}
