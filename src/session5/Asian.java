package session5;

public class Asian extends Human {

    public void sayHi(){

    }

    public void showInfo(){
        super.showInfo();
        System.out.println("override");
    }

    public void sayHello(){
        this.sayHi();
        super.showInfo();
        System.out.println("Hello world");
    }

    public void sayHello(String msg){
        System.out.println(msg);
    }
    public void sayHello(int msg){

    }

    public void sayHello(String msg,int age){

    }

    public void sayHello(int age,String msg){

    }
}
