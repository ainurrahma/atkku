/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLHasilController implements Initializable {

    @FXML
    private JFXButton btncetak;
    @FXML
    private JFXTextArea hasilpesan;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXDatePicker tanggal;
    @FXML
    private JFXTextField totalharga;
    @FXML
    private JFXTextField paket;
     @FXML
    void login(ActionEvent event) {
         try {
            
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLLogin.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("ART Kantor ku");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }

    

    int total;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String t = String.valueOf(total);
        totalharga.setText(t);
        System.out.println(total);
    }    
    public void setTotal(int total) {
        this.total = total;
        String ttlhrg = String.valueOf(total);
        totalharga.setText(ttlhrg);
    }
    String tg = String.valueOf(tanggal);
    
    @FXML
    private void cetakpemesanan(ActionEvent event) {
       
       
        String ttl = totalharga.getText();
        String nm = nama.getText();
        String tgl = tanggal.getValue().toString();
        String pkt = paket.getText();
        if (nm.equals("")){
            JOptionPane.showMessageDialog(null,"isi nama anda!!!");
        }
        else if(tgl.equals("")){
            JOptionPane.showMessageDialog(null,"isi tanggal pembelian!!!");
        }
        else if(pkt.equals("")){
            JOptionPane.showMessageDialog(null,"isi paket yang anda pilih!!!");
        }
        else{
        hasilpesan.setText("Nama : "+nm+"\nTanggal Pembelian : "+tgl+"\nPaket yang dipilih : "+pkt+"\nTotal Harga : "+ttl);
        }
        
}
}
