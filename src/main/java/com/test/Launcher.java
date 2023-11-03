package com.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hello World!");
//            }
//        });
//
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//
//        Scene scene = new Scene(root,300,250);



        Parent parent = FXMLLoader.load(getClass().getResource("view/first.fxml"));
        Scene scene = new Scene(parent,300,250);

        stage.setScene(scene);
        stage.show();

    }
}