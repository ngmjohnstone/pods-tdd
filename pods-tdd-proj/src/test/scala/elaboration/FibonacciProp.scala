package elaboration

import elaboration.fibonacci.generateNthFibonacciNumber
import org.scalacheck.Gen
import org.scalacheck.Prop.forAll

class FibonacciProp extends munit.ScalaCheckSuite {
  val fibonacciDomain: Gen[Int] = Gen.choose(1, 46)
  property("fibonacci numbers all positive"){
    forAll(fibonacciDomain) {(n: Int) =>
      generateNthFibonacciNumber(n) >= 0
    }
  }
  property("fibonacci(n) == fibonacci(n - 1) + fibonacci(n - 2)") {
    forAll(fibonacciDomain.suchThat(n => n >= 3)) { (n: Int) =>
      generateNthFibonacciNumber(n) == generateNthFibonacciNumber(n - 1) + generateNthFibonacciNumber(n - 2)
    }
  }
}