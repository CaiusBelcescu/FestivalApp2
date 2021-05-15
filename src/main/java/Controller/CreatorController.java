package Controller;

import Model.Festival_Type;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CreatorController implements Initializable {
    @FXML
    private HBox cardLayout;

    private List<Festival_Type> recentlyAdded;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        recentlyAdded = new ArrayList<>(recentlyAdded());
        try{
            for(int i=0; i<recentlyAdded.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Festival.fxml"));
                HBox cardBox = fxmlLoader.load();
                FestivalController festivalController = fxmlLoader.getController();
                festivalController.setData(recentlyAdded.get(i));
                cardLayout.getChildren().add(cardBox);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private List<Festival_Type> recentlyAdded() {
        List<Festival_Type> ls = new ArrayList<>();
        Festival_Type festival = new Festival_Type();
        festival.setName("Untold");
        festival.setImageSrc("/img/untold-wallpaper-4.jpg");
        festival.setFestLocation("CLUJ-NAPOCA\nROMANIA");
        ls.add(festival);

        Festival_Type festival1 = new Festival_Type();
        festival.setName("Neversea");
        festival.setImageSrc("/img/Neversea.jpg");
        festival.setFestLocation("CONSTANTA\nROMANIA");
        ls.add(festival);

        Festival_Type festival2 = new Festival_Type();
        festival.setName("Electric Castle");
        festival.setImageSrc("/img/Electric.jpg");
        festival.setFestLocation("CLUJ-NAPOCA\nROMANIA");
        ls.add(festival);

        return ls;
    }
}
