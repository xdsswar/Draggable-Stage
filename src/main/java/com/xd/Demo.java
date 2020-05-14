package com.xd;

import com.xd.dragable.DragUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Demo extends DragUtil implements Initializable {
    @FXML
    private AnchorPane header;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setDraggable(header,Main.stage);
    }


}
