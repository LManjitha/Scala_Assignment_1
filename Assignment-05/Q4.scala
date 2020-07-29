object Q4 extends App{

  var a1=new accounts("983101664V",111,1000)
  var a2=new accounts("983151898V",222,1500)
  var a3=new accounts("983184565V",333,2000)
  var a4=new accounts("98144546V",444,500)
  var bank = List(a1,a2,a3,a4)

  a4.transfer(a3,800)
  a1.transfer(a2,500)

  //overdraft accounts
  var overdraft=(b:List[accounts])=>b.filter(x=>x.balance<0)
  println(overdraft(bank))

  //account sums
  var sum=(b:List[accounts])=>b.reduce((x,y)=>new accounts(x.nic,x.ac_num,x.balance+y.balance) )
  println(sum(bank).balance)

  //interest
  var inter=(l:List[accounts])=>l.filter(x=>x.balance>0).map(x=>x.balance*1005/1000)
  var over_in=(l:List[accounts])=>l.filter(x=>x.balance<0).map(x=>x.balance*1010/1000)
  println(inter(bank))
  println(over_in(bank))

}

class accounts(id:String,an:Int,b:Double){
  def nic:String = id
  def ac_num:Int = an
  var balance:Double = b

  def withdraw(ba:Double):Unit=this.balance = this.balance - ba
  def deposit(ba:Double):Unit= this.balance = this.balance + ba
  def transfer(ac:accounts,bal:Double): Unit ={
    this.withdraw(bal)
    ac.deposit(bal)
  }

  override def toString= nic+" : "+ac_num+" : "+balance
}






