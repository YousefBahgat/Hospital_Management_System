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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class ReceptionistPortalController implements Initializable {
    @FXML
    TextField us;
    @FXML 
    PasswordField pass;

    @FXML
    private void mousepressedreturn(MouseEvent event)throws IOException {
        Parent start = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(start);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML
    private void LoginReceptionist(ActionEvent event)throws IOException{
    Boolean valid;
    Receptionist A= new Receptionist();
    A.setUsernamee(us.getText());
    A.setPasswordd((String)pass.getText());
    valid=A.Login();
    if(valid==true){
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("receptionistdata.fxml"));
        Parent Receptionistdata = Loader.load();
        Scene scene = new Scene(Receptionistdata);
        ReceptionistdataController controller = Loader.getController();
        controller.getlogindata(us.getText(),(String)pass.getText());
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show(); 
    }
    else
    {
        JOptionPane.showMessageDialog(null,"invalid Username or Password" + "\n" + "try again");
    }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
