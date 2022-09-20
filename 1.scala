import scala.math._

object m {
  def main(args: Array[String]): Unit = {
    var x = Point(1, 2)
    var y = Point(3, 4)
    var z = x.add(y)
    z.move(1, 2)
    x.invert()
    println(x)
  }
}

case class Point(var x: Int, var y: Int) {
  def add(that: Point) = Point(this.x + that.x, this.y + that.y)

  def move(dy: Int, dx: Int) = {
    this.x = this.x + x
    this.y = this.y + y
  }

  def distance(that: Point): Double = {
    var xx = this.x - that.y
    var yy = this.y - that.y
    var xy = (xx * xx )+ (yy * yy)
    var dist = sqrt(xy)
    return dist
  }

  def invert() = {
    var temp = this.x
    this.x = this.y
    this.y = temp
}
}
