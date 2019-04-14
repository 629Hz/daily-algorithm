import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the appendAndDelete function below.
fun appendAndDelete(s: String, t: String, k: Int): String {
     var diffIdx = -1

    val minLen = if (s.length < t.length) s.length else t.length

    for (i in 0 until minLen) {
        if(s[i] != t[i]) {
            diffIdx = i
        }
    }

    if(diffIdx == -1 && s.length != t.length) {
        diffIdx = minLen - 1
    }

    if(diffIdx != -1) {
        val minOp = (s.length - diffIdx) + (t.length - diffIdx)

        if(minOp <= k && (k - minOp) % 2 == 0) {
            return "Yes"
        }
    } else { // 같을 경우
        if(k % 2 == 0) {
            return "Yes"
        }
    }

    val minOp = s.length + t.length
    if(minOp <= k) {
        return "Yes"
    }

    return "No"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val t = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}
