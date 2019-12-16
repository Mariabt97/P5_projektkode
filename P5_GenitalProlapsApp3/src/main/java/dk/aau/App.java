package dk.aau;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {   //Define class and extends with the Application class which holds javafx applications
    private Stage primaryStage;          //Initialize stage as primaryStage, defined as private
    private static BorderPane menuLayout; //Initialize BorderPane as menuLayout and define it as private static

    @Override
    public void start(Stage primaryStage) throws IOException { //Method which starts javafx applications
        this.primaryStage = primaryStage;                      
        this.primaryStage.setTitle("GenitalProlapsApp");       //Setting titel for primary stage as "GenitalProlapsApp" 

        showMenuLayout();                                      //Calling method which displays menu layout
        showFrontPage();                                    //Calling method which displays home overview
    }

    private void showMenuLayout() throws IOException {       //Initializing method as "showMenuLayout"
        FXMLLoader loader = new FXMLLoader();                //Loads object from FXML file and creates a new instance 
        loader.setLocation(App.class.getResource("/MenuView.fxml")); //Sets the path from which to find the FXML file
        menuLayout = loader.load();                            //Loads the FXML file
        Scene scene = new Scene(menuLayout);                   //Creates a scence initialized "scene" and makes a new instance 
        primaryStage.setScene(scene);                          //Specify the scene to be used on this stage
        primaryStage.show();                                   //Attempts to show this Window by setting visibility to true
    }

    public static void showFrontPage() throws IOException {  //Initializing method as "showHomeOverview"
        FXMLLoader loader = new FXMLLoader();                   //Loads object from FXML file and creates a new instance
        loader.setLocation(App.class.getResource("/FrontPageView.fxml")); //Sets the path from which to find the FXML file
        BorderPane frontpage = loader.load();                         //Loads the FXML file and initializing BorderPane as "menu"
        menuLayout.setCenter(frontpage);                              //Placing the node at the center of BorderPane

    }

    public static void showAnatomyScene() throws IOException{   //Initializing method as "showAnatomyScene"
        FXMLLoader loader = new FXMLLoader();                   //Loads object from FXML file and creates a new instance
        loader.setLocation(App.class.getResource("/AnatomyView.fxml")); //Sets the path from which to find the FXML file
        BorderPane anatomyScene = loader.load();                   //Loads the FXML file and initializing BorderPane as "anatomyScene"
        menuLayout.setCenter(anatomyScene);                        //Placing the node at the center of BorderPane
    }

    public static void main(String[] args) {                      //Launch a standalone application
        launch(args);
    }
}

