object Q1 extends  App{
  def prime(x:Int,n:Int=2):Boolean = x match {
    case x if(x<2) => false
    case x if(x==2) => true
    case x if(x%n==0) => false
    case x if(n*n>x) => true
    case _ => prime(x,n+1)
  }

  println(prime(25))

}
