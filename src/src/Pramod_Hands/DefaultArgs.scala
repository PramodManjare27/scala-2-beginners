package src.Pramod_Hands

import scala.annotation.tailrec

object DefaultArgs extends App {

  //Writing function to accept default arguments
@tailrec
  def FactArgs ( n: Int, acc : Int) : Long = {
    if (n <=1) acc
    else FactArgs(n -1, acc * n)
  }
  println(FactArgs(5, 1))

  // we can call arguments in any sequence
  println ( FactArgs( acc = 2 , n =5))

  // we can pass default values to below function for all arguments
 def savePicture ( name : String = "Default.jpg" , height : Int = 1250 , Width : Int = 950 ) = {println(s"saving picture $name $height $Width")}
  savePicture()
  savePicture("custom.jpg")
  savePicture("custom2.jpg", height = 1999)
  savePicture("custom3.jpg", height = 1999, Width = 450)
  savePicture( Width = 499 , height = 1799)

}
