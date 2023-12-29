using System;
namespace SharpMiniDuckSimulator
{
    public class ModelDuck : Duck
    {
        public ModelDuck() : base()
        {
            QuackBehavior = new Quack();
            FlyBehavior = new FlyNoWay();
        }

        public override void display()
        {
            Console.WriteLine("I'm a model duck");
        }
    }
}