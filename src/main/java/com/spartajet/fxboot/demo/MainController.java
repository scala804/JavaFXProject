package com.spartajet.fxboot.demo;

import java.io.IOException;

import com.spartajet.fxboot.demo.controller.PersonController;
import com.spartajet.fxboot.demo.controller.TableController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainController extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/view/VBoxTable.fxml"));
            // 为表格设置控制器
            loader.setController(new PersonController());
            VBox vBox = loader.load();
            primaryStage.setTitle("数据生成ddddd工具");
            Scene scene = new Scene(vBox);
            primaryStage.sizeToScene();
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}