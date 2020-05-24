/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author manso
 */
public class MainInterfaceController implements Initializable {

   @FXML
    private Button buttonborrowedbooks;
    @FXML
    private Button buttonmanageborrowers;
    @FXML
    private Button buttonmanagebooks;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonManageBorrowedBooksHandle(ActionEvent event) throws Exception {
        
    }

    @FXML
    private void buttonManageBorrowersHandle(ActionEvent event) throws Exception {
        Final.showBorrowerManagementInterface();
    }

    @FXML
    private void buttonManageBooksHandle(ActionEvent event) throws Exception {
        Final.showBookManagementInterface();
    }
    
}
