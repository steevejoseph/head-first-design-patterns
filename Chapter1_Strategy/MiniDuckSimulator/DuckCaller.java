public class DuckCaller implements QuackBehavior {

  QuackBehavior quackBehavior;

  public DuckCaller() {
    quackBehavior = new Quack();
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

  public void quack() {
    quackBehavior.quack();
  }
}
