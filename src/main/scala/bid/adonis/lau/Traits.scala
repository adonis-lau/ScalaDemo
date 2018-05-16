package bid.adonis.lau

trait Equal {
  //未实现的方法
  def isEqual(x: Any): Boolean

  //已经实现的方法
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class TraitsPoint(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any): Boolean =
    obj.isInstanceOf[TraitsPoint] && obj.asInstanceOf[TraitsPoint].x == x
}

object Traits {
  def main(args: Array[String]) {
    val p1 = new TraitsPoint(2, 3)
    val p2 = new TraitsPoint(2, 4)
    val p3 = new TraitsPoint(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}

