package jv2_session1;

public class Moto implements Comparable<Moto>{
    public String name;
    public int age;

    public static boolean f = true;

    public Moto(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Moto o) {
        if(f){
            return this.name.compareTo(o.name);
        }

        else {
            if(this.age < o.age){
                return -1;
            }else{
                return 1;
            }
        }

    }
}
