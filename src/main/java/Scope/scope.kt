package Scope

fun main() {

    val student = Student()
    student.address = "dfsdf"
    student.age = 24
    student.name = "sdf"

    val apply = student.also {
        it.name = "dsgd"
        it.id = 343
    }

    apply.name
    /*   student.apply {
           name = "MyName"
           id = 12
       }*/
}


class Student(var name: String = "", var id: Int = 0,var  age: Int = 0,var address: String = "")