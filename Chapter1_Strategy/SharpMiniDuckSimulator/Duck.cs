namespace SharpMiniDuckSimulator
{
    public abstract class Duck
    {
        public IQuackBehavior QuackBehavior { get; set; }
        public IFlyBehavior FlyBehavior { get; set; }

        public Duck()
        {

        }

        public abstract void display();

        public void performFly()
        {
            FlyBehavior.fly();
        }

        public void performQuack()
        {
            QuackBehavior.quack();
        }

        public void setQuackBehavior(IQuackBehavior qb)
        {
            QuackBehavior = qb;
        }

        public void setFlyBehavior(IFlyBehavior fb)
        {
            FlyBehavior = fb;
        }
    }

}