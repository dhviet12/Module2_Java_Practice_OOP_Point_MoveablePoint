import java.util.Arrays;

public class Point {
    // property
    private float x=0.0f;
    private float y=0.0f;
    // constructor
    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // get and set
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    // method
    public void setXY(float x, float y){
        this.x =x;
        this.y=y;
    }
    public float[] getXY(){
        float[] posArr={this.x,this.y};
        return posArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}
