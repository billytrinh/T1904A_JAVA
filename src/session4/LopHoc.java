package session4;

import java.util.ArrayList;

public class LopHoc {
    public int maLop;
    public String phongHoc;
    public ArrayList<SinhVien> dsSinhVien ;//= new ArrayList<>();

    public LopHoc(){
        dsSinhVien = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv){
        this.dsSinhVien.add(sv);
    }
}
