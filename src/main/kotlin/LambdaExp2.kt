fun main()
{
    val make:(String,String) -> String = {realName,heroName -> "$realName is now $heroName"}
    makeMyHero("shayan","hashmi",make)
}
fun makeMyHero(realName:String,heroName:String,make:(String,String) -> String)
{
    val result = make(realName,heroName)
    print(result)
}