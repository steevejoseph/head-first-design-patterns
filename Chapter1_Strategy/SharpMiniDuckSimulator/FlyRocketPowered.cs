using System;

namespace SharpMiniDuckSimulator
{
    public class FlyRocketPowered : IFlyBehavior
    {
        public void fly()
        {
            Console.WriteLine("I'm flying!!");
        }

    }
}