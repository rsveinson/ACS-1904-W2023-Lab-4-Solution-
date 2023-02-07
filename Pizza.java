
/**
 * Enumeration class Pizza 
 *
 * @author Sveinson
 */


public enum Pizza
{
    CHEESE("Cheese", 12.95), CALABRIA("Calabria", 15.99), ROMA("Roma", 16.99), 
    TUSCAN("Tuscan", 18.00), MILANESE("Milanese",21.50);
    
    private String friendlyName;
    private double price;

    
    /* since the constructor has to be private
     * you can omit the private access modifier 
     * in the constructor signature
     */
     private Pizza(String fn, double p){
        friendlyName = fn;
        price = p;
    }// end constructor
    
    // why is this not a good idea/
    // public void setPrice(double p){
        // price = p;
    // }
    
    @Override
    public String toString(){
      String st = friendlyName + ": $" + price;
        
      return st;
    }
}
