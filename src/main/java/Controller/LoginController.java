package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

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
    @FXML
    private void LoginButtonAction(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginMessageLabel.setText("Wellcome");
    }

//    public void loginButtonOnAction(ActionEvent event){
//        loginMessageLabel.setText("You try to login");
//    }

}
