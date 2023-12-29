using System;

namespace SharpMiniDuckSimulator
{
    public class FlyWithWings : IFlyBehavior
    {
        public void fly()
        {
            Console.WriteLine("I'm flying!!");
        }

    }
}