package com.isep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lobby.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 725, 375);
        stage.setTitle("Mini RPG Lite 3000");
        stage.setScene(scene);
        stage.show();

        String uriString = new File("D:\\Cours\\Isep\\A1\\Algorithmique\\isep\\src\\main\\resources\\com\\isep\\music\\drillScooby.mp3").toURI().toString();
        MediaPlayer player = new MediaPlayer( new Media(uriString));
        player.play();
        player.setAutoPlay(true);

    }

    public static void main(String[] args) {
        launch();
    }
}