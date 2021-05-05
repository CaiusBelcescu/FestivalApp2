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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginMessageLabel.setText("Wellcome");
    }

    public void loginButtonOnAction(ActionEvent event){
        loginMessageLabel.setText("You try to login");
    }

    public void createForm(){
        try{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Register.fxml"));

            Stage scene2 = new Stage();
            scene2.initStyle(StageStyle.UNDECORATED);
            scene2.setScene(new Scene(root,600,622));
            scene2.show();
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
