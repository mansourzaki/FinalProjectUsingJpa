/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import Entities.Books;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author manso
 */
public class EditBookController implements Initializable {
    Statement statement;
    Connection connection;
    @FXML
    private TextField textFieldId;
    @FXML
    private TextField textFieldName;
    @FXML
    private TextField textFieldDescription;
    @FXML
    private TextField textFieldAuthor;
    @FXML
    private Button buttonSave;
    @FXML
    private Label labaelstate;
    private EntityManagerFactory emf;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emf = Persistence.createEntityManagerFactory("FinalPU");
       this.textFieldId.setText(String.valueOf(BookManagementInterfaceConroller.SelectedBook.getId()));
       this.textFieldName.setText(BookManagementInterfaceConroller.SelectedBook.getName());
       this.textFieldDescription.setText(BookManagementInterfaceConroller.SelectedBook.getDescription());
       this.textFieldAuthor.setText(BookManagementInterfaceConroller.SelectedBook.getDescription());
        System.out.println("Done");
       
    }    

    @FXML
    private void buttonSaveHandle(ActionEvent event) throws SQLException {
        try{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Updating Book Details Confirmation");
        alert.setContentText("Press Ok To Update");
        alert.showAndWait();
        if (alert.resultProperty().getValue().getText().equals("OK")) {
        Books b = new Books();
        b.setId(Integer.parseInt(textFieldId.getText())); 
        b.setName(textFieldName.getText());
        b.setDescription(textFieldDescription.getText()); 
        b.setAuthor(textFieldAuthor.getText());
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(b);
        em.getTransaction().commit();
        em.close();
            labaelstate.setText("Updated Successfully");
        }
        
        }catch(Exception e){
         
            System.out.println("Can't Update Id"); 
        }
        
       
        
    }
    
}
