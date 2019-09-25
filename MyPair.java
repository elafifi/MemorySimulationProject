/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryproject;

/**
 *
 * @author elafifi
 */
public class MyPair
{
    public int frameNumber;
    public boolean isValid;

    public MyPair(int frameNumber, boolean isValid)
    {
        this.frameNumber = frameNumber;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return  "  " + frameNumber + "  " + isValid;
    }

    
    
}
