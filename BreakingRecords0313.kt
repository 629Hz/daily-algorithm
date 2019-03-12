/**
 * Created by hz on 13/03/2019.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    val result = Array(2, {0})

    var max = scores[0]
    var min = scores[0]

    var maxCnt = 0
    var minCnt = 0

    scores.forEach {
        if(max > it) {
            max = it
            maxCnt ++
        }
        if(min < it) {
            min = it
            minCnt ++
        }
    }

    result[0] = maxCnt
    result[1] = minCnt

    return result
}