package lab2.task2;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(0,0);
        System.out.println(ball.getX()+ " " +ball.getY());
        ball.setX(5);
        ball.setY(12);
    }
}
