package com.techreturners.exercise001

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String = word.substring(0,1).toUpperCase() + word.substring(1)

  def generateInitials(firstName: String, lastName: String) = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase()

  def addVat(initialPrice: Double, interestRate: Double) : Double = {
    // May need refactoring - best find at the moment
    val vat = BigDecimal(initialPrice * interestRate / 100).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    initialPrice + vat
  }

  def reverse(sentence: String) : String = ""

  /**
   * Here we show using a Scala sequence which is a type of collection
   * https://alvinalexander.com/scala/seq-class-methods-examples-syntax/
   *
   * @param users A collection of users
   * @return
   */
  def countLinuxUsers(users: Seq[User]): Int = {
    // Add your code here
    0
  }

}
