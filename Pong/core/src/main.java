import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class main implements ApplicationListener {
	ShapeRenderer shape;
	static Ball ball;
	Paddle paddle1;
	Paddle paddle2;

	@Override
	public void create() {
		shape = new ShapeRenderer();
		ball = new Ball(250, 250, 12, Color.WHITE, 8, randomSpeed(8));
		paddle1 = new Paddle(10, 0, 10, 70, Color.BLUE);
		paddle2 = new Paddle(Gdx.graphics.getWidth()-20, 0, 10, 70, Color.RED);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		update();

		shape.begin(ShapeRenderer.ShapeType.Filled);
		draw(shape);
		shape.end();
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	public void update(){
		ball.update();
		paddle1.update();
		paddle2.update();
	}

	public void draw(ShapeRenderer shape){
		ball.draw(shape);
		paddle1.draw(shape);
		paddle2.draw(shape);
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