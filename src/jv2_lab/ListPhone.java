package jv2_lab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.PriorityQueue;
import java.util.ResourceBundle;

public class ListPhone implements Initializable {
    public TableView<PhoneNumber> tbView = new TableView<>();
    public TableColumn<PhoneNumber,String> colName = new TableColumn<>();
    public TableColumn<PhoneNumber,String> colTel = new TableColumn<>();

    public static ObservableList<PhoneNumber> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colTel.setCellValueFactory(new PropertyValueFactory<>("phone"));

        tbView.setItems(list);
    }

    public void addTelephone(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("addphone.fxml"));
            Main.mainStage.getScene().setRoot(form);
//            Stage s2 = new Stage();
//            s2.setScene(new Scene(form,600,400));
//            s2.show();
        }catch (Exception e){

        }
    }

    public void sortTelephone(){
        if(PhoneNumber.sortOrder.equals("ASC")){
            PhoneNumber.sortOrder= "DESC";
        }else{
            PhoneNumber.sortOrder= "ASC";
        }
        PriorityQueue<PhoneNumber> phoneNumbers = new PriorityQueue<>();
        phoneNumbers.addAll(ListPhone.list);
        ListPhone.list.clear();
        //ListPhone.list.addAll(phoneNumbers);
        while (!phoneNumbers.isEmpty()){
            ListPhone.list.add(phoneNumbers.poll());
        }
        tbView.setItems(list);
    }
}
