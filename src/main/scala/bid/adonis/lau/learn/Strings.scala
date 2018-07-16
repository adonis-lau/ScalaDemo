package bid.adonis.lau.learn

object Strings {

  def main(args: Array[String]): Unit = {
    //字符串拼接
    val str1 = "菜鸟教程官网："
    val str2 = "www.runoob.com"
    val str3 = "菜鸟教程的 Slogan 为："
    val str4 = "学的不仅是技术，更是梦想！"
    println(str1 + str2)
    println(str3.concat(str4))

    //字符串格式化
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程!"
    var fs: Unit = printf("浮点型变量为 " +
      "%f, 整型变量为 %d, 字符串为 " +
      " %s", floatVar, intVar, stringVar)
    println(fs)

  }
}
