package jv2_session9;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String args[]){
        Locale vn = new Locale("vi","VN");
        Locale.setDefault(vn);
        ResourceBundle bundle = ResourceBundle.getBundle("jv2_session9.Messages");
        System.out.println(bundle.getString("hello"));

        Locale.setDefault(Locale.US);
        ResourceBundle bundle2 = ResourceBundle.getBundle("jv2_session9.Messages");
        System.out.println(bundle2.getString("hello"));
    }
}
