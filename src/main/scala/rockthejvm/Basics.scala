package rockthejvm

object Basics extends App {
  val meaningOfLife1: Int = 42
  //meaningOfLife = 43
  val aBoolean = false
  println(s"Int  = ${meaningOfLife1}")
  val name = "Andy"
  val age = 50
  val weight = 80.03

  val aString = "I Love SCALA"
  val concatString = "I" + " " + "Love" + " " + "SCALA"
  case class Student (name: String, age: Int)
  val hannah = Student("Hannah",33)
  println(s"object = $hannah  has the name = ${hannah.name} and age = ${hannah.age} ")
  println(s"String = ${aString}")
  println(s"concat = ${concatString}")
  println(s"The Boolean result = ${1 == 2}")
  println(f"$name%15s is $age%5d years old, %nand weighs $weight%05.4f pounds.")

  val aCodeBlock = {
    val x = 33
    val y = x + 3
    y
  }
  println(aCodeBlock)

  def myFunc (a: Int, b: String): String = b + a
  println(myFunc(3,"Number"))

  def fctrl (a: Int) : Int = { if (a<=1) 1 else fctrl(a-1)*a
  }
  println(fctrl(7))
}
