package bid.adonis.lau

import java.io.{BufferedReader, File, InputStreamReader, PrintWriter}

import scala.io.Source

object FileIO {
  def main(args: Array[String]): Unit = {
    //打开文件并写入内容
    val writer = new PrintWriter(new File("test.txt"))
    writer.write("菜鸟教程")
    writer.close()

    //从控制台读取（方法已过时）
    print("请输入内容：")
    val line1: String = Console.readLine
    println("首次输入的是：" + line1)

    //从控制台读取
    print("请再次输入内容：")
    val br = new BufferedReader(new InputStreamReader(System.in))
    val line2: String = br.readLine
    println("再次输入的是：" + line2)
    br.close()

    //从文件读取
    print("文件内容为：")
    Source.fromFile("test.txt").foreach(print)

    println(new File("test.txt").getAbsoluteFile)
  }

}
