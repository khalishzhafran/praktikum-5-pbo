public class Fans {
  private String name;

  public Fans() {
    this.name = "noname";
  }

  public Fans(String name) {
    this.name = name;
  }

  public void showName() {
    System.out.print(this.name + ": ");
  }

  public void watchingPerformances() {
    showName();
    System.out.println("melihat idolanya dari youtube");
  }

  public void watchingPerformances(Musician musician) {
    showName();
    System.out.print("melihat idolanya ");
    musician.perform();
  }
}
