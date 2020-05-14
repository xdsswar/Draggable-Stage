package com.xd.dragable;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public abstract class DragUtil {
    private double x;
    private double y;

    public void setDraggable(Node node, Stage stage){
        node.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton()== MouseButton.PRIMARY){
                    x=event.getSceneX();
                    y=event.getSceneY();
                }
            }
        });

        node.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton()==MouseButton.PRIMARY){
                    stage.setX(event.getScreenX()-x);
                    stage.setY(event.getScreenY()-y);
                }
            }
        });
    }
}
