package dk.aau.address.controller;

import java.io.IOException;
import dk.aau.App;
import javafx.fxml.FXML;

public class MenuCtrl{  //Initializing class as "MenuController" and defines the class public 
    private App app;     //Gives permission to acces main class

    @FXML                //Enabels connection to FXML files
    private void goBack() throws IOException{       //Initializing method as "goBack", defined private
        app.showFrontPage();                     //Calls the method "showHomeOverview" in main class 
    }
    @FXML 
    private void goAnatomyFromMenu() throws IOException{   //Initializing method as "goAnatomyFromMenu", defined private
        app.showAnatomyScene();                             //Calls the method "showAnatomyScene" in main class
    }


}  