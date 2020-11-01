package academy.learnprogramming.section4;

public class Main {

  public static void main(String[] args) {
   int newScore =  calculateScore("Ana", 500);
    System.out.println("New score is " + newScore);
    calculateScore(400);

  }
  public static int calculateScore(String playName, int score) {
    System.out.println("Player " + playName + " score " + score);
    return score * 1000;
  }

  public static int calculateScore(int score) {
    System.out.println("Unnamed player scored " + score);
    return score * 1000;
  }

}
