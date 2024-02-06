package Rajesh

import scala.annotation.tailrec

object FunctionPratice extends App {

  //greeting function
  def greetFunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }

  println(greetFunction("Raj", 30))

  //Find factorial function
  def factFunction(num: Int): Int = {
    if (num <= 1) num
    else num * factFunction(num - 1)
  }

  val num = 5
  println(s"factorial of $num is ${factFunction(num)}")

  //Find fibonacci function
  def fibonacciFunction(num: Int): Int = {
    if (num <= 1) num
    else fibonacciFunction(num - 1) + fibonacciFunction(num - 2)
  }

  val num1 = 8
  println(s"Fibonacci number for $num1 is ${fibonacciFunction(8)}")

  //check if number is Prime function
  def isPrime(num: Int): Boolean = {
    def isDivisibleBy(n: Int, i: Int): Boolean = {
      if (i <= 1) true
      else (n % i != 0) && isDivisibleBy(n, i - 1)
    }

    isDivisibleBy(num, num / 2)
  }

  val num2 = 5
  println(s"Is number $num2 Prime?: ${isPrime(num2)}")
}
