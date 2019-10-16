package session5;

public class Main {
    public static void main(String args[]){
        String birthday = "2001-02-22";
        String[] arr = birthday.split("-");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int year = Integer.parseInt(arr[0]);
        System.out.println("Year: "+year);
        Asian a1 = new Asian();
        a1.inputInfo();
        a1.showInfo();
        a1.age = 18;
        a1.sayHello();
        a1.sayHello("abc");
        a1.showInfo();
        Human h1 = new Human();

    }
}
