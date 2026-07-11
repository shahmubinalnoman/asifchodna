package Random;

import java.util.Random;
import java.util.Scanner;

public class random {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Do you see the random number? (yes/no)");

        Random random = new Random();

        int x = random.nextInt(6);
        System.out.println(x);

        sc.close();
    }
}
