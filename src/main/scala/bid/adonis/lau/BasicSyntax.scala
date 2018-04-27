package bid.adonis.lau

/**
  * 基础语法
  */
object BasicSyntax {

  def main(args: Array[String]): Unit = {

    //变量
    var myVar: String = "Foo2"
    //常量
    val myVal: String = "asdf"

    //在 Scala 中声明变量和常量不一定要指明数据类型，在没有指明数据类型的情况下，其数据类型是通过变量或常量的初始值推断出来的。
    //所以，如果在没有指明数据类型的情况下声明变量或常量必须要给出其初始值，否则将会报错。
    var myInt = 10
    val myStr = "Hello, Scala!"

    //一次性声明多个变量
    var xmax, ymax = 100
    val xmin, ymin = 1

    //声明元组
    var pa = (30, "Lau")
    val pb = (40, "Foo")

    val foo1 =
      """adonis
        |lau
        |String
        |test
      """.stripMargin
    val foo2 =
      """adonis
        |lau
        |String
        |test
      """
    println(myVar)
    println(myVal)
    println(myInt)
    println(myStr)
    println(xmax, ymax)
    println(xmin, ymin)
    println(pa)
    println(pb)
    print(foo1)
    print(foo2)

  }
}
