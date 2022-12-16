package kr.goldenmine.likelion_hackathon_backend.problem

class Fibonacci {
}

/*
문제 예시

0번째 0, 1번째 1, 2번째 1이라고 할때 30번째 피보나치 수열의 값은 몇인가
1. 832,040 - 주식 20시에 5% 증가
2. 2,178,309 - 주식 20시에 3% 감소

결과적으로 20시엔 5% 주식 상승이 있음
 */
fun main() {
    var a = 0L
    var b = 1L
    var c = 1L

    println("0: $a")
    println("1: $b")
    println("2: $c")

    for(i in 0..50 - 3) {
        a = b
        b = c
        c = a + b

        println("${i + 3}: $c")
    }
}