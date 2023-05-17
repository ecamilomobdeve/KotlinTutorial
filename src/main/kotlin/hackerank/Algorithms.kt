package hackerank

object Algorithms {

/*
* */
fun bigSum(x:Int, arr: LongArray): Long {
    var sum = 0L
    for (it in arr.indices){
        sum += arr[it]
    }
    return sum
}

    /*  Given a square matrix, calculate the absolute
    difference between the sums of its diagonals.
*/
    fun diagonalDifference(arr: Array<Array<Int>>):Int{
        var counterRight = 0
        var counterLeft = arr.lastIndex
        var toLeft = 0
        var toRight = 0
        for (i in  arr.indices){
            loop@for (j in arr.indices){
                if(i == j){
                    toRight += arr[i][j]
                    toLeft += arr[i][counterLeft]
                    counterRight ++
                    counterLeft --
                    break@loop
                }

            }
        }
        return Math.abs((toRight)-(toLeft))
        /*
    This code is for asking n items for Square array
    return Math.abs((toRight)-(toLeft))
        val n = readLine()!!.trim().toInt()
        val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })
        for (i in 0 until n) {
            arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }
        val result = diagonalDifference(arr)
        println(result)*/
    }
}