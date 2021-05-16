package Controller;

import Exceptions.UsernameAlreadyExistsException;
import Services.FestServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DescriptionController {

    @FXML
    private TextField FestName;

    @FXML
    private TextField Place;

    @FXML
    private TextField Prices;

    @FXML
    private TextField Description;

    @FXML
    private Button addFest;

    @FXML
    private Button cancelFest;

    @FXML
    void addFestButton() throws UsernameAlreadyExistsException {
        FestServices.addUser(FestName.getText(), Prices.getText(), Place.getText(),Description.getText());
        
    }

    @FXML
    void cancelFestButton() {

    }

}
