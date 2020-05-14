package com.xd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    public static Stage stage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;
        Parent parent= FXMLLoader.load(getClass().getResource("/fxml/demo.fxml"));
        Scene scene=new Scene(parent);
        stage.initStyle(StageStyle.TRANSPARENT);//UNDECORATED
        stage.setScene(scene);
        stage.show();
    }
}
