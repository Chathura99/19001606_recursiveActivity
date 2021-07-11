import scala.io.StdIn.readInt
object primeseq_2{
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
    def primeSeq(n:Int){
      if (n > 2) primeSeq(n-1)
      if(prime(n)) println(n)
    }
    println("Enter number : ")
    val n = readInt();
    primeSeq(n-1)
  }
}