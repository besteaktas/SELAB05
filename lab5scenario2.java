import java.util.Scanner;
public class lab5scenario2 {
    public static long power(long base,int exp) {
        if (exp == 0) return 1;
            return base * power(base,exp - 1);
        }

        public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a base number: ");
            long baseSim = scan.nextLong();
            System.out.print("Enter an exp number: ");
            int expSim = scan.nextInt();
            System.out.println( power(baseSim , expSim) );
        }
        }