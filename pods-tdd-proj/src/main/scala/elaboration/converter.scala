package elaboration

import elaboration.animal.Animal
import elaboration.animal.Animal._


object converter {

  /**
   * A method that converts an Animal into an Int
   * @param animal - an animal we use on PODS to estimate ticket complexity
   * @return - the story points score of that animal
   */
  def convertAnimalToInteger(animal: Animal): Int = {
    animal match {
      case Mouse => 1
      case Cat => 3
      case Tiger => 5
      case Horse => 8
      case Elephant => 13
      case Dragon => 21
      case Wasp => throw BadAnimalException("Error: no one likes wasps.")
      case _ => throw BadAnimalException("Error: Animal not recognised.")
    }
  }

  /**
   * A method that converts story points into an Animal
   * @param n - the number of story points used on PODS to estimate ticket complexity
   * @return - the Animal score of those points
   */
  def convertIntegerToAnimal(n: Int): Animal = {
    n match {
      case 1 => Mouse
      case 3 => Cat
      case 5 => Tiger
      case 8 => Horse
      case 13 => Elephant
      case 21 => Dragon
      case _ => throw BadIntegerException("Error: Integer not recognised.")
    }
  }

  /*
  Some very basic custom exceptions
   */
  case class BadAnimalException(ex: String) extends RuntimeException
  case class BadIntegerException(ex: String) extends RuntimeException
}
