using System;


namespace SharpMiniDuckSimulator
{
   public class Quack: IQuackBehavior {
       public void quack() {
           Console.WriteLine("Quack");
       }
   }
}
