package com.techreturners.exercise003

class Exercise003 {
  
  val flavours = Array("Pistachio",
    "Raspberry Ripple",
    "Vanilla",
    "Mint Chocolate Chip",
    "Chocolate",
    "Mango Sorbet"
  )

  def getIceCreamCode(iceCreamFlavour: String): Int = flavours.indexWhere( _ == iceCreamFlavour)

  def iceCreamFlavours: Array[String] = {
    throw new UnsupportedOperationException("You can delete this line and add your code here.")
  }

}
