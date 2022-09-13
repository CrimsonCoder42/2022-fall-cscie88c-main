package org.cscie88c.week2

//Define a case class Student to represent an entry in the student table
//The Student case class should have the following fields
//id, firstName, lastName, email, gender, country
//Note: Write the class in the file src/main/scala/org/cscie88c/week2/Student.scala

final case class Student(
                        id: Int,
                        firstName: String,
                        lastName: String,
                        email: String,
                        gender: String,
                        country: String,
                        )


//Write a Student companion object with a data constructor to create a Student object from
//a comma-separated-value (CSV) string

object Student {

  val test = Student(1,"Emmy","Conrart", "econrart0@gizmodo.com", "Male", "China")



}




//reference: https://nrinaudo.github.io/scala-best-practices/tricky_behaviours/final_case_classes.html
////final case class PositiveInt(value: Int)
////
////object PositiveInt {
////  def fromInt(i: Int): Option[PositiveInt] =
////    if(i > 0) Some(new PositiveInt(i))
////    else      None
////}
