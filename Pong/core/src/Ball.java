import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class Ball {
    int x;
    int y;
    int r;
    int speedX;
    int speedY;
    Color color;

    public Ball(int x, int y, int r, Color color, int speedX, int speedY){
        this.x = x;
        this.y = y;
        this.r = r;
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }

    public void update(){
        this.x += this.speedX;
        this.y += this.speedY;
        if (this.x < this.r || this.x > Gdx.graphics.getWidth()-this.r){
            this.speedX *= -1;
            this.speedY = randomSpeed(5);
        }
        if (this.y < this.r || this.y > Gdx.graphics.getHeight()-this.r){
            this.speedY *= -1;
        }
    }

    public void draw(ShapeRenderer shape){
        shape.setColor(this.color);
        shape.circle(this.x, this.y, this.r);
    }

    public int randomSpeed(int range){
        Random r = new Random();
        int speed = r.nextInt(range+1);
        boolean up = r.nextBoolean();
        if (!up) {
            speed = -speed;
        }
        return speed;
    }

}
