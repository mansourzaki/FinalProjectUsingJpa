/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import Entities.Users;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import sun.security.jgss.LoginConfigImpl;

/**
 * FXML Controller class
 *
 * @author manso
 */
public class LoginController implements Initializable {

    @FXML
    private TextField textFieldusername;
   
    @FXML
    private TextField textFieldPassword;
    @FXML
    private Button buttonLogin;
    @FXML
    private Label labelStatus;
    private EntityManagerFactory emf;
   // public static String loginid = "";
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emf = Persistence.createEntityManagerFactory("FinalPU");
    }    

    @FXML
    private void buttonLoginHandler(ActionEvent event) throws Exception {
      
        if (textFieldusername.getText().equals("root") && textFieldPassword.getText().equals("123456789") ) {
            Final.showMainInterface();
            labelStatus.setText("Great!");
          //  loginid = textFieldusername.getText();
        }else{
        labelStatus.setText("Incorrecrt username Or Password");
        labelStatus.setStyle("-fx-text-fill: red;");
        }
    }
    
}
