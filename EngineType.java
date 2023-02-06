
/**
 * Enumeration class Engine - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum EngineType
{
    V8("V-8", 5.0, 375, 14), V6("V-6", 3.5, 275, 11),
    V12("V-12", 6.2, 500, 15), V10("V-10", 6.0, 625, 16);
    
    private String type;
    private double size;
    private int hp;
    private int lPer100km;
    
    private EngineType(String t, double s, int h, int econ){
        type = t;
        size = s;
        hp = h;
        lPer100km = econ;
    }// end constructor
    
    // getters
    
    //other
    public String toString(){
        StringBuilder et = new StringBuilder();
        et.append("Engine Type: " + type + "\n");
        et.append("Engine Size: " + size + " Liters" + "\n");
        et.append("Engine Power: " + hp + " Horse Powers" + "\n");
        et.append("Fuel economy: " + lPer100km + " L/100km" + "\n");
        
        return et.toString();
    }// end to string
}// end EngineType
