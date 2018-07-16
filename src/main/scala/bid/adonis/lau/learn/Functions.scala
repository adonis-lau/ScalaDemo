package bid.adonis.lau.learn

/**
  * 函数
  */
object Functions {

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    //返回值可以不写return，且返回时不可计算
    sum
  }


  def main(args: Array[String]): Unit = {
    println("Returned Value : " + addInt(5, 7))
  }
}
