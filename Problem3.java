public class Problem3{
    public static void main(String[] args){
        double decimal = 69.0182031;
        System.out.println("decimal number: " + decimal);
        decimal = decimal * 10;
        int x = (int) decimal % 10;
        System.out.print("answer: " + x);
        decimal = decimal * 10;
         x = (int) decimal % 10;
        System.out.print(" " + x);
        decimal = decimal * 10;
         x = (int) decimal % 10;
        System.out.print(" "+ x);
    }
}
