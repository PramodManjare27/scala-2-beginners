package src.Pramod_Hands

object DefaultArgs {

  //Writing function to accept default arguments

  def FactArgs ( n: Int, acc : Int) : Int = {
    if (n <=0) acc
    else FactArgs(n -1, acc * n)
  }

  println(FactArgs(40, 1))
}
