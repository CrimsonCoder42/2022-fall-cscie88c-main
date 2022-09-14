package org.cscie88c.week2
import org.cscie88c.testutils.{StandardTest}


class StudentTest extends StandardTest {
  "Student functions" when {
    "executed" should{
      "Show" in {
        val expectedResult = List("4,Delmore,Scriver,dscriver3@boston.com,Male,United States").map(Student(_))
        val nextResult = Student.apply("4,Delmore,Scriver,dscriver3@boston.com,Male,United States")
      }
    }
  }
}

