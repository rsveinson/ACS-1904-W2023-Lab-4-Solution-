import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class EngineTypeInfo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EngineType[] engines = EngineType.values();

        for(EngineType e : engines){
            System.out.println(e);
        }

        System.out.println();

        System.out.println("end of program");
    }
}
