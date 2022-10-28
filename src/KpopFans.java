public class KpopFans extends Fans {
  public KpopFans() {
    super();
  }

  public KpopFans(String name) {
    super(name);
  }

  public void watchingPerformances(Musician musician, String expression) {
    super.showName();
    System.out.print(expression + " melihat idolanya ");
    musician.perform();
  }
}
