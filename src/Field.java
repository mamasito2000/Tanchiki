import java.util.ArrayList;

/**
 * Created by admin on 22.02.2016.
 */
public class Field {
    private int size;
    private ArrayList<Tank> tanks;

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
}
