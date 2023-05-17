package utils

object Conversions{
    fun isInteger(anyValue:String): Boolean {
        return if (anyValue.toIntOrNull() != null){
            true
        } else{
            if (anyValue.isEmpty()){
                println("it's empty")
            }else{
                println("It's not an INTEGER")
            }
            return false
        }

    }
}