package Controller;

//import Model.Festival_Type;
import Model.Festival_Type2;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class FestivalController {
    @FXML
    private HBox box;


    @FXML
    private Label FestivalName;

    @FXML
    private Label FestivalLocation;

    private String [] colors = {"B9E5FF", "BDB2FE", "FB9AA8", "FF5856"};

    public void setData(Festival_Type2 festival){
        //Image image = new Image(getClass().getResourceAsStream(festival.getImageSrc()));

        //festivalImage.setImage(image);

        FestivalName.setText(festival.getName());

        FestivalLocation.setText(festival.getFestLocation());

        box.setStyle("-fx-background-color: " + String.valueOf(Color.web(colors[(int)(Math.random()*colors.length)])));

    }
}
