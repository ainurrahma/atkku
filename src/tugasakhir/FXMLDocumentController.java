/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */



public class FXMLDocumentController {
    @FXML
    private Pane menghitung;

    @FXML
    private JFXCheckBox pak1;

    @FXML
    private JFXCheckBox pak2;

    @FXML
    private JFXCheckBox pak3;

    @FXML
    private JFXCheckBox pak4;

    @FXML
    private JFXCheckBox pak5;

    @FXML
    private JFXCheckBox pak6;

    @FXML
    private JFXCheckBox pak7;

    @FXML
    private JFXCheckBox pak8;

    @FXML
    private JFXButton btnhitung;
    int total = 0;

    @FXML
    private JFXButton btnabout;

    @FXML
    void paket1(ActionEvent event) {

    }

    @FXML
    void paket2(ActionEvent event) {

    }

    @FXML
    void paket3(ActionEvent event) {

    }

    @FXML
    void paket4(ActionEvent event) {

    }

    @FXML
    void paket5(ActionEvent event) {

    }

    @FXML
    void paket6(ActionEvent event) {

    }

    @FXML
    void paket7(ActionEvent event) {

    }

    @FXML
    void paket8(ActionEvent event) {

    }
    
  @FXML
    void hitung(ActionEvent event) {
        if(!(pak1.isSelected()) && !(pak2.isSelected()) && !(pak3.isSelected()) && !(pak4.isSelected()) && !(pak5.isSelected())  && !(pak6.isSelected()) && !(pak7.isSelected()) && !(pak8.isSelected())){
            JOptionPane.showMessageDialog(null, "Tolong diisi");
        }
        else{
       if(pak1.isSelected()){
           int harga = 125000;
           total +=  harga;
       }
       if(pak2.isSelected()){
           int harga = 120000;
           total +=  harga;
       }
       if(pak3.isSelected()){
           int harga = 130000;
           total +=  harga;
       }
       if(pak4.isSelected()){
           int harga = 300000;
           total += harga;
       }
       if(pak5.isSelected()){
           int harga = 180000;
           total +=  harga;
       }
       if(pak6.isSelected()){
           int harga = 250000;
           total +=  harga;
       }
       if(pak7.isSelected()){
           int harga = 100000;
           total +=  harga;
       }
       if(pak8.isSelected()){
           int harga = 150000;
           total += harga;
       }
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLHasil.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("ART Kantor ku");
            stage.show();
            FXMLHasilController d = new FXMLHasilController();
            d = fxmlLoader.getController();
            System.out.println(total);
            d.setTotal(total);
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }
    
}

