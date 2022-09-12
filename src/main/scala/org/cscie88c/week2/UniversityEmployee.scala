package org.cscie88c.week2

class UniversityEmployee(val name: String, val email: String){
  def description: String = "Name: " + name + "," + " Email: " + email
}

object test extends App {
  val uni = new UniversityEmployee("Devin", "nostro37@gmail.com")

  println(uni.description)
}
