import java.util.ArrayList;
import java.util.Random;

/**
 * Created by admin on 22.02.2016.
 */
public class Field {
    private int size;
    public ArrayList<Tank> tanks;

    public Field(int size) {
        this.size = size;
        tanks = new ArrayList<Tank>();

    }
    public void addtank(Tank t) {
        tanks.add(t);

    }
    public void showAllTanks() {
        for(int i=0;i<tanks.size();i++){
            System.out.println(tanks.get(i));


        }
    }

    public int getTankCount() {
        return tanks.size();
    }

    public int getSize() {
        return size;
    }
}
