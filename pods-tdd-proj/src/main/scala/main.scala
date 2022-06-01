package scala

// Imports
import elaboration.fibonacci._
import elaboration.converter._


/**
 * main is where things run. I've included a dummy method, giveMeN.
 * <---main extends App, so you can run everything inside it with the green arrow.
 */
object main extends App {
  /**
   * This method simply returns the integer number you pass it
   * @param n - the number you pass in
   * @return - the number you get back
   */
  def giveMeN(n: Int): Int = {
    n
  }

  /*
  Put anything you want to see in the console here and run main with the green arrow.
   */
  val converted5 = giveMeTheAnimal(5)
  println(converted5)

  val convertedTiger = convertAnimalToNumber("Tiger")
  println(convertedTiger)

}
