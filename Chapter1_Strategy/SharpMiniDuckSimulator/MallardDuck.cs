using System;
namespace SharpMiniDuckSimulator
{
    public class MallardDuck : Duck
    {
        public MallardDuck() : base()
        {
            QuackBehavior = new Quack();
            FlyBehavior = new FlyWithWings();
        }

        public override void display()
        {
            Console.WriteLine("I'm a real Mallard duck");
        }
    }
}