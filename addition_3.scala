import scala.io.StdIn.readInt
object addition_3{
  def main(arg: Array[String]){
      def add(x:Int):Int={
        x match{
          case x if x==1 => 1
          case x if x>0 => x+add(x-1)
        }
      }
      println("Enter number : ")
      val n = readInt();
      println("Sum is "+add(n))
  }
}