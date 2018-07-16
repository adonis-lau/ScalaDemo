package bid.adonis.lau.learn

import scala.Array._

object Arrays {
  def main(args: Array[String]): Unit = {
    val array = Array(1.9, 2.9, 3.4, 3.5)

    //输出所有数组元素
    for (elem <- array) {
      println(elem)
    }

    //计算数组中所有元素的总和
    var total = 0.0
    for (elem <- array) {
      total += elem
    }
    println("总和为：" + total)

    //查找数组中最大数
    var max = array(0)
    for (elem <- array) {
      if (elem > max) max = elem
    }
    println("最大数为：" + max)


    //多维数组
    val matrix = ofDim[Int](3, 3)
    //创建矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        matrix(i)(j) = i * j
      }
    }

    //打印矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print("" + matrix(i)(j) + "\t")
      }
      println()
    }


    //合并数组
    val before1 = Array(1.9, 2.9, 3.4, 3.5)
    val before2 = Array(8.9, 7.9, 0.4, 1.5)
    val after = concat(before1, before2)
    //输出所有元素
    for (elem <- after) {
      println(elem)
    }


    //创建区间数组
    var rangeOne = range(10, 20, 2)
    var rangeTwo = range(10, 20)
    for (elem <- rangeOne) {
      print(elem + "\t")
    }
    println()
    println("------ ****** ------")
    for (elem <- rangeTwo) {
      print(elem + "\t")
    }
    println()
  }

}