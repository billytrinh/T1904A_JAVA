package labsession5;

public class TamgiacDeu extends TamgiacCan{

    public TamgiacDeu(int canh1, int canh2, int canh3) {
        super(canh1, canh2, canh3);
        if(!checkTamgiacDeu()){
            System.out.println("day khong phai tam giac deu");
        }
    }

    public boolean checkTamgiacDeu(){
        if(getCanh1() == getCanh2() && getCanh2() == getCanh3()){
            return true;
        }
        return false;
    }
}
