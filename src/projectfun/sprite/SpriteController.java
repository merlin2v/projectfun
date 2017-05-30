/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfun.sprite;

import javafx.scene.Scene;

/** Controls a AbstractSprite and its movement
X
 * @author Nathan
 */
public abstract class SpriteController {
    public abstract Scene getScene();
    public abstract AbstractSprite getSprite();
    public void move(double x,double y,double z){
        this.getSprite().setTranslateX(x);
        this.getSprite().setTranslateY(y);
        this.getSprite().setTranslateZ(z);
    }
    private Timer Glider=new Timer("Sprite Glider");
    public void glide(double x,double y,double z,double buffer,long time){
        int count=0;
        Glider.scheduleAtFixedRate(mover(x, y, z, buffer, time, count), 0, time);
        Glider.schedule(new TimerTask() {

            @Override
            public void run() {
                Glider.cancel();
            }
        }, time);
    }
    TimerTask mover(double x,double y,double z,double buffer,double time,int count){
        return new TimerTask() {

            @Override
            public void run() {
                double d =time/buffer;
                move(x/d, y/d, z/d);
            }
        };
    }
}
