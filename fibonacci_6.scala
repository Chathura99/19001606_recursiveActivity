import scala.io.StdIn.readInt
object fibonacci_6{
  def main(arg: Array[String]){
    def fib(n:Int):Int={ 
      n match{
        case 0 => 0
        case x if x==1 => 1
        case _ => fib(n-1)+fib(n-2)
      }
    }
    def fibSeq(n:Int){
      if (n > 0) fibSeq(n-1)
       println(fib(n))
      }
    println("Enter number : ")
    val n = readInt();
    fibSeq(n-1)
  }
}