package letcode

object Algorithms {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.You may assume that each input would have exactly one solution,
     and you may not use the same element twice.
     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var oneSolution: IntArray = IntArray(2)
        var counter = 0
        var currentNumber = 0
        var sum = 0
        var targetFound = false
        do {
            currentNumber = nums[counter]
            loop@ for (item in counter until nums.lastIndex) {
                sum = currentNumber + nums[item + 1]
                println(
                    "item: $item and counter: $counter -> $currentNumber and  ${nums[item + 1]} = $sum"
                )
                if (sum == target) {
                    targetFound = true
                    oneSolution = intArrayOf(counter, item + 1)
                    //oneSolution[1] = i + 1
                    println("Found: ${oneSolution[0]} and ${oneSolution[1]}")
                    break@loop
                }
            }
            counter++
        } while (!(targetFound) || counter == nums.lastIndex)
        if (!targetFound)
            println("Not found")
        return oneSolution
    }

    /*
    Given a string s, find the length of the longest substring
    without repeating characters.
     */

    fun charsAndStrings() {
        var string = "Hello world!"
        var stringOne = "Hello world!"
        var stringTwo = "aaphgd918273645"
        var charArray = string.toCharArray()
        var charArrayTwo = string.toCharArray()

        //chars
        println("-- Characters")
        println("${charArray.elementAt(0)}")
        println(
            "${charArray[0]} - ${charArray.count()} -" +
                    "${charArray.contains('f')} "
        )
        for (element in charArrayTwo)
            println(element)

        //strings
        println("-- Strings --")
        val result = string.compareTo(stringOne) == 0
        println(string.removePrefix("Hello "))
        println(string.substringBefore("d"))
        println(string.substringAfter("o"))
        println(string.subSequence(5..7))
        println(string.endsWith("!"))
        println(string.drop(6))
        println(string[0])
        println(string.filterNot { it == 'o' })
        val numbers = listOf("one", "two", "three", "four")
        val n = intArrayOf(2, 4, 6, 8, 9)
        val longerThan3 = numbers.filter { it.length > 3 }
        println(longerThan3)
        println(n.filter { it % 2 == 0 })
        val filteredIdx = numbers.filterIndexed { index, s -> (index >= 1) && (s.length >= 3) }
        val filteredNot = numbers.filterNot { it.length <= 3 }
        println(filteredIdx)
        println(filteredNot)


    }

    fun lengthOfLongestSubstring(s: String): Int {
        var s="aaa"
        var current: Char
        var next: Char
        var sub = ""
        //sub = s[0].toString()
        var subStringArray = mutableListOf<String>()
        var i = 0

        while ((i != s.lastIndex)) {
            println("ENTERING $i TIMES")
            sub = s.elementAt(i).toString()
            next = s.elementAt(i + 1)
            when {
                sub.contains(next) -> subStringArray.add(sub).toString()
                i + 1 == s.lastIndex && sub.contains(next) ->
                    subStringArray.add(s.elementAt(i + 1).toString())
                i + 1 == s.lastIndex && !sub.contains(next) ->
                    subStringArray.add(sub + next).toString()
                else -> sub += next.toString()

            }
            println(
                "i:$i and i+1= ${i + 1}  current: ${s.elementAt(i)} Next: $next  sub: $sub " +
                        "Sub+current: $sub ${s.elementAt(i)} sub+next= ${sub + next}"
            )
            i++
        }


/*
        for (i in 0 until s.lastIndex) {
            println("ENTERING $i TIMES")
            //current = s.elementAt(i)
            sub = s.elementAt(i).toString()
            //sub += current.toString()
            next = s.elementAt(i + 1)

            when{
                sub.contains(next)-> subStringArray.add(sub).toString()
                i + 1 == s.lastIndex && sub.contains(next)->
                    subStringArray.add(s.elementAt(i + 1).toString())
                i + 1 == s.lastIndex && !sub.contains(next)->
                    subStringArray.add(sub+next).toString()
                else -> sub += next.toString()

            }
            println("i:$i and i+1= ${i+1}  current: ${s.elementAt(i)} Next: $next  sub: $sub " +
                    "Sub+current: $sub ${s.elementAt(i)} sub+next= ${sub+next}")




*/
/*            if (sub.contains(next) || (i + 1 == s.lastIndex)) {
                //subStringArray.add(sub)
                when{
                    sub.contains(next)-> subStringArray.add(sub).toString()
                    i + 1 == s.lastIndex && sub.contains(next)->
                        subStringArray.add(s.elementAt(i + 1).toString())
                    i + 1 == s.lastIndex && !sub.contains(next)->
                        subStringArray.add(sub+next).toString()

                }

*//*
*/
/*                if ((i + 1 == s.lastIndex)) {
                    subStringArray.add(s.elementAt(i + 1).toString())
                }*//*
*/
/*
                sub = ""
            }*//*

        }
*/
        for (element in subStringArray)
            println(element)
        return when (s.length) {
            0 -> 0
            1 -> 1
            else -> subStringArray.sortedByDescending { it.length }[0].length
        }
    }
}
