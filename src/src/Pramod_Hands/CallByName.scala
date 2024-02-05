package src.Pramod_Hands
// Below is scala learning url for by name parameter learning
// https://docs.scala-lang.org/tour/by-name-parameters.html
object CallByName extends App {

// Define a call by value method
  def CallByValueMethod ( x : Long) : Unit = {

    println ( "SideEffect Printing task " + x )
    println ( "SideEffect Printing task " + x )
 }

// Define a call by name method
  def CallByNameMethod ( x: => Long) : Unit = {

   println ( "Call by Name SideEffect " + x )
   println ( "Call by Name SideEffect " + x )

  }

  // Call by Value is computed only once.

  CallByValueMethod ( 123122435656786787L)
  CallByValueMethod ( System.nanoTime())

  //Notice how method paramemter is computed at runtime.

  CallByNameMethod(System.nanoTime())

  // Call byName methods are computed only when its required
  //In below case if is computed to false, even if reccursive function will cause SOE, it wont be computed.
  // Failed only when if is computed to true and method execution is expected
  def TestingCallByValue():Int = 1+ TestingCallByValue()
  if (true )  TestingCallByValue()
}
