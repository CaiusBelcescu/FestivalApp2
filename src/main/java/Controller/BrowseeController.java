package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BrowseeController {

    @FXML
    private Label Namelb;

    @FXML
    private Label Pricelb;

    @FXML
    private Label Placelb;

    @FXML
    private Label Descriptionlb;

    void setdata(){

    }

    public void setdata(String name, String festprice, String festplace, String festdescription) {
        Namelb.setText(name);
        Pricelb.setText(festprice);
        Placelb.setText(festplace);
        Descriptionlb.setText(festdescription);
    }
}
