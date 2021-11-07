
/**********************************************/
/* |Function      | Context Object       | Return Value    */
/* --------------------------------------------------------   */
/* | let          | it                   |  lambda result
*  | run          | this                 |  lambda result
*  | with         | this                 |  lambda result
*  | apply        | this                 |  Context object
*  | also         | it                   |  Context object
-------------------------------------------------------------
*  */

class Square(
             private val width: Int,
             private val height:Int,
             private var color:String? = null,
             private var text:String? = null
)
{
    fun fillColor(color:String)
    {
        this.color = color
        println("Color: $color")
    }

    fun fillText(text:String)
    {
        this.text = text
        println("Text : $text")
    }

    override fun toString(): String {
        return "Square(Width:$width,Height:$height,Color:$color,Text:$text)"
    }
}

//lateinit var square: Square
fun main()
{
//    var square1:Square? = null
//
//    square1.let {
//        if (it != null) {
//            square = it
//        }
//    }

    val square = Square(10,20).let {
        it.fillColor("RED")
        it.fillText("SOME TEXT")
        it
    }

    print(square)
}



