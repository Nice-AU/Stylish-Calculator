/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package na1home;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author ALAN
 */
public class Grocery extends Application {
Stage primaryStageTemp = new Stage();
Parent roots;
    @Override
    public void start(Stage primaryStage) throws java.lang.ClassNotFoundException, java.lang.NullPointerException {
        primaryStageTemp = primaryStage;
        try {
            File f = new File("file:/C:/Users/ALAN/Documents/NetBeansProjects/NA1Home/build/classes/FXMLALL/Grocery.fxml");
            Parent root = FXMLLoader.load(getClass().getResource("/FxmlA/Grocery.fxml"));
          //   Parent root = f;
            System.out.println(getClass().getResource("/FxmlA/Grocery.fxml"));
            roots = root;
            MovableWindow();
            
            Scene scene = new Scene(root);

            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);

            primaryStage.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(Color.TRANSPARENT);
            primaryStage.setResizable(false);
           
            

            primaryStage.show();
            primaryStage.centerOnScreen();
            //cetre screen
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); // get screen size

            primaryStage.setX(d.width / 2 - (primaryStage.getWidth() / 2));
            primaryStage.setY(d.height / 2 - (primaryStage.getHeight() / 2));

//icon
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/Data/Page.png")));
        } catch (IOException ex) {
          java.util.logging.Logger.getLogger(Grocery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         // JOptionPane.showMessageDialog(null, ex);
        } catch (NullPointerException exc){
        JOptionPane.showMessageDialog(null, exc);
        }

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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        launch(args);
        }catch (NullPointerException npe) {
    
}
    }

}
