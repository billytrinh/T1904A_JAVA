package session8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DemoTime {
    public static void main(String args[]){
        LocalDate ld = LocalDate.now();
        System.out.println("Year: "+ld.getYear());
        System.out.println("Month: "+ld.getMonth());
        System.out.println("Month: "+ld.getMonthValue());
        System.out.println("Day: "+ld.getDayOfWeek());
        System.out.println("Day: "+ld.getDayOfMonth());
        System.out.println("Day: "+ld.getDayOfYear());

        LocalDate ld2 = LocalDate.of(1999,2,28);
        System.out.println("Year: "+ld2.getYear());
        System.out.println("Month: "+ld2.getMonth());
        System.out.println("Month: "+ld2.getMonthValue());
        System.out.println("Day: "+ld2.getDayOfWeek());
        System.out.println("Day: "+ld2.getDayOfMonth());
        System.out.println("Day: "+ld2.getDayOfYear());

        System.out.println(ld2);
        LocalDate ld3 = ld2.plusDays(1);
        if(ld3.getDayOfMonth() == 29){
            System.out.println("Nam nhuan "+ld3.getYear());
        }
        LocalDate l1 = LocalDate.of(2401,2,28);
        for (int i=1;true;i++){
            LocalDate l2 = l1.plusDays(1);
            if(l2.getDayOfMonth() == 29){
                l1=l2;
                break;
            }
            l1 = l1.plusYears(1);
        }
        // l1 la nam nhuan dau tien tk 25
        // cach 2
        for (int i=2401;i<=2500;i++){
            //if(LocalDate.of(i,12,31).getDayOfYear() == 366){
            if(LocalDate.of(i,2,28).plusDays(1).getDayOfMonth() == 29){
                System.out.println(i);
            }
        }

        LocalDate lx = LocalDate.now();
        LocalDate lx2 = lx.minusDays(2);

        LocalDate birthday = LocalDate.parse("1999-03-07");
        System.out.println(birthday);

        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);

        LocalDateTime t2 = LocalDateTime.of(2011,2,13,5,22,44,12);
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.parse("2019-10-23T15:27:12");
        System.out.println(t3);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/YYYY H:mm:s");
        System.out.println(t3.format(dtf));

        IFunction f1 = new IFunction() {
            @Override
            public void sayHello(int a,int b) {
                System.out.println("Say hello...");
            }
        };
        f1.sayHello(4,5);

        IFunction f2 = (int a,int b)->{
            System.out.println("Say Hi.....");
        };
        f2.sayHello(4,5);

        IFunction f3 = (a,b)->{

        };

        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("abc");
        arr.add("cda");
        arr.stream().sorted().filter(s -> {
                        return s.contains("a");
        }).map(s->{
            return s.toUpperCase();
        })
                .forEach(s->{
                    System.out.println(s);
                  });
        for (String str:arr){
            System.out.println(str);
        }
    }
}
