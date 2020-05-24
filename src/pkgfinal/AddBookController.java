/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import Entities.Books;
import java.net.URL;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class AddBookController implements Initializable {

    Statement statement;
    Connection connection;
    @FXML
    private TextField textFieldId;
    @FXML
    private TextField textFieldName;
    @FXML
    private TextField textFieldBookDescription;
    @FXML
    private TextField textFieldAuthor;
    @FXML
    private Button buttonAdd;
    @FXML
    private Label labelstate;
    private EntityManagerFactory emf;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emf = Persistence.createEntityManagerFactory("FinalPU");
        
        
    }
      

    @FXML
    private void buttonAddHandle(ActionEvent event) throws SQLException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Adding new Book Confirmation");
        alert.setContentText("Press Ok To Add New Book");
        alert.showAndWait();
        if (alert.resultProperty().getValue().getText().equals("OK")) {
            Books b = new Books();
            b.setId(Integer.parseInt(textFieldId.getText()));
            b.setName(textFieldName.getText());
            b.setDescription(textFieldBookDescription.getText());
            b.setAuthor(textFieldAuthor.getText());
            EntityManager em = this.emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(b);
            em.getTransaction().commit();
            em.close();
            labelstate.setText("Added Successfully");
            textFieldId.clear();
            textFieldName.clear();
            textFieldBookDescription.clear();
            textFieldAuthor.clear();
            System.out.println("Done");
        }

    }

}
