using System;

namespace SharpMiniDuckSimulator
{
    class Program
    {
        static void Main(string[] args)
        {

            Duck mallard = new MallardDuck();
            mallard.performQuack();
            mallard.performFly();

            Duck model = new ModelDuck();
            model.performFly();
            model.setFlyBehavior(new FlyRocketPowered());
            model.performFly();

            DuckCaller call = new DuckCaller();
            call.quack();
            call.setQuackBehavior(new MuteQuack());
            call.quack();
        }
    }
}
