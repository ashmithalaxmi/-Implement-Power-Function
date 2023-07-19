import java.util.Scanner;

public class ImplementPowerFunction {
    static int powerFunction(int a, int b, int c){
        if(b==0)
            return 1;
        else if(b==1)
            return a%c;
        int p = powerFunction(a,b/2,c);
        if(b%2==0)
            return (p*p)%c;
        else
            return (p*p*a)%c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(powerFunction(a,b,c));
    }
}
