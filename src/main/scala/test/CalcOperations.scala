package test

/**
  * Created by knoldus on 3/11/17.
  */
object CalcOperations {

  def add(a:Double ,b:Double): Double ={
    a+b
  }

  def sub(a:Double ,b:Double): Double ={
    a-b
  }

  def div(a:Double ,b:Double): Double ={
    b match {
      case b:Double if b>0=>     a/b
      case _=> 0
    }
  }

  def mul(a:Double ,b:Double): Double ={
    a*b
  }
}
