package Scope

fun main() {

    val student = Student()
    student.apply {
        name = "MyName"
        id = 12
    }
}


class Student(var name: String = "", var id: Int = 0,var  age: Int = 0,var address: String = "")