package session8;

import java.sql.SQLException;
import java.util.MissingFormatWidthException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception{
        int x = 10;
        x++;
        int y;
        System.out.println("NHap y");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        if(y < 0){
            throw new Exception("Khong thich chay nua");
        }
        int z = 9;
        try {
            System.out.println("z = " + z);
            z = x / y;
            System.out.println("z = " + z);
        }catch (ArithmeticException e) {
            System.out.println("Loi so hoc" +e.getMessage());
        }catch (MissingFormatWidthException e){
            System.out.println("Loi format "+e.getMessage());
        }catch (Exception e){
            System.out.println("Loi gi do "+e.getMessage());
        }finally {
            // lúc nào cũng chạy qua
        }
        System.out.println("xong chuong trinh");
    }
}
