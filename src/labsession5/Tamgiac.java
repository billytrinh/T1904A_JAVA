package labsession5;

public class Tamgiac {
    public int canh1;
    public int canh2;
    public int canh3;

    public Tamgiac() {
    }

    public Tamgiac(int canh1, int canh2, int canh3) {
        if(canh1+canh2>canh3 && canh2+canh3>canh1 && canh1+canh3>canh2){
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
        }else {
            System.out.println("Day khong phai 3 canh tam giac");
        }
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public int chuVi(){
        return getCanh1()+getCanh2()+getCanh3();
    }

    public double dienTich(){
        double P = (double)this.chuVi()/2;
        return Math.sqrt(P*(P-getCanh1())*(P-getCanh2())*(P-getCanh3()));
    }
}
