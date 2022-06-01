package elaboration

object converter {

  // Convert an Animal to an integer

  // Change from string to Animal
  def convertAnimalToNumber(animal: String): Int = {
    animal match {
      case "Tiger" => 5
      case _ => 999
    }
  }

  // Change from integer to Animal
  // ...

}
