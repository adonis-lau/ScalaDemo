package bid.adonis.lau.learn

/**
  * 运算符
  */
object Operators {

  def arithmetic(): Unit = {
    //算数运算符
    val a: Int = 10
    val b: Int = 20
    val c: Int = 25
    val d: Int = 25
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))
  }

  def relation(): Unit = {
    //关系运算符
    val a: Int = 10
    val b: Int = 20
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("b >= a = " + (b >= a))
    println("b <= a = " + (b <= a))
  }

  def logical(): Unit = {
    //逻辑运算符
    val a: Boolean = true
    val b: Boolean = false
    println("a && b = " + (a && b))
    println("a || b = " + (a || b))
    println("!(a && b) = " + !((a && b)))
  }

  def bit(): Unit = {
    //位运算符
    /* 60 = 0011 1100 */
    val a: Int = 60
    /* 13 = 0000 1101 */
    val b: Int = 13
    var c: Int = 0

    c = a & b /* 12 = 0000 1100 */
    println("a & b = " + c)

    c = a | b /* 61 = 0011 1101 */
    println("a | b = " + c)

    c = a ^ b /* 49 = 0011 0001 */
    println("a ^ b = " + c)

    c = ~(a) /* -61 = 1100 0011 */
    println("~a = " + c)

    c = a << 2 /* 240 = 1111 0000 */
    println("a << 2 = " + c)

    c = a >> 2 /* 15 = 1111 */
    println("a >> 2  = " + c)

    c = a >>> 2 /* 15 = 0000 1111 */
    println("a >>> 2 = " + c)
  }

  def assignment(): Unit = {
    //赋值运算符
    var a: Int = 10
    val b: Int = 20
    var c: Int = 0

    c = a + b
    println("c = a + b  = " + c)

    c += a
    println("c += a  = " + c)

    c -= a
    println("c -= a = " + c)

    c *= a
    println("c *= a = " + c)

    a = 10
    c = 15
    c /= a
    println("c /= a  = " + c)

    a = 10
    c = 15
    c %= a
    println("c %= a  = " + c)

    c <<= 2
    println("c <<= 2  = " + c)

    c >>= 2
    println("c >>= 2  = " + c)

    c >>= 2
    println("c >>= a  = " + c)

    c &= a
    println("c &= 2  = " + c)

    c ^= a
    println("c ^= a  = " + c)

    c |= a
    println("c |= a  = " + c)
  }


  def main(args: Array[String]): Unit = {

    arithmetic()
    println("--------------------------------")

    relation()
    println("--------------------------------")

    logical()
    println("--------------------------------")

    bit()
    println("--------------------------------")

    assignment()
    println("--------------------------------")
  }
}
