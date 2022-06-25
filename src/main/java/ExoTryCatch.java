import java.util.ArrayList;
import java.util.Scanner;

public class ExoTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> listeNombre = new ArrayList<>();


        while (true) {
            System.out.println("enter nb :");
            var userNb = input.nextLine();

            if (userNb.equals("q")) {
                System.out.println("exit program");
                break;
            }
            else {
                try {
                    listeNombre.add(Integer.valueOf(userNb));
                }
                catch (Exception e){
                    System.out.println( "Error " + e);
                }
            }

        }

        System.out.println("nb de nb" + listeNombre.size());
        System.out.println("les nombre" + listeNombre);
    }

}
