/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author manso
 */
public class Final extends Application {
    
   static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        StackPane root = new StackPane();
        System.out.println(getClass().getClassLoader().getResource("fxmlFiles/BookManagementInterface.fxml"));
        root.getChildren().add(FXMLLoader.load(getClass().getClassLoader().getResource("fxmlFiles/MainInterface.fxml")));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void showAddStage() throws Exception{
        
        StackPane root = new StackPane();
        root.getChildren().add(FXMLLoader.load(Final.class.getClassLoader().getResource("fxmlFiles/addBook.fxml")));
        //Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setTitle("Add Student");
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
        dialog.setScene(scene);
        dialog.showAndWait();
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    
    }
    
    public static void showEditStage() throws Exception{
        
        StackPane root = new StackPane();
        root.getChildren().add(FXMLLoader.load(Final.class.getClassLoader().getResource("fxmlFiles/EditBook.fxml")));
        //Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setTitle("Edit Student");
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
        dialog.setScene(scene);
        dialog.showAndWait();
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    
    }
     public static void showEditBorrowerStage() throws Exception{
        
        StackPane root = new StackPane();
        root.getChildren().add(FXMLLoader.load(Final.class.getClassLoader().getResource("fxmlFiles/EditBorrower.fxml")));
        //Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setTitle("Edit Student");
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
        dialog.setScene(scene);
        dialog.showAndWait();
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    
    }
     
      public static void showAddBorrowerStage() throws Exception{
        
        StackPane root = new StackPane();
        root.getChildren().add(FXMLLoader.load(Final.class.getClassLoader().getResource("fxmlFiles/AddBorrower.fxml")));
        //Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setTitle("Edit Borrower");
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
        dialog.setScene(scene);
        dialog.showAndWait();
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    
    }
     
     
     
     public static void showMainInterface() throws Exception{
        
        StackPane root = new StackPane();
        root.getChildren().add(FXMLLoader.load(Final.class.getClassLoader().getResource("fxmlFiles/MainInterface.fxml")));
        //Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setTitle("Register");
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
        dialog.setScene(scene);
        dialog.showAndWait();
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    
    }
     
     public static void showBookManagementInterface() throws Exception{
        
        StackPane root = new StackPane();
        root.getChildren().add(FXMLLoader.load(Final.class.getClassLoader().getResource("fxmlFiles/BookManagementInterface.fxml")));
        //Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setTitle("Register");
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
        dialog.setScene(scene);
        dialog.showAndWait();
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    
    }
     

     
     public static void showBorrowerManagementInterface() throws Exception{
        
        StackPane root = new StackPane();
        root.getChildren().add(FXMLLoader.load(Final.class.getClassLoader().getResource("fxmlFiles/BorrowersManagementInterface.fxml")));
        //Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setTitle("Register");
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
        dialog.setScene(scene);
        dialog.showAndWait();
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    
    }
     
     
    
    
}
