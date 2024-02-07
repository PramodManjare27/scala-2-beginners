package src.Pramod_Hands
import scala.annotation.tailrec
object functions extends App {
def aFunction ( a : Int , b : Int, operation : String) : Double = {

val d: Double = operation.toUpperCase match {
case "ADD" => a + b
case "SUB" => a - b
case "MUL" => a * b
case "DIV" => a /b
case _ => 0
}
d
}

println(aFunction(1,2,"MUL"))
  /*
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  */
  def greentings[T, P] (name : T , age : P) : Unit = {
  name match {
  case a: List[Int] => println(s"value for " + a(0) +s" is $age")
  case _ => println(s"value for $name is $age")
  }
	  
  } 

  greentings[List[Int], Int](List(1,2,3), 20)
  greentings[Boolean, Int](true, 20)
    /*
    2.  Factorial function 1 * 2 * 3 * .. * n

    */

   def factorialWithoutTailrec ( n : Int) : Long = {
   if (n == 0 ) 1
   else {
   println(s"$n calling factorialWithoutTailrec${n - 1}")
   n * factorialWithoutTailrec( n - 1)}
   }
   println(factorialWithoutTailrec(10))

@tailrec
   def factorialWithTailRec ( n : Int , Acc : Long = 1L) : Long = {
   if (n == 0) Acc
   else factorialWithTailRec( n -1 , n*Acc)
   } 
   println(factorialWithTailRec(10))
    /*
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    */
   // for Fibonacci series last two numbers are added to derive next
   // 1  1  2  3  5  8  13  21  34 .....
    def Fibonacci( n : Int) : Int = {
    if ( n <= 2) 1
    else Fibonacci(n-1) + Fibonacci (n -2 )
    }
    println(Fibonacci(9))
    /*4.  Tests if a number is prime.
   */
//  for testing number is prime or not, logic is 
// Divide number by its half, if remainder is non zero, divide by half - 1 recurrsively
// Write a sub function for it

def isPrime( n : Int) : Boolean = {
  def Utilfunction ( t : Int ) : Boolean ={
    if ( t <= 1) true
    else n % t != 0  &&  Utilfunction( t - 1 )
    
  }
  Utilfunction(n/2)
}
 println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
