public class Sequence{

    public static void main(String[] args) {
        if(args[0].equals("lazy")) {
            try {
                int n = Integer.parseInt(args[1]);
                System.out.printf("\nLazy(%d) = %d", n, lazy(n));
            }
            catch(NumberFormatException e) {
                    System.exit(2);
                }
            }
            else if(args[0].equals("triangle")) {
                try {
                    int n = Integer.parseInt(args[1]);
                    System.out.printf("\nTri(%d) = %d", n, triangle(n));
                }
                catch(NumberFormatException e) {
                    System.exit(2);
                }
            }
            else
                System.exit(1);
    }

    public static int lazy(int n) {
        return n*(n-1)/2 + 1;
    }

    public static int triangle(int n) {
        return n*(n+1)/2;
    }
}
