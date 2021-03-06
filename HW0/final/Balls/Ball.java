package com.technion.oop.homework.zero.balls;
/**
 * A simple object that has a volume.
 */
public class Ball 
{
	
	private double volume;
	
    /**
     * @requires volume > 0
     * @modifies this
     * @effects Creates and initializes new Ball object with the specified
     *  		volume.
     */
    public Ball(double volume)
	{
    	this.volume = volume;
    }
    
    /**
     * @requires ball not null
     * @modifies this
     * @effects Creates and initializes new Ball that is a copy of the old one
     */
    public Ball(Ball ball)
	{
    	this.volume = ball.volume;
    }

	/**
	 * @requires volume > 0
	 * @modifies this
	 * @effects Sets the volume of the Ball.
	 */
	public void setVolume(double volume)
	{
		this.volume = volume;
	}


    /**
     * @return the volume of the Ball.
     */
    public double getVolume()
	{
		return volume;
    }
}
