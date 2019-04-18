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

// Complete the chocolateFeast function below.
fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    // n : 돈
    // c : 1개의 사탕가격
    // m : 1개를 바꾸기 위한 껍질 갯수

    var choco = n / c

    var wrappers = choco

    while(wrappers / m != 0) {
        val mok = wrappers / m
        val rem = wrappers % m
        choco += mok
        wrappers = mok + rem
    }

    return choco
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()


    for (i in 1 .. t) {
        val ncm = scan.nextLine().split(" ")

        val n = ncm[0].trim().toInt()
        val c = ncm[1].trim().toInt()
        val m = ncm[2].trim().toInt()

        val result = chocolateFeast(n, c, m)
        println(result)
    }
}
