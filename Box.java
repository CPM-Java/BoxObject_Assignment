
/**
 * Object demonstration assignment.
 * 
 * @author gk 
 * @version 9/20/16
 */
public class Box
{
    private double myHeight;
    private double myWidth;
    private double myLength;
    private boolean amClosed = false; //The box is open initially
    
    //constructor initialises instance variables
    public Box(double inputHeight, double inputWidth, double inputLength) {
        
        myHeight = inputHeight;
        myWidth = inputWidth;
        myLength = inputLength;
    }
    
    //mutator or 'setter' methods
    public void setHeight(double h){
        myHeight = h;
    }
     public void setWidth(double w){
        myWidth = w;
    }
     public void setLength(double l){
        myLength = l;
    }
    public void setClosed(boolean c){
        amClosed = c;
    }
    
    //accessor or 'getter' methods
    public boolean getIsClosed(){
        return amClosed;
    }
    public double getVolume(){
        return myHeight*myLength*myWidth;
    }
    
    
    //toString Method
    public String toString() {
        String toString = "Height: " + myHeight + "   Width: " + myWidth + "   Length: " + myLength + "   Closed? " + amClosed + ".";
        return toString;
    }
}
