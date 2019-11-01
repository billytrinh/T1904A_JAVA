package jv2_session2;

public class Generic <E>{
    public E gName;

    public E getGName(){
        return gName;
    }

    public void setGName(E gName){
        this.gName = gName;
    }

    public <T> void xuatKetQua(T x, T y){
        if(x instanceof Integer){
            int a = (Integer) x;
            int b = (Integer)y;
            System.out.println(a+b);
        }else if(x instanceof Double){
            double a = (Double)x;
            double b = (Double)y;
            System.out.println(a+b);
        }else {
            System.out.println(x.toString()+y.toString());
        }
    }


}
