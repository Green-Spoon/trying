package com.example.trying;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.application.Platform;


public class App extends Application {
    private static Scene scene;
    private static Stage appStage;

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("landing-page.fxml"));
        Scene scene = new Scene(loadFXML("landing-page"), 1280, 720);
        stage.setTitle("CPS");
        stage.setScene(scene);
        appStage = stage;
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void setWindowTitle(String title) {
        appStage.setTitle(title);
    }
    public static void setContent(String pageName) throws IOException {
        Parent root = loadFXML(pageName);
        scene = new Scene(root);
        appStage.setScene(scene);
        appStage.show();
    }

    public static void switchScreenMain (String screenName, String pageName){
        Platform.runLater(() -> {
            setWindowTitle(screenName);
            try {
                setContent(pageName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}