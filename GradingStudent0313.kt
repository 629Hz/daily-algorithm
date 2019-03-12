/**
 * Created by hz on 13/03/2019.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {

    val result = Array(grades.size, {0})

    grades.forEachIndexed { index, value ->
        if(value < 38) {
            result[index] = value
        } else {

            val m = value / 5
            val isRound = ((m + 1) * 5 - value) < 3

            result[index] = if(isRound) {
                (m + 1) * 5
            } else {
                value
            }

        }
    }


    return result
}