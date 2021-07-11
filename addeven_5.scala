import scala.io.StdIn.readInt
object addeven_5{
  def main(arg: Array[String]){
      def isEven(n:Int):Boolean= {
        n match{
          case 0 => true
          case _ => isOdd(n-1)
        }
      }
      
      def isOdd(n:Int):Boolean = !(isEven(n))
      
      def addeven(x:Int):Int={
        x match{
          case x if x==0 => 0
          case x if x>0 => x+addeven(x-2)
        }
      }
      println("Enter number : ")
      val n = readInt();
      if (isEven(n)) println("Sum of the even numbers is "+addeven(n-2))
      else println("Sum of the even numbers is "+addeven(n-1))
  }
}