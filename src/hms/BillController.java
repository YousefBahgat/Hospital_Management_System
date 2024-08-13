/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class BillController implements Initializable {
   @FXML
   TextField fn,sn,ra,tp,rr;
    public void billdetails(String fname,String sname,double amount,double paid,double remainder){
     fn.setText(fname);
     sn.setText(sname);
     ra.setText(amount+"");
     tp.setText(paid+"");
     rr.setText(remainder + "");   
    }
    @FXML
    private void returnn(MouseEvent e) throws IOException{
       Parent start = FXMLLoader.load(getClass().getResource("appointments.fxml"));
        Scene scene = new Scene(start);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
