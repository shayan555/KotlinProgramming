fun main(args: Array<String>) {

    val student  = Student()
    student.hasFailed()
}

fun Student.hasFailed()
{
    print("Failed")
}
class Student
{
    fun hasPassed()
    {
        print("Passed")
    }
}