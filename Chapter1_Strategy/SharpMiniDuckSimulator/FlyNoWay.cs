using System;

namespace SharpMiniDuckSimulator
{
    public class FlyNoWay : IFlyBehavior
    {
        public void fly()
        {
            Console.WriteLine("I can't fly");
        }

    }
}