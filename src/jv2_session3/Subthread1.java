package jv2_session3;

public class Subthread1 extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            try {
                System.out.println(Thread.currentThread().getName()+" ... "+i);
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }
}
