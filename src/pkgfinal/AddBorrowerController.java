/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import Entities.Books;
import Entities.Borrowers;
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
public class AddBorrowerController implements Initializable {

    @FXML
    private TextField textFieldId;
    @FXML
    private TextField textFieldFirstName;
    @FXML
    private TextField textFieldLastName;
    @FXML
    private TextField textFieldMobile;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private TextField textFieldAdress;
    @FXML
    private TextField textFieldGender;
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
    }    

    @FXML
    private void buttonSaveHandle(ActionEvent event) throws SQLException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Adding new Borrower Confirmation");
        alert.setContentText("Press Ok To Add New Borrower");
        alert.showAndWait();
        if (alert.resultProperty().getValue().getText().equals("OK")) {
            Borrowers b = new Borrowers();
            b.setId(Integer.parseInt(textFieldId.getText()));
            b.setFirst_Name(textFieldFirstName.getText());
            b.setLast_Name(textFieldLastName.getText());
            b.setMobile(Integer.parseInt(textFieldMobile.getText()));
            b.setEmail(textFieldEmail.getText());
            b.setAddress(textFieldAdress.getText());
            b.setGender(textFieldGender.getText());
            EntityManager em = this.emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(b);
            em.getTransaction().commit();
            em.close();
            labaelstate.setText("Added Successfully");
            textFieldId.clear();
            textFieldFirstName.clear();
            textFieldLastName.clear();
            textFieldMobile.clear();
            textFieldEmail.clear();
            textFieldGender.clear();
            textFieldEmail.clear();
            textFieldAdress.clear();
            System.out.println("Done");
            
            
            
            
            
            
            
        }
    }
    
}
