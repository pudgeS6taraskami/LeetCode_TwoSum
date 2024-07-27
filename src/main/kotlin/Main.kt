


fun main(){

        val input = readLine()
        val numbers = input?.split(' ')?.map { it.toInt() }?.toIntArray()
        val input2 = readLine()
        if (input2 != null) {
            if (numbers != null) {
                maina(numbers, input2.toInt())
            }
        }
    }


    fun maina(nums: IntArray, target: Int) {

        for (i in 0 until nums.size - 1){
            for (j in i + 1 until nums.size){
                val sum = nums[i] + nums[j]
                if (sum == target){
                    println("$i $j")
                }
            }
        }
    }


