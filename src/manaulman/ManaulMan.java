/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manaulman;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Administrator
 */
public class ManaulMan extends BasicGame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              try {
      ManaulMan game = new ManaulMan("ManualMan");
      AppGameContainer appgc = new AppGameContainer(game);
      appgc.setDisplayMode(640, 480, false);
      appgc.setMinimumLogicUpdateInterval(1000 / 60);
      appgc.start();
      
    } catch (SlickException e) {
      e.printStackTrace();
    }
    }

    public ManaulMan(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
       
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
       
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
       
    }
    
    /**
     *
     * @param args
     */
  
    
}
