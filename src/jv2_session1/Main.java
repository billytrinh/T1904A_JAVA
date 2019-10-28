package jv2_session1;

import java.util.*;

public class Main {
    public static void main(String args[]){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        for (String x:arrayList){
           // System.out.println(x);
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("hello");
        hashSet.add("world");
        for (String x: hashSet){
            System.out.println(x);
        }
        System.out.println("Vi du Queue");
        PriorityQueue<String> strQueue =  new PriorityQueue<>();
        strQueue.add("d");
        strQueue.add("e");
        strQueue.add("c");
        strQueue.add("z");
        strQueue.add("g");
        for (String x : strQueue){
            System.out.println(x);
        }

        PriorityQueue<Moto> moto = new PriorityQueue<>();
        moto.add(new Moto("Toyota",12));
        moto.add(new Moto("Honda",5));
        moto.add(new Moto("Nissan",7));
        for (Moto m: moto){
            System.out.println(m.name+"--"+m.age);
        }
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("label1",12);
        hashMap.put("abc",100);
        System.out.println(hashMap.get("label1"));

        HashMap<Integer,Moto> motoHashMap = new HashMap<>();
        motoHashMap.put(1,new Moto("Ben",1));
        System.out.println(motoHashMap.get(1).name);

        LinkedHashSet<Moto> abc = new LinkedHashSet<>();
        moto.add(new Moto("Toyota",12));
        moto.add(new Moto("Honda",5));
        moto.add(new Moto("Nissan",7));


    }
}
