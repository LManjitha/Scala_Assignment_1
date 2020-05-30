object Q5 extends App{
  def sumeven(x:Int):Int = x match{
    case x if (x<1) => x
    case x if (x%2==0) => (x-2) + sumeven(x-2)
    case x if (x%2==1) => (x-1) + sumeven(x-1)
  }
  println(sumeven(13))
}
