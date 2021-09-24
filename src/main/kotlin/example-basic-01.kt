
/**
 * 코틀린 공식 문서 ex1
 * 코루틴의 delay 순환 과정
 */
fun main() {
    GlobalScope.launch { // launch a new coroutine in background and continue
        delay(1000L)
        println("World!")
        // but this expression blocks the main thread
    }
    println("Hello,") // main thread continues here immediately
    runBlocking {
        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
    }
}
