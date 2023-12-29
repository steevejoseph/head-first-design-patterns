public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();

    DuckCaller caller = new DuckCaller();
    caller.quack();
    caller.setQuackBehavior(new MuteQuack());
    caller.quack();
  }
}
