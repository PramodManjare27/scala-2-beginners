package Rajesh

import scala.annotation.tailrec

object RecursionPractice extends App {

  def stringRepition(aString: String, num: Int): String = {
    @tailrec
    def strAux(bString: String, num1: Int, accum: String): String = {
      if (num1 <= 0) accum
      else strAux(aString, num1 - 1, accum + aString)
    }
    strAux(aString, num, "")
  }
  println(stringRepition("Hi ",5))

  def isPrime(num: Int): Boolean = {
    @tailrec
    def isDivisibleBy(n: Int, i: Int, accu: Boolean): Boolean = {
      if (i <= 1) accu
      else isDivisibleBy(n, i - 1, (n % i != 0) && accu)
    }

    isDivisibleBy(num, num / 2, true)
  }

  val num2 = 10 * 5
  println(s"Is number $num2 Prime?: ${isPrime(num2)}")

}
