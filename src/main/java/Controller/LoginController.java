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
    private void LoginButtonAction()  throws IOException, UsernameAlreadyExistsException {
        if (!UserService.checkIfPassAndUserAreValid(userField.getText(),passwordField.getText())){
            loginMessageLabel.setText("User or password are incorrect");
        }
//        else{
//            String ROLE = UserService.checkFolkOrCreator(userField.getText(),passwordField.getText());
//
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            if(ROLE.equals("Owner")){
//
//
//                fxmlLoader.setLocation(getClass().getResource("/owners_test.fxml"));
//            }
//            else if(ROLE.equals("Client")){
//
//                fxmlLoader.setLocation(getClass().getResource("/client.fxml"));
//
//            }
//            else{
//                fxmlLoader.setLocation(getClass().getResource("/owners_test.fxml"));
//
//            }
//
//            // Scene scene = new Scene(fxmlLoader.load());
//            Stage stage1 = new Stage();
//            stage1.setTitle("RellowOwner");
//            stage1.setScene(new Scene(fxmlLoader.load(), 1400, 900));
//
//
//            //stage1.setScene();
//
//            //stage1.getIcons().add(new Image("rellow.jpg"));
//            stage1.show();
//            Stage stage = (Stage) loginButton.getScene().getWindow();
//            stage.close();
//
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginMessageLabel.setText("Wellcome");
    }

//    public void loginButtonOnAction(ActionEvent event){
//        loginMessageLabel.setText("You try to login");
//    }

}
