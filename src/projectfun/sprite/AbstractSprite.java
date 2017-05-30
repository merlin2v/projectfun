/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfun.sprite;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.scene.Node;

/**
 *X
 * @author tuvenat18
 */
class AbstractSprite extends javafx.scene.Group{
    
    public abstract Scene getSpriteScene();
    public abstract SpriteController getSpriteController();
    protected AbstractSprite getThis(){
        return this;
    }
    
}
