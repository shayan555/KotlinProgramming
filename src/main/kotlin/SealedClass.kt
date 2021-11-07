sealed class Data
{
    data class Success(val success:String):Data()
    data class Error(val error:String):Data()
    object loading:Data()
}
fun getData():Data
{
    return Data.Success((100..1000).random().toString())
}
fun main()
{
    val data = getData()
    when(data)
    {
        is Data.Success -> print(data)
        is Data.Error -> print(data)
        is Data.loading -> print(data)
    }
}