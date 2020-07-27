object Q1 extends App{
  val r1=new Rational1(2,5)
  val r2=new Rational1(6,7)

  println(r1.neg)
  println(r2)
}

class Rational1(n:Int,d:Int){

  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)
  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)

  def neg=new Rational1(-this.numer,this.denom)

  override def toString= numer+"/"+denom
}