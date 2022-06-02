package elaboration

import scala.annotation.tailrec

object fibonacci {
  /**
   * This is a tail-recursive method that generates the nth term of the Fibonacci sequence
   * @param n - the index of the term you wish to receive (nth)
   * @param previous - the prior term to your desired term (n-1th), default value 0
   * @param next - the following term to your desired term (n+1th), default value 1
   * @return - the nth indexed term of the Fibonacci sequence
   */
  @tailrec
  def generateNthFibonacciNumber(n: Int, previous: Int = 0, next: Int = 1): Int = {
    if (n == 0) previous
    else generateNthFibonacciNumber(n - 1, next, previous + next)
  }
}
