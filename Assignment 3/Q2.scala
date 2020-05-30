object Q2 extends  App{
  def prime(x:Int,n:Int=2):Int = x match {
    case x if(x-1==2) => x-1
    case x if((x-1)%n==0) => prime(x-1)
    case x if(n*n>x-1) => {
      println(x-1)
      prime(x-1)
    }
    case _ => prime(x,n+1)
  }

  println(prime(10))

}
