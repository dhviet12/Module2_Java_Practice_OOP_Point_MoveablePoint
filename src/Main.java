public class Main {
    public static void main(String[] args) {
        Point myPoint= new Point();
        System.out.println( myPoint.toString());
        myPoint.setXY(3,5);
        System.out.println(myPoint.toString());
        ///
        MovablePoint myMove = new MovablePoint();
        myMove.setXY(3,3);
        myMove.setSpeed(10,20);
        System.out.println(myMove.toString());
        myMove.move();
        System.out.println(myMove.toString());

    }
}
