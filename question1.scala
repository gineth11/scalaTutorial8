case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def +(that:Point)=Point(this.x+that.x,this.y+that.y)

  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

  def distance(a:Point):Double={
    var horiz = this.x-a.x
    var vert = this.y-a.y
    var distance= horiz*horiz+vert*vert*vert
    scala.math.sqrt(distance)
    
  }

   def invert() :Unit = {
    var temp = this.x
    this.x = this.y
    this.y = temp
  }

}

object MyApp extends App{

  val p1=new Point(2,4)
  val p2=new Point(5,6)
  println(p1+p2)
  val p3=p1.move(2,2)
  println(p3)

  println(p1.distance(p2))
  var z= Point (1,2)
  p1.invert()
  println(p1)

}



  
  

  
