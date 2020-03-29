package com.dusek.pong;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle {
    int x;
    int y;
    int width;
    int height;
    Color color;
    boolean auto;
    int prev;

    public Paddle(int x, int y, int width, int height, Color color, boolean auto){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.auto = auto;
    }

    public void update(){
        this.prev = this.y;
        if (auto){
            this.y = pong.ball.y-this.height/2;
            if (this.y-this.prev>3){
                this.y = this.prev+3;
            } else if (this.y-this.prev<-3){
                this.y = this.prev-3;
            }
        } else {
            this.y = Gdx.graphics.getHeight()-(Gdx.input.getY()+this.height/2);
            if (this.y-this.prev>5){
                this.y = this.prev+5;
            } else if (this.y-this.prev<-5){
                this.y = this.prev-5;
            }
        }
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
