package kr.goldenmine.likelion_hackathon_backend.util

import java.util.*

private val random = Random()

fun randomFloat(): Float = random.nextFloat()
fun random(start: Double, finish: Double) = random.nextDouble() * (finish - start + 1) + start