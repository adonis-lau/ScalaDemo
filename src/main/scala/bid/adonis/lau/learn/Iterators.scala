package bid.adonis.lau.learn

object Iterators {
  def main(args: Array[String]): Unit = {
    //迭代器返回所有元素
    val iterator1 = Iterator("Baidu", "Google", "Runoob", "Taobao")
    val iterator2 = Iterator("Baidu", "Google", "Runoob", "Taobao")
    for (elem <- iterator1) {
      println(elem)
    }
    println("----------")
    while (iterator2.hasNext) {
      println(iterator2.next())
    }

    //查找最大与最小元素
    val ita = Iterator(20, 40, 2, 50, 69, 90)
    val itb = Iterator(20, 40, 2, 50, 69, 90)
    println("最大元素是：" + ita.max)
    println("最小元素是：" + itb.min)

    //获取迭代器的长度
    val itc = Iterator(20, 40, 2, 50, 69, 90)
    val itd = Iterator(20, 40, 2, 50, 69, 90)
    println("ita.size 的值: " + itc.size)
    println("itb.length 的值: " + itd.length)

  }
}
