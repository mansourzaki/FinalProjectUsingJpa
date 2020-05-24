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

/**
 * FXML Controller class
 *
 * @author manso
 */
public class BookManagementInterfaceConroller implements Initializable {
    Statement statement;
    Connection connection;
   
    public static int  ids = 0;
    @FXML
    private TableView<Books> tableView;
    public static Books SelectedBook = new Books();
            
    @FXML
    private TableColumn<Books,Integer> tvId;
    @FXML
    private TableColumn<Books,String> tvName;
    @FXML
    private TableColumn<Books,String> tvDescreption;
    @FXML
    private TableColumn<Books,String> tvAuthor;
    @FXML
    private Button buttonSearch;
    @FXML
    private Button buttonShow;
    @FXML
    private Button buttonDelete;
    @FXML
    private Button buttonUpdateBook;
    @FXML
    private Button buttonaddBook;
    private EntityManagerFactory emf;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emf = Persistence.createEntityManagerFactory("FinalPU");
        tvId.setCellValueFactory(new PropertyValueFactory("id"));
        tvName.setCellValueFactory(new PropertyValueFactory("name"));
        tvDescreption.setCellValueFactory(new PropertyValueFactory("description"));
        tvAuthor.setCellValueFactory(new PropertyValueFactory("author"));
    }    

    @FXML
    private void buttonSearchHandle(ActionEvent event) {
    }

    @FXML
    private void buttonShowHandle(ActionEvent event) throws SQLException {
       EntityManager em = emf.createEntityManager();
        List<Books> books = em.createNamedQuery("Books.findAll").getResultList();
        tableView.getItems().setAll(books);
    }

    @FXML
    private void buttonDeleteHandle(ActionEvent event) throws SQLException {
       SelectedBook = tableView.getSelectionModel().getSelectedItem();
       Books b = SelectedBook;
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
    private void buttonUpdateBookHandle(ActionEvent event) throws Exception {
        SelectedBook = tableView.getSelectionModel().getSelectedItem();
        Final.showEditStage();
    }

    @FXML
    private void buttonAddBookHandle(ActionEvent event) throws Exception {
        Final.showAddStage();
    }
    
}
