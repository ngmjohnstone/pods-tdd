package elaboration

object animal {

  /*
  This is a sealed trait because we're not adding any more animals to the ones below
   */
  sealed trait Animal
  /*
  Here are the animals we currently use on PODS:
   */
  object Animal extends Enumeration {
    case object Mouse extends Animal
    case object Cat extends Animal
    case object Tiger extends Animal
    case object Horse extends Animal
    case object Elephant extends Animal
    case object Dragon extends Animal
    case object Wasp extends Animal
  }
}
