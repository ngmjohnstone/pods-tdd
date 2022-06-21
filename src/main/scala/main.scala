package scala

// Imports
import elaboration.animal
import elaboration.animal.Animal
import elaboration.converter._
import elaboration.fibonacci.generateNthFibonacciNumber

import scala.util.Try


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

  println(generateNthFibonacciNumber(45))


//  val unicorn = convertAnimalToInteger(_)
//  println(unicorn.message)
//  val converted3 = convertIntegerToAnimal(3)
//  println(converted3)


//  val testFib = generateNthFibonacciNumber(30)
//  println(testFib)

//  val converted5 = convertIntegerToAnimal(5)
//  println(converted5)
//
//  val convertedTiger = convertAnimalToInteger("Tiger")
//  println(convertedTiger)

}
