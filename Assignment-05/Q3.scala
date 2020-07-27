object Q3 extends App{
  var a1=new account("1",111,1000)
  var a2=new account("2",222,1500)
  var a3=new account("3",333,2000)
  a1.transfer(a2,500)
  println(a1)
  println(a2)
}

class account(id:String,an:Int,b:Double){
  def nic:String = id
  def ac_num:Int = an
  var balance:Double = b

  def withdraw(ba:Double):Unit=this.balance = this.balance - ba
  def deposit(ba:Double):Unit= this.balance = this.balance + ba
  def transfer(ac:account,bal:Double): Unit ={
    this.withdraw(bal)
    ac.deposit(bal)
  }


  override def toString= nic+" : "+ac_num+" : "+balance
}






