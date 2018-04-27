package bid.adonis.lau

import scala.util.control.Breaks

/**
  * 循环和break
  */
object LoopTypes {

  def main(args: Array[String]): Unit = {
    var a = 0
    var b = 0
    val numList1 = List(1, 2, 3, 4, 5)
    val numList2 = List(11, 12, 13)

    val outer = new Breaks
    val inner = new Breaks

    outer.breakable {
      for (a <- numList1) {
        println("Value of a: " + a)
        inner.breakable {
          for (b <- numList2) {
            println("Value of b: " + b)
            if (b == 12) {
              // 内嵌循环中断
              inner.break()
            }
          }
        }
        if (a == 4) {
          // 外部循环中断
          outer.break()
        }
      }
    }
  }

}
