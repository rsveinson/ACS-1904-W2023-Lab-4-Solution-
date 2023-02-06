import java.util.Scanner;
/** 
 * ACS-1904 Lab 4
 * @Sveinson 
*/

public class RollerCoasterInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rollerCoaster;
        
        RollerCoaster rc;    // a RollerCoaster object
        RollerCoaster[] rollerCoasters = RollerCoaster.values();
        
        // why using name for a field is not a great idea
        //System.out.println(rollerCoasters[0].name());
        
        // print inverted roller coasters
        System.out.println("Terrifying  Inverted Roller Coasters:");
        
        for(RollerCoaster re : rollerCoasters)
            if(re.isInverted())
                System.out.println(re);
        
        // print non-inverted coasters
        System.out.println("\nTame, Non-inverted Roller Coasters:");
        
        for(RollerCoaster re : rollerCoasters)
            if(!re.isInverted())
                System.out.println(re);
                
        // get roller coaster info        
        System.out.println("\nEnter a roller coaster name:");
        rollerCoaster = scanner.next().toUpperCase();
        rc = RollerCoaster.valueOf(rollerCoaster);
        
        // print the info for the requested roller coaster
        System.out.print(rc + " of " + rc.getPark() + " is " + rc.getHeight() + "m high.\n\n");
        
        // program has terminated normally
        System.out.println("end of program");
    }
}
