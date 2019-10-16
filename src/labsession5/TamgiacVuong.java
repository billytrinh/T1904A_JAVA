package labsession5;

public class TamgiacVuong extends Tamgiac {

    public TamgiacVuong(int canh1, int canh2, int canh3) {
        super(canh1, canh2, canh3);
        if(!this.checkTamgiacVuong() ){
            System.out.println("day khong phai tam giac vuong");
        }
    }

    public boolean checkTamgiacVuong(){
        int max = Math.max(Math.max(getCanh1(),getCanh2()),getCanh3());
        if(canh1*canh1 + canh2*canh2+canh3*canh3 == max*max*2){
            return true;
        }
        return false;
    }

}
