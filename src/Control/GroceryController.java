/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import na1home.Grocery;
// #5e5c65
/**
 * FXML Controller class
 *
 * @author ALAN
 */
public class GroceryController implements Initializable {

    @FXML
    private Label Close;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }

    public void minimize(ActionEvent event) {

    }

    @FXML
    private void test(MouseEvent event) {
      //  ((Node)(event.getSource())).getScene().getWindow().hide();
       ((Stage) ((Node)(event.getSource())).getScene().getWindow()).setIconified(true);
    }

    @FXML
    private void Close(MouseEvent event) {
        Platform.exit();
    }


    
    @FXML
    private void HomeButton(MouseEvent event) {
    }

    @FXML
    private void EntryButton(MouseEvent event) {
        JOptionPane.showMessageDialog(null, "Test With FX");
    }

    
    

    

}
