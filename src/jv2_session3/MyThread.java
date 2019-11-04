package jv2_session3;

public class MyThread extends Thread {
    public void run(){
        for (int i=0;i<20;i+=2){
            try {
                System.out.println(Thread.currentThread().getName());
                System.out.println(i);
                Thread.sleep(1500);
            }catch (Exception e){

            }
        }
    }
}
