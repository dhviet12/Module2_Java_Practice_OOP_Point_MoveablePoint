import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    //constructor
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
    }

    //get and set
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float newxSpeed, float newySpeed) {
        this.xSpeed = newxSpeed;
        this.ySpeed = newySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {xSpeed,ySpeed};
        return speed;
    }
    // method
    public MovablePoint move() {
        super.setXY(super.getX() + this.xSpeed, super.getY() + this.ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return Arrays.toString(getXY()) + ",speed= "+ Arrays.toString(getSpeed());
    }

}
