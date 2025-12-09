import java.util.Arrays;
import java.util.Scanner;
public class GroceryManagerApp{
public static void main(String...args){

        
Scanner input = new Scanner(System.in);

while (true) {
System.out.println("1. Add Product");
System.out.println("2. Remove Item");
System.out.println("3. Show All Items");
System.out.println("0. Exit");
System.out.println("Enter your menu: ");
    

int item = input.nextInt();
String menu = input.nextLine();
     
switch (item) {
    case 1:

        System.out.print("Enter item to add: ");
        String addProduct = input.nextLine();

        productItem.add(addProduct);
        System.out.println(addProduct + " added"); 
    break;

    case 2:
        System.out.print("Enter item to remove: ");
        String removeProduct = input.nextLine();
        if (productItem.remove(removeProduct)) {
        System.out.println(removeProduct + " removed.");
        } else {
        System.out.println("Item not found.");
          }
          break;







    case 0:
        System.out.println("Exiting program...");
            break;









            }
        }
    }
}




















































    
