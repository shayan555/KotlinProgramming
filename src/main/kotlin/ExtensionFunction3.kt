fun main()
{
    SomeExample.someExample()
}

class SomeExample{
    companion object{

    }
}

fun SomeExample.Companion.someExample()
{
    print("Extension function")
}