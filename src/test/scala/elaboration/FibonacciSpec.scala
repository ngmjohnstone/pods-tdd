package elaboration

import org.scalacheck.Prop.forAll
import elaboration.fibonacci.generateNthFibonacciNumber
import org.scalacheck.Gen

class FibonacciSpec extends munit.FunSuite {
  /*
  We can assert for cases we know will work:
   */
  test("The 5th term should be 5") {
    assertEquals(generateNthFibonacciNumber(5), 5)
  }

  test("The 10th term should be 55") {
    assertEquals(generateNthFibonacciNumber(10), 55)
  }


}
