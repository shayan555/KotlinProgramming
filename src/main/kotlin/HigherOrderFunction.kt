fun main()
{
    addTwoNumbers(2,7) {
        print(it)
    }
}

 fun addTwoNumbers(a:Int,b:Int,action:(Int) -> Unit)
{
    val c= a+b
    action(c)
}