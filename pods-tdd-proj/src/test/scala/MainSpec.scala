// Importing all the methods from main
import scala.main._

// <-- This is the test suite, you can run all the tests with the green arrow
class MainSpec extends munit.FunSuite {
  // <-- or to run an individual test, use the individual green arrows
  test("giveMeN") {
    assertEquals(giveMeN(2000), 2000)
  }
}

