package bid.adonis.lau

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
  }
}

//继承
class Location(override val xc: Int, override val yc: Int,
               val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
    println("z 的坐标点 : " + z);
  }
}


object Classes {
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15)
    // 移到一个新的位置
    loc.move(10, 10, 5)
  }
}


class Person {
  var name = ""

  //Scala重写一个非抽象方法，必须用override修饰符。
  override def toString: String = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {
  var salary = 0.0

  //Scala重写一个非抽象方法，必须用override修饰符。
  override def toString: String = super.toString + "[salary=" + salary + "]"
}

object Classes2 extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}

//单例对象实例
object Classes3 {
  def main(args: Array[String]): Unit = {
    val point = new Point(10, 20)
    printPoint()

    def printPoint() {
      println("x 的坐标点 : " + point.x);
      println("y 的坐标点 : " + point.y);
    }


  }
}


// 私有构造方法
class Marker private(val color: String) {

  println("创建" + this)

  override def toString: String = "颜色标记：" + color

}

// 伴生对象，与类共享名字，可以访问类的私有属性和方法
object Marker {

  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def apply(color: String): Marker = {
    if (markers.contains(color)) markers(color) else null
  }

  def getMarker(color: String): Marker = {
    if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]) {
    println(Marker("red"))
    // 单例函数调用，省略了.(点)符号
    println(Marker getMarker "blue")
  }
}
