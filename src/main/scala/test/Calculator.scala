package test

/**
  * Created by knoldus on 3/11/17.
  */
object Calculator extends App{

def showMenu ={
println("---- Select any operations ----")
  println("----------1 To Add ----------")
  println("----------2 To SUB ----------")
  println("----------3 To MUL ----------")
  println("----------4 To DIV ----------")
  println("----------5 To EXIT ----------")
}

  while (true) {
    showMenu
    val input = scala.io.StdIn.readLine()
    input match {
      case "1" =>
        print("\nEnter two no to add (space seprated e.g 2 3)- ")
        val values = scala.io.StdIn.readLine()
        val noToAdd = values.split(" ")
        println("The result is ====> " + CalcOperations.add(noToAdd(0).toInt.toDouble, noToAdd(1).toInt.toDouble))

      case "2" =>
        print("\nEnter two no to substract (space seprated e.g 2 3)- ")
        val values = scala.io.StdIn.readLine()
        val noToAdd = values.split(" ")
        println("The result is ====> " + CalcOperations.sub(noToAdd(0).toInt.toDouble, noToAdd(1).toInt.toDouble))

      case "3" =>
        print("\nEnter two no to multiply (space seprated e.g 2 3)- ")
        val values = scala.io.StdIn.readLine()
        val noToAdd = values.split(" ")
        println("The result is ====> " + CalcOperations.mul(noToAdd(0).toInt.toDouble, noToAdd(1).toInt.toDouble))

      case "4" =>
        print("\nEnter two no to divide (space seprated e.g 2 3)- ")
        val values = scala.io.StdIn.readLine()
        val noToAdd = values.split(" ")
        println("The result is ====> " + CalcOperations.div(noToAdd(0).toInt.toDouble, noToAdd(1).toInt.toDouble))

      case "5" => System.exit(0)
      case _ => print("You have choosed invalid option")
    }
  }
}
