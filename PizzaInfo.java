import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class PizzaInfo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = Pizza.values();
        
        for(Pizza p : pizzas){
            System.out.println(p);
        }
        
        // System.out.println("What pizza do you want to change?");
        // Pizza pizza = Pizza.valueOf(scanner.next().toUpperCase());
        // pizza.setPrice(200);
        // System.out.println(pizza);

        System.out.println("end of program");
    }
}
