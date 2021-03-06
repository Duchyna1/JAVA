package com.dusek.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.dusek.game.main;
import com.dusek.game.sprites.Bird;
import com.dusek.game.sprites.Tube;

public class PlayState extends State {
    private static final int TUBE_SPACING = 125;
    private static final int TUBE_COUNT = 4;

    private Bird bird;
    private Texture bg;
    private Texture ground;
    private Vector2 groundPos1, groundPos2;

    private Array<Tube> tubes;

    protected PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(50, 200);
        cam.setToOrtho(false, main.WIDTH/2, main.HEIGHT/2);
        bg = new Texture("bg.png");
        ground = new Texture("ground.png");
        groundPos1 = new Vector2(cam.position.x-cam.viewportWidth/2, 0);
        groundPos2 = new Vector2((cam.position.x-cam.viewportWidth/2)+ground.getWidth(), 0);

        tubes = new Array<Tube>();
        for (int i = 1; i <= TUBE_COUNT; i++){
            tubes.add(new Tube(i*(TUBE_SPACING + Tube.TUBE_WIDTH)));
        }
    }

    @Override
    protected void handleInputs() {
        if (Gdx.input.justTouched()){
            bird.jump();
        }
    }

    @Override
    public void update(float dt) {
        handleInputs();
        updateGround();
        bird.update(dt);
        cam.position.x = bird.getPosition().x+80;

        for (Tube tube: tubes){
            if (cam.position.x-cam.viewportWidth/2 > tube.getPosTopTube().x+tube.getTopTube().getWidth()){
                tube.reposition(tube.getPosTopTube().x+(Tube.TUBE_WIDTH+TUBE_SPACING)*TUBE_COUNT);
            }
            if (tube.collides(bird.getBounds())){
                gsm.set(new PlayState(gsm));
            }
        }
        if (bird.getPosition().y <= ground.getHeight()){
            gsm.set(new PlayState(gsm));
        }
        cam.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x-(cam.viewportWidth/2), 0, 200, 350);
        sb.draw(bird.getBird(), bird.getPosition().x, bird.getPosition().y, 30, 30);
        for (Tube tube: tubes){
            sb.draw(tube.getTopTube(), tube.getPosTopTube().x, tube.getPosTopTube().y);
            sb.draw(tube.getBottomTube(), tube.getPosBotTube().x, tube.getPosBotTube().y);
        }
        sb.draw(ground, groundPos1.x, groundPos1.y);
        sb.draw(ground, groundPos2.x, groundPos2.y);
        sb.end();
    }

    @Override
    public void dispose() {
        bg.dispose();
        bird.dispose();
        ground.dispose();
        for (Tube tube: tubes){
            tube.dispose();
        }
    }

    private void updateGround(){
        if (cam.position.x-(cam.viewportWidth/2) > groundPos1.x+ground.getWidth()){
            groundPos1.add(ground.getWidth()*2, 0);
        }
        if (cam.position.x-(cam.viewportWidth/2) > groundPos2.x+ground.getWidth()){
            groundPos2.add(ground.getWidth()*2, 0);
        }
    }

}
