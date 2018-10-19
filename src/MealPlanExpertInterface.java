import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class MealPlanExpertInterface  extends Application {

    Stage window;

    //Scenes
    Scene profileScene;


    //Panes
    VBox profilePane;

    //profileScene tiems
    TextField profileName;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        //Profile pane
        profilePane = new VBox();

    }
}
