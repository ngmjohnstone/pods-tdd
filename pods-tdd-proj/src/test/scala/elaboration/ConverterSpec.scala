package elaboration

import elaboration.animal.Animal._
import elaboration.converter._

class ConverterSpec extends munit.FunSuite {

  /*
  We know these assertions should work from how we've written the methods:
   */
  test("Convert 5 into a Tiger") {
    assertEquals(convertIntegerToAnimal(5), Tiger)
  }

  test("Convert Tiger into a 5") {
    assertEquals(convertAnimalToInteger(Tiger), 5)
  }

  /*
  We know that we can intercept these failures from how we've written the methods:
   */
  test("Fail when converting bad integer to animal") {
    intercept[BadIntegerException] {
      convertIntegerToAnimal(600)
    }
  }

  test("Fail when converting bad animal to integer") {
    intercept[BadAnimalException] {
      convertAnimalToInteger(Wasp) // No one likes wasps.
    }
  }
}

