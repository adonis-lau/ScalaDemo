package bid.adonis.lau.learn

/**
  * 模式匹配
  */
object Matching {

  def matchFun(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }

  def main(args: Array[String]): Unit = {
    println(matchFun("two"))
    println(matchFun("test"))
    println(matchFun(1))
    println(matchFun(6))
  }
}

object CaseClasses {

  //样例类
  case class Person(name: String, age: Int)

  def main(args: Array[String]) {
    val alice = Person("Alice", 25)
    val bob = Person("Bob", 32)
    val charlie = Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case `alice` => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }

}