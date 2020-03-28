import java.util.Random;

public class test{
    public static void main(String[] args) {
        for (int i = 0; i<50; i++) {
            Random r = new Random();
            int speed = r.nextInt(6);
            System.out.print(speed);
            System.out.print(' ');
            boolean up = r.nextBoolean();
            int speedY;
            if (up) {
                speedY = speed;
            } else {
                speedY = -speed;
            }
            System.out.println(speedY);
        }
    }
}