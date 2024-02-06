package src.Pramod_Hands

object ExpressionTests extends App{
// in scala everything is expression
  //Simple maths
  var x = 1 + 3
  println (x)

  x = 1 + 3 * 4
  println (x)

  x += 1
  // unary and equality operator
  println ( 13 == x )
  println ( !(13 == x ) )
  println(12 != x )

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)


  //While loop
  var itr = 10;
  while ( itr > 5)
    {
      println(itr)
      itr -= 1
    }

  val list = List(1,2,3,4,5)
  for {
  i<- list if i == 3
  } println(i)

  val listtestarg = "1234abc255"
  val newlist : Array[String] = listtestarg.split("")
  newlist.foreach( x =>
   println(try {x.toInt}
  catch {
    case _ => 0
  })
  )


  // EVERYTHING in Scala is an Expression!
  var aVariable = 4
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vs println("hello world")?
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)





  val listb = List(1,'a',3,'z',5)
 val z = for {
    i<- listb if i > 0 && i<10
  } yield i
println(z)
}
