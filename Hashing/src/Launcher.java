import java.util.Scanner;

/**
 * @author Victor Lavalle
 */
public class Launcher {
    
    public static void menu(){
        System.out.println("\n"
                + "-----Hashing-----"
                + "\n >>Select an option:"
                + "\n 1. Index Sum Method "
                + "\n 2. Index Pow Method "
                + "\n 0. Exit");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
      
        int option;
        try{
        do{
        menu();
        System.out.print("»");
         option = scan.nextInt();
         
        switch(option){
            case 0:
                System.exit(0);
             break;
             
              case 1:
                IndexHash index1 = new IndexHash();
                System.out.println("\nEnter a String:");
                String input= word.nextLine();
                System.out.print("\nThe hash value of the string '"+input+"' is: "
                        + index1.Hashing(input)+"\n");
                index1.Hashing("  ");
                System.out.println("");
             break;
             
              case 2:
                 IndexHash2 index2 = new IndexHash2();
                System.out.println("\nEnter a String:");
                String input2= word.nextLine();
                System.out.print("\nThe hash value of the string '"+input2+"' is: "
                        +index2.Hashing(input2)+"\n");
             break;  
             
              default:
                  System.out.println("Invalid Option!");
        }
        }while(option<=2) ;
        }
            catch(Exception e){
                System.out.println("-Error at reading option!");
            }
    }
}
