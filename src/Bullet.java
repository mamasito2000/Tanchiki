/**
 * Created by admin on 29.02.2016.
 */
public class Bullet {
    private int center;
    private int radius;
    private int power;
    private Tank tank;

    public Bullet(int center, int radius, int power, Tank tank) {
        this.center = center;
        this.radius = radius;
        this.power = power;
        this.tank = tank;
    }

    public Tank getTank() {
        return tank;
    }

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
