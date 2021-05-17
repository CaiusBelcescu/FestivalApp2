package Controller;

import Model.Festival_Type2;
import Model.Festival_Type;
import Services.FestServices;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CreatorController implements Initializable {

    @FXML
    private ScrollPane Scroll;
    @FXML
    private BorderPane CreatorPane;

    @FXML
    private VBox Scrolv;

    @FXML
    private BorderPane Pane2;

    @FXML
    private Button BrowseAction;

    @FXML
    private Button ProfileAction;

    @FXML
    private Button AddAction;

    @FXML
    private HBox cardLayout;

//    @FXML
//    private HBox cardLayout;

    private List<Festival_Type2> recentlyAdded;
    private List<Festival_Type> Desc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        recentlyAdded = new ArrayList<>(recentlyAdded());
        try{
            for(int i=0; i<recentlyAdded.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/Festival.fxml"));
                HBox cardBox = fxmlLoader.load();
                FestivalController festivalController = fxmlLoader.getController();
                festivalController.setData(recentlyAdded.get(i));
                cardLayout.getChildren().add(cardBox);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private List<Festival_Type2> recentlyAdded() {
        List<Festival_Type2> ls = new ArrayList<>();
        Festival_Type2 festival = new Festival_Type2();
        festival.setName("Untold");
        festival.setImageSrc("/img/untold-wallpaper-4.jpg");
        festival.setFestLocation("CLUJ-NAPOCA\nROMANIA");
        ls.add(festival);

        Festival_Type2 festival1 = new Festival_Type2();
        festival1.setName("Neversea");
        festival1.setImageSrc("/img/Neversea.jpg");
        festival1.setFestLocation("CONSTANTA\nROMANIA");
        ls.add(festival1);

        Festival_Type2 festival2 = new Festival_Type2();
        festival2.setName("Electric Castle");
        festival2.setImageSrc("/img/Electric.jpg");
        festival2.setFestLocation("CLUJ-NAPOCA\nROMANIA");
        ls.add(festival2);

        return ls;
    }

    @FXML
    void AddButton() throws IOException {
        FXMLLoader x=new FXMLLoader();
        x.setLocation(getClass().getResource("/FestivalDetails.fxml"));
        AnchorPane aux=x.load();
        Pane2.setCenter(aux);
    }

    @FXML
    void BrowseButton() throws IOException {
        for(Festival_Type festival : FestServices.festivals) {

            //if(festival.getAddress().contains(searchBar.getText())){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Browseee.fxml"));


            try {


                AnchorPane pane = fxmlLoader.load();

                BrowseeController fs = new BrowseeController();
                fs.setdata();

                Scrolv.getChildren().add(pane);


            } catch (IOException e) {
                e.printStackTrace();
            }

        //}


        }
    }

    @FXML
    void ProfileButton() throws IOException {
        FXMLLoader x=new FXMLLoader();
        x.setLocation(getClass().getResource("/Profile.fxml"));
        BorderPane aux=x.load();
        Pane2.setCenter(aux);
    }
}
