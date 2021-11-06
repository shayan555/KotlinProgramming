fun main()
{
    var value1:Int = 5
    var value2:Int = 10
    print(value2 greaterValue value1)
}
infix fun Int.greaterValue(other:Int):Int
{
    if(this>other) return this else return other
}