object Q2 extends  App{
  def prime(x:Int,n:Int=2):Int = x match {
    case x if(x==2) => x
    case x if(x%n==0) => prime(x-1)
    case x if(n*n>x) => {
      println(x)
      prime(x-1)
    }
    case _ => prime(x,n+1)
  }

  println(prime(10))

}
