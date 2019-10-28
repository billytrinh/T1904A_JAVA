package jv2_lab;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.util.PriorityQueue;

public class AddPhone {
    public TextField txtName = new TextField();
    public TextField txtTel = new TextField();

    public void savePhone(){
        String name = txtName.getText();
        String phone = txtTel.getText();

        this.addPhoneToList(name,phone);
        try {
            Parent listphone = FXMLLoader.load(getClass().getResource("listphone.fxml"));
            Main.mainStage.getScene().setRoot(listphone);
        }catch (Exception e){

        }

    }

    public void addPhoneToList(String name,String phone){
        for (PhoneNumber p: ListPhone.list){
            if(p.getName().equals(name)){
                if(!p.getPhone().contains(phone)){
                    p.setPhone(p.getPhone()+":"+phone);
                }
                return;
            }
        }
        ListPhone.list.add(new PhoneNumber(name,phone));
        this.sortTelephone("telephone","ASC");
    }

    public void sortTelephone(String sortBy,String sortOrder){
        PhoneNumber.sortBy = sortBy;
        PhoneNumber.sortOrder = sortOrder;
        PriorityQueue<PhoneNumber> phoneNumbers = new PriorityQueue<>();
        phoneNumbers.addAll(ListPhone.list);
        ListPhone.list.clear();
        //ListPhone.list.addAll(phoneNumbers);
        while (!phoneNumbers.isEmpty()){
            ListPhone.list.add(phoneNumbers.poll());
        }
    }
}
