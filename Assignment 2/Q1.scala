object Q1 extends App{
    def normal(x:Int)=x*150
    def ot(y:Int)=y*75
    def income(a:Int,b:Int)=normal(a) + ot(b)
    def tax(x:Int)=x*0.1
    def takeHomeSalary(a:Int,b:Int)=income(a,b)-tax(income(a,b))

    println(takeHomeSalary(40,20))
}
