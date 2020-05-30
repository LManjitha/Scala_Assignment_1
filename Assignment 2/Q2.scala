object Q2 extends App{
  def attendees(x:Int)=120+(15-x)/5*20
  def revenue(p:Int)=p*attendees(p)
  def cost(p:Int)=500+3*attendees(p)
  def profit(p:Int)=revenue(p) - cost(p)

  println(profit(15),profit(20))

}
