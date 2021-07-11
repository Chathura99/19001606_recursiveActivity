import scala.io.StdIn.readInt
object prime_1{
  def main(arg: Array[String]){
    def GCD(a:Int,b:Int):Int=b match{
      case 0 => a
      case b if b>a => GCD(b,a)
      case _ => GCD(b,a%b)
     }
    def prime(x:Int,n:Int=2):Boolean= n match {
      case n if(n==x) => true
      case n if GCD(x,n)>1 => false
      case n => prime(x,n+1)
    }
      println("Enter number : ")
      val n = readInt();
      if(prime(n)) println(n+" is a prime number")
      else println(n+" is not a prime number")
  }
}