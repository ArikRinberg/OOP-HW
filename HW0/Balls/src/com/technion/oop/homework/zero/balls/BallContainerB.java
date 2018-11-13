package com.technion.oop.homework.zero.balls;
import java.util.ArrayList;

/**
 * A container that can be used to contain Balls. A given Ball may only
 * appear in a BallContainer once.
 */
public class BallContainerB 
{
	
	private ArrayList<Ball> balls;
	private double sumVolumes;
    /**
     * @effects Creates a new BallContainer.
     */
    public BallContainerB()
	{
    	balls = new ArrayList<Ball>();
    	sumVolumes = 0;
    }


    /**
     * @modifies this
     * @effects Adds ball to the container.
     * @return true if ball was successfully added to the container,
     * 		   i.e. ball is not already in the container; false otherwise.
     */
    public boolean add(Ball ball) 
	{
    	if (ball == null)
    	{
    		return false;
    	}
    	if (contains(ball))
    	{
    		return false;
    	}
    	balls.add(new Ball(ball));
    	sumVolumes += ball.getVolume();
    	return true;
    }


    /**
     * @modifies this
     * @effects Removes ball from the container.
     * @return true if ball was successfully removed from the container,
     * 		   i.e. ball is actually in the container; false otherwise.
     */
    public boolean remove(Ball ball) 
	{
		if (ball == null)
    	{
    		return false;
    	}
    	
    	for (int i=0; i<balls.size(); i++)
    	{
    		Ball b = balls.get(i);
    		if (b.getVolume() == ball.getVolume())
    		{
    			balls.remove(i);
    			sumVolumes -= ball.getVolume();
    			return true;
    		}
    	}
    	return false;
    }


    /**
     * @return the volume of the contents of the container, i.e. the
     * 		   total volume of all Balls in the container.
     */
    public double getVolume()
	{
    	return sumVolumes;
    }


    /**
     * @return the number of Balls in the container.
     */
    public int size()
	{
		return balls.size();
    }


    /**
     * @modifies this
     * @effects Empties the container, i.e. removes all its contents.
     */
    public void clear()
	{
    	sumVolumes = 0;
    	balls.clear();
    }


    /**
     * @return true if this container contains ball; false, otherwise.
     */
    public boolean contains(Ball ball) 
	{
    	for (Ball b : balls)
    	{
    		if (b.getVolume() == ball.getVolume())
    		{
    			return true;
    		}
    	}
    	return false;
    }
}
