object Q3 extends App {
  def cost(x:Double)=if(x>50){
    (24.95-(24.95*40/100))*x+3+(x-50)*0.75
  }
  else{
    (24.95-(24.95*40/100))*x+3
  }
  println(cost(60))
}

