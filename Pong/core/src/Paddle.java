import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle {
    int x;
    int y;
    int width;
    int height;
    Color color;

    public Paddle(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void update(){
        this.y = main.ball.y-this.height/2;
        if (this.y > Gdx.graphics.getHeight()-height){
            this.y = Gdx.graphics.getHeight()-height;
        }else if (this.y < 0){
            this.y = 0;
        }
    }

    public void draw(ShapeRenderer shape){
        shape.setColor(this.color);
        shape.rect(this.x, this.y, this.width, this.height);
    }
}
