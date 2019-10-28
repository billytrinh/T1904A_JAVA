package jv2_lab;

public class PhoneNumber implements Comparable<PhoneNumber>{
    public String name;
    public String phone;

    public static String sortBy = "name";
    public static String sortOrder = "ASC";

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        if(PhoneNumber.sortBy.equals("name")){
            if(PhoneNumber.sortOrder.equals("ASC")){
                return this.getName().compareTo(o.getName());
            }else {
                return -this.getName().compareTo(o.getName());
            }
        }else{
            if(PhoneNumber.sortOrder.equals("ASC")){
                return this.getPhone().compareTo(o.getPhone());
            }else {
                return -this.getPhone().compareTo(o.getPhone());
            }
        }
    }
}
