object Q2 extends App{
  val x=new rational(3,4)
  val y=new rational(5,8)
  val z=new rational(2,7)
  val ans=x-y-z
  println(ans)

}

class rational(n:Int,d:Int){

  require(d>0,"d must be greater than zero")
  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)

  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
  def +(r:rational)=new rational(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom)
  def neg=new rational(-this.numer,this.denom)
  def -(r:rational)=this+r.neg

  override def toString= numer+"/"+denom
}