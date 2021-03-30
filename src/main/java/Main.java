import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import services.UserService;

public class Main extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //UserService.loadUsersFromFile();

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Login.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("FestivalWord");
        primaryStage.setScene(scene);
        //primaryStage.getIcons().add(new Image("rellow.jpg"));
        primaryStage.initStyle(StageStyle.DECORATED.UNDECORATED);
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event){
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}