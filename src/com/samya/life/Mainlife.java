/**
 * 
 */
package com.samya.life;

/**
 * @author Samya Ghosh
 *
 */
public class Mainlife {
	
	public static void main(String[] args)
			 throws java.lang.InterruptedException{
				Gameoflife earth = new Gameoflife(55);
				earth.drawWorld();
				while(true){
					Thread.sleep(100);
					earth.nextGeneration();
					earth.drawWorld();
				}
		}

}
