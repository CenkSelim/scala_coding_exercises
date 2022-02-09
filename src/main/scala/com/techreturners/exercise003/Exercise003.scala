package com.techreturners.exercise003

class Exercise003 {
 // added the array here as there was no reason to add it in a separate file
  val flavours = Array("Pistachio",
    "Raspberry Ripple",
    "Vanilla",
    "Mint Chocolate Chip",
    "Chocolate",
    "Mango Sorbet"
  )

  def getIceCreamCode(iceCreamFlavour: String): Int = flavours.indexWhere( _ == iceCreamFlavour)

  def iceCreamFlavours: Array[String] = flavours

}
