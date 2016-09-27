import java.math.*;

public class Sequence{
  public static void main(String[] args) {
    if(args[0].equals("lazy")) {
      try {
        int n = Integer.parseInt(args[1]);
        System.out.printf("\nLazy(%d) = 1", n);
        printLazy(n);
      }
      catch(NumberFormatException e) {
        System.exit(2);
      }
    }
    else if(args[0].equals("triangle")) {
      try {
        int n = Integer.parseInt(args[1]);
        System.out.printf("\nTri(%d) = 1", n);
        printTri(n);
      }
      catch(NumberFormatException e) {
        System.exit(2);
      }
    }
    else {
      System.exit(1);
    }

  }

  public static void printLazy(int n) {
    for(int i = 1; i < n; i++)
      System.out.printf(" + %d", i*(i+1)/2 + 1);
  }

  public static void printTri(int n) {
    for(int i = 2; i <= n; i ++)
      System.out.printf(" + %d", i*(i+1)/2);
  }
}
