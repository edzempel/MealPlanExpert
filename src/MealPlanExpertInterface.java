import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;

public class MealPlanExpertInterface  extends Application {

/*
UI elements must be declared outside of start() so they are
not out of scope for the embedded classes
*/

    Stage window;

    //Scenes
    Scene profileScene;


    //Panes
    VBox profilePane;

    //profileScene items
    TextField profileName;

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        window = primaryStage;
        primaryStage.setTitle("Meal Plan Expert");

        //Declare and instantiate instance profile pane items
        Label profileNameLabel = new Label("Name:");
        profileName = new TextField("name");

        // populate the profile pane
        profilePane = new VBox();
        profilePane.getChildren().add(profileNameLabel);
        profilePane.getChildren().add(profileName);

        // instantiate the profile scene with the pane and dimensions
        profileScene = new Scene(profilePane, 300, 400);


        //populate stage with scene, use this syntax for switching scenes
        //window.setScene(profileScene);

        // initial scene
        primaryStage.setScene(profileScene);
        // call .show() after scene is set, this displays the interface
        primaryStage.show();

    }

}
