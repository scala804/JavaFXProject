package com.spartajet.fxboot.demo.controller;

import com.spartajet.fxboot.demo.bean.Person;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Callback;
import java.net.URL;
import java.util.ResourceBundle;



public class PersonController implements Initializable {

    @FXML
    private Label fxLabel;
    @FXML
    private  VBox vBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

      /*  fxLabel.setText("Address Book");
        fxLabel.setFont(new Font("Arial", 20));*/
        /*vBox.getChildren().addAll(fxLabel);*/
    }
}
