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

        int raund = 1;
        while(f.getTankCount()>1) {
            for (Tank t: f.tanks) {
                Bullet b = t.fire();
                for (Tank tt: f.tanks) {
                    if (!b.getTank().equals(tt)) {
                        if(b.getCenter() + b.getRadius() == tt.getLocationX()){
                            tt.setHp(tt.getHp() - b.getPower());
                            if (tt.getHp()<=0) {
                                f.tanks.remove(tt);

                            }
                        }
                    }
                }
            }
            System.out.println(raund);
            raund++;
            f.showAllTanks();
        }


        for(int i = 0;i<n;i++){
            Tank tt = new Tank(f);
            f.addtank(tt);
        }
        f.showAllTanks();

    }

}
