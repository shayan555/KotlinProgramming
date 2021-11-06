import kotlin.concurrent.thread

fun main()
{
//   rollDice(1..6,5){
//       println(it)
//   }

   val result =  rollDice{
       println(it)
   }
    println(result)
}

fun rollDice(
    callback:((Int) ->Unit)? = null

):String
{
    thread {
        Thread.sleep(3000)
        callback?.invoke(4)
    }
    return "Rooling Dice"
}

fun rollDice(range:IntRange,time:Int,callback:(Int) -> Unit)
{
    for (i in 0 until time)
    {
        var result = range.random()
        callback(result)
    }
}