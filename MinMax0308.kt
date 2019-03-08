/**
 * Created by hyejin on 08/03/2019.
 */
fun miniMaxSum(arr: Array<Int>): Unit {

    var max = 0L
    var min = Long.MAX_VALUE
    for (i in 0 until arr.size) {
        var temp = 0L
        for (j in 0 until arr.size) {
            if(j != i) {
                temp += arr[j]
            }
        }
        if(max < temp) {
            max = temp
        }

        if(min > temp) {
            min = temp
        }
    }

    System.out.print("$min $max")
}
