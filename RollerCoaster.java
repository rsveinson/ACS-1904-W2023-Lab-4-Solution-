
/**
 * Enumeration class RollerCoasters
 *
 * @author Sveinson
 */
public enum RollerCoaster
{
    KINGA("Kinga", "Six Flags", 456, true),   DRAGSTER("Dragster","Cedar Point", 420, true),
            SUPERMAN("Superman", "Ferrari Land", 415, false), REDFORCE("RedForce", "Disney Land", 467, false),
            FURY("Fury", "Carowinds", 355, true), DRAGON("Dragon", "Six Flags", 385, false),
            LEVIATHAN("Leviathan", "Wonderland", 401, true), ORION("Orion", "Wonderland", 468, true);
            
    private String friendlyName;    // this is for the extra challenge don't use name here why?
    private String park;
    private int height;
    private boolean inverted;
    private String name;
    
    private RollerCoaster(String fn, String p, int h, boolean i){
        friendlyName = fn;
        park = p;
        height = h;
        inverted = i;
        name = "booyah";
    }
    
    public String getFriendlyName(){
        return friendlyName;
    }
    
    public String getPark(){
        return park;
    }
    
    public int getHeight(){
        return height;
    }
    
    // note the absence of setters. why do you think this is?
    
    public boolean isInverted(){
        return inverted;
    }
    
 // extra challenge toSting() method
/*    
    @Override
    public String toString(){
        return friendlyName;
    }
 */
}
