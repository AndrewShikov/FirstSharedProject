package rockthejvm

object ObjectOrientation extends App {

  
  class Animal {
    val age: Int = 0
    val name: String = "Bobr"
    def eat() = println ("Im eating.")
    // def walk()
  }
  val anAnimal = new Animal
  anAnimal.eat
  println("Age === " + anAnimal.age)
  class Dog(override val name : String) extends Animal

  val aDog = new Dog ("Jessie")
  println("I'm " + aDog.name + "." )
  aDog.eat

  def myFunc (a:Int) = {
    def inFunc = a + 1
    inFunc + 2
  }
  //val ret = println(myFunc(4))
  println("aDog.Name === " + aDog.name)
  def myFact (x : Int): Int =  if (x < 2) 1 else x * myFact(x - 1)
  val vv = println(myFact(9))
  val a = println(println() )


  trait Printable{  def print() }
  trait Showable {  def show() }

  class A6 extends Printable with Showable{
    def print(){ println("This is printable")   }
    def show(){  println("This is showable")    }    }


  var az = new A6()
  az.print()
  az.show()

  try {
    val str: String = null
    str.length
  } catch {
    case e: Exception => " !!! Errorrr message !!!"
  } finally {
    
  }







} // end of ObjectOrientation



