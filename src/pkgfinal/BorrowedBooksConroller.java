/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import Entities.Books;
import java.net.URL;
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
public class BorrowedBooksConroller implements Initializable {

    private TableView<Books> tableView;
    @FXML
    private TableColumn<Books,Integer> tvId;
    @FXML
    private TableColumn<Books,String> tvName;
    @FXML
    private TableColumn<Books,String> tvDescreption;
    @FXML
    private TableColumn<Books,String> tvAuthor;
    @FXML
    private Button buttonShow;
    @FXML
    private Button buttonReturn;
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
    private void buttonShowHandle(ActionEvent event) {
//        EntityManager em = emf.createEntityManager();
//        List<Books> books = em.createNamedQuery("select * from borrowed books where boroower_id = id:").setParameter("id", pkgfinal.LoginController.loginid).getResultList();
//        tableView.getItems().setAll(books);
    }

    @FXML
    private void buttonReturnHandle(ActionEvent event) {
    }
    
}
