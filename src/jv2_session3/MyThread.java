package jv2_session3;

public class MyThread extends Thread {
    public void run(){
        for (int i=10;i>=0;i--){
            try {
               // System.out.println(Thread.currentThread().getName());
                System.out.println(i);
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
        System.out.println("Chuc mung nam moi");
    }
}
