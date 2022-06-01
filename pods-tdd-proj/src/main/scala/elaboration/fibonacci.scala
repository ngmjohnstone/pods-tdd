package elaboration

object fibonacci {
  def giveMeTheAnimal(n: Int): String = {
    n match {
      case 5 => "It's a tiger"
      case _ => "It's not a tiger"
    }
  }
}
