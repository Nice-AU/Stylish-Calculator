/*
    Calculator.java
    Main Application class
 */
package Calc;

import java.util.HashMap;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Calculator extends Application {
Stage primaryStageTemp = new Stage();
Parent roots = null;
    @Override
    public void start(Stage stage) throws Exception {
        primaryStageTemp = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/Calc/main.fxml"));
        Scene scene = new Scene(root);
        roots = root;
       
            MovableWindow();
        stage.setScene(scene);
       // stage.setMinWidth(350);
       // stage.setMinHeight(510);
        stage.setResizable(true);
        stage.initStyle(StageStyle.UNIFIED);
        stage.setTitle("Calculator NA1");
        stage.getIcons().add(new Image(getClass().getResource("/Calc/Calculator-icon.png").toExternalForm()));
        stage.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(Color.TRANSPARENT);
            stage.setResizable(false);
            

           
        stage.show();
        calcmethod();
    }

        private double xOffset = 0;
    private double yOffset = 0;

    public void MovableWindow(){
//            primaryStageTemp.initStyle(StageStyle.UNDECORATED);
//        BorderPane roots = new BorderPane();

        roots.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        roots.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStageTemp.setX(event.getScreenX() - xOffset);
                primaryStageTemp.setY(event.getScreenY() - yOffset);
            }
        });

    }
        private HashMap<String, Boolean> currentlyActiveKeys = new HashMap<>();

        public void calcmethod() throws InterruptedException{
            Controller tx = new Controller();
          
   //       tx.normalModePane.setOnKeyPressed(tx::keyHandler);

        }

    public static void main(String[] args) {
        launch(args);
    }
}
