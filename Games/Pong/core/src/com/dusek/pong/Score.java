package com.dusek.pong;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Score {
    int x;
    int y;
    int score = 0;

    public Score(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void addScore(){
        this.score++;
    }

    public void draw(SpriteBatch batch, BitmapFont font){
        font.draw(batch, Integer.toString(this.score), this.x, this.y);
    }

}
