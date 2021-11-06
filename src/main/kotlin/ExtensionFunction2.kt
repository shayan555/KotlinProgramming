fun main(args:Array<String>)
{
    var name:String ="Shayan hashmi"
    var india:String = "I LOVE MY INDIA"
    println(name.removeSpace())
    print(india.removeSpace())
}
fun String.removeSpace():String
{
   return this.replace(" ", "")
}