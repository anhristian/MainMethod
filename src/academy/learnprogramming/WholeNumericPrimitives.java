package academy.learnprogramming;

public class WholeNumericPrimitives {

  public static void main(String[] args) {
    long max = 3_212_356_789L;
    long n = 2_300;

    //octal (0,7)
    int oct = 07;
    int firstOct = 010; //8 decimal
    int secondOct = 022; //18 decimal

    int sumOct = firstOct + secondOct; // 26 decimal, 32 octal
    System.out.println("first = " + firstOct + " secondOct " + secondOct);
    System.out.println("decimal sumOct " + sumOct + " octSum " + Integer.toOctalString(sumOct));

    //hexadecimal (0, 9 and A - F)
    int firstHex = 0xF; //15 decimal
    int secondHex = 0x1E; // 30 decimal
    int sumHex = firstHex + secondHex; //45 decimal, 24 hex
    System.out.println("first = " + firstHex + " second = "+ secondHex);
    System.out.println("decimalSum = " + sumHex + " hexSum " + Integer.toHexString(sumHex));
  }
}
