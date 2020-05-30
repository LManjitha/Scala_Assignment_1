object Q6 extends App {
  def fibonacci(x:Int):Int = x match {
    case 0 => 0
    case x if (x==1) =>  1
    case x => fibonacci(x-1) + fibonacci(x-2)

  }

  def fibonacciSeq(x:Int): Unit ={
    if(x>=0){
      fibonacciSeq(x-1)
      println(fibonacci(x))
    }
  }
  fibonacciSeq(5)
}
