package bid.adonis.lau.learn

import scala.util.matching.Regex

object RegularExpressions {

  def main(args: Array[String]): Unit = {
    val pattern1 = "Scala".r
    val str1 = "Scala is Scalable and cool"
    println(pattern1 findFirstIn str1)

    val str2 = "Scala is scalable and cool"
    val pattern2 = new Regex("(S|s)cala") // 首字母可以是大写 S 或小写 s
    println((pattern2 findAllIn str2).mkString(","))

    val pattern3 = "(S|s)cala".r
    val str3 = "Scala is scalable and cool"
    println(pattern3 replaceFirstIn(str3, "Java"))

    val pattern4 = new Regex("abl[ae]\\d+")
    val str4 = "ablaw is able1 and cool"
    println((pattern4 findAllIn str4).mkString(","))
  }
}
