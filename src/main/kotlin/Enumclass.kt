fun main() {
    val day=Day.sunday

    val day2=Day2.sunday
    println(day)
    println(day2.num)
    day2.printFormattedDay()

    for (i in Day.values())
    {
        println(i)
    }
}

enum class Day
{
    sunday,
    monday,
    tuesday,
    wednesday,
    thurday,
    friday,
    saturday
}

enum class Day2(val num:Int)
{
    sunday(1),
    monday(2),
    tuesday(3),
    wednesday(4),
    thurday(5),
    friday(6),
    saturday(7);

    fun printFormattedDay()
    {
        println("Days is $this ")
    }
}