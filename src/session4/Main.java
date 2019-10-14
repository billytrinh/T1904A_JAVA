package session4;

import labsession3.Fraction;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList arrList = new ArrayList();
        arrList.add(3);
        arrList.add("xin chao");
        arrList.add(1,4);

        for (int i=0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }
        ArrayList arr2 = new ArrayList();
        arr2.add(17);

        System.out.println("Mang thu 2");
        arr2.addAll(1,arrList);
        for (int i=0;i<arr2.size();i++){
            System.out.println(arr2.get(i));
        }

        Fraction fr = new Fraction();
        arr2.add(fr);

        ArrayList<Fraction> frList = new ArrayList<>();
//        frList.add(3);
//        frList.add("haha");
        frList.add(fr);
        frList.add(new Fraction());
        for(Fraction f: frList){
            f.nhapPhanSo();
        }
        for(Fraction f: frList){
            f.inPhanSo();
           // frList.indexOf(f);
        }

        ArrayList<String> strArr=  new ArrayList<>();

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(4);
        int x = 10;
        x += intArr.get(0);
        System.out.println(intArr.get(0).toString());
        System.out.println(intArr.get(0));
        Float f=  new Float(3.15);
        float fx = (float)3.15;
        String xx = fx+ "";
        Float f1 = new Float("3.14");
        fx = fx + f1;
        System.out.println(f.toString());

        if(f.toString().equals("haha")){

        }
    }
}
