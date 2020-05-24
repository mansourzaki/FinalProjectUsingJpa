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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static pkgfinal.BookManagementInterfaceConroller.SelectedBook;

/**
 * FXML Controller class
 *
 * @author manso
 */
public class BorrowersManagementInterfaceController implements Initializable {
    Statement statement;
    Connection connection;
    public static Borrowers SelectedBorrower = new Borrowers();
    public static int  ids = 0;
    @FXML
    private TableView<Borrowers> tableView;
    @FXML
    private TableColumn<Borrowers, Integer> tvId;
    @FXML
    private TableColumn<Borrowers, String> tvFirstName;
    @FXML
    private TableColumn<Borrowers, String> tvLastName;
    @FXML
    private TableColumn<Borrowers, Integer> tvMobile;
    @FXML
    private TableColumn<Borrowers, String> tvEmail;
    @FXML
    private TableColumn<Borrowers, String> tvAddress;
    @FXML
    private TableColumn<Borrowers, String> tvGender;
    @FXML
    private Button buttonSearch;
    @FXML
    private Button buttonShow;
    @FXML
    private Button buttondeleteborrower;
    @FXML
    private Button buttonUpdateBorrower;
    @FXML
    private Button buttonaddborrower;
    private EntityManagerFactory emf;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emf = Persistence.createEntityManagerFactory("FinalPU");
        tvId.setCellValueFactory(new PropertyValueFactory("Id"));
        tvFirstName.setCellValueFactory(new PropertyValueFactory("First_Name"));
        tvLastName.setCellValueFactory(new PropertyValueFactory("Last_Name"));
        tvMobile.setCellValueFactory(new PropertyValueFactory("Mobile"));
        tvEmail.setCellValueFactory(new PropertyValueFactory("Email"));
        tvAddress.setCellValueFactory(new PropertyValueFactory("Address"));
        tvGender.setCellValueFactory(new PropertyValueFactory("Gender"));
    }    

    @FXML
    private void buttonSearchHandle(ActionEvent event) {
    }

    @FXML
    private void buttonShowHandle(ActionEvent event) throws SQLException {
          EntityManager em = emf.createEntityManager();
          List<Borrowers> borrowers = em.createNamedQuery("Borrowers.findAll").getResultList();
          tableView.getItems().setAll(borrowers);
 
    }
    
    

    @FXML
    private void buttonDeleteBorrowerHandle(ActionEvent event) throws SQLException {
       SelectedBorrower = tableView.getSelectionModel().getSelectedItem();
       Borrowers b = SelectedBorrower;
        if (SelectedBook != null) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        b = em.merge(b);
        em.remove(b);
        em.getTransaction().commit();
        em.close();
        }
        buttonShow.fire();
        
    } 
       

    @FXML
    private void buttonUpdateBorrowerHandle(ActionEvent event) throws Exception {
        SelectedBorrower = tableView.getSelectionModel().getSelectedItem();
        Final.showEditBorrowerStage();
    }

    @FXML
    private void buttonAddBorrowerHandle(ActionEvent event) throws Exception {
        Final.showAddBorrowerStage();
    }
    

}
