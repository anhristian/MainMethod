package academy.learnprogramming;

public class Main {

  /**
   *
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    //Printing size of arguments.
    System.out.println("args-size= " + args.length);
  /*
  printing arguments
  another line
   */
    for (int i = 0; i < args.length; i++){
      System.out.println("args[" + i + "]=" + args[i]);
    }
  }


}
