package jv2_session3;

public class Subthread2 implements Runnable {
    @Override
    public void run() {
       for (int i=9;i>=0;i--){
           for (int j=59;j>=0;j--){
               try {
                   //System.out.println((i>=10?"":"0")+i+":"+(j>=10?"":"0")+j);
                   System.out.println(String.format("%02d",i)+":"+String.format("%02d",j));
                   Thread.sleep(100);
               }catch (Exception e){

               }
           }
       }
        System.out.println("Boom...");
    }
}
