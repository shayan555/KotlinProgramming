fun main()
{
    val square: (Int) -> Int = {
        it * it
    }

    println(square(5))

    val printName : (String) ->Unit = {name ->
        println(name)
    }
    printName("shayan")
}