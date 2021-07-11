import scala.io.StdIn.readInt
object evenorodd_4{
  def main(arg: Array[String]){
      def isEven(n:Int):Boolean= {
        n match{
          case 0 => true
          case _ => isOdd(n-1)
        }
      }
      def isOdd(n:Int):Boolean = !(isEven(n))
      
      println("Enter number : ")
      val n = readInt();
      if (isEven(n)) println(n+" is even")
      else println(n+" is odd")
  }
}