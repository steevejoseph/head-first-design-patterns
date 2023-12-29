using System;

namespace SharpMiniDuckSimulator
{
    public class DuckCaller : IQuackBehavior
    {

        IQuackBehavior QuackBehavior;

        public DuckCaller()
        {
            QuackBehavior = new Quack();
        }

        public void setQuackBehavior(IQuackBehavior qb)
        {
            QuackBehavior = qb;
        }
        public void quack()
        {
            Console.WriteLine("(I am a duck caller)");
            QuackBehavior.quack();
        }
    }
}