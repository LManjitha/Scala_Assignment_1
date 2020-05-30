object Q3 extends App {
  def sum(x:Int):Int =x match {
    case 1 => x
    case _ => x + sum(x-1)
  }
  println(sum(4))

}
