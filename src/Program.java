import java.util.Scanner;

/**
 * Created by admin on 22.02.2016.
 */
public class Program {
    public static void main(String args[]) {
        Field f = new Field(1000);
        String s = "?write here the number of tanks?";
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            Tank tt = new Tank(f);
            f.addtank(tt);


        }
        f.showAllTanks();

    }

}
