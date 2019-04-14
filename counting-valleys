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

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
  val SEA_LEVEL = 0
    
    var prev = SEA_LEVEL
    var current = SEA_LEVEL
    var valleyCnt = 0
    
    s.forEach { 
        if(it == 'U') {
            current++
            if(prev < SEA_LEVEL && current == SEA_LEVEL) {
                valleyCnt++
            }
        } else if(it == 'D') {
            current--
           
        }
        prev = current
    }
    
    return valleyCnt

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
