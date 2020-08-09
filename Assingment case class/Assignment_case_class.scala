object Assignment_case_class extends App{
  val p1 = Point(2,3)
  val p2 = Point(4,5)
  val p3 = Point(1,2)

  println(p1+p2)
  println(p3.move(2,3))
  println(p1.distance(p2))
  println(p1.invert())
}

case class Point(x:Int,y:Int){
  def +(p:Point)=Point(p.x+this.x , p.y+this.y)
  def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)
  def distance(p:Point) = math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y))
  def invert()=Point(this.y,this.x)
}