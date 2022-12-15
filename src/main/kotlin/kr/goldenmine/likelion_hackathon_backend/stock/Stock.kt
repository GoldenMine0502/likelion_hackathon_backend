package kr.goldenmine.likelion_hackathon_backend.stock

import kr.goldenmine.likelion_hackathon_backend.util.random
import java.util.*
import kotlin.collections.ArrayList

class Stock(
    private val stockInfo: StockInfo
) {
    fun createStockResult(hourTime: Int): List<StockResult> {
        val random = Random()
        val results = ArrayList<StockResult>()
        val endHour = stockInfo.startHour + hourTime

        var currentValue = stockInfo.startValue.toDouble()
        var currentHour = stockInfo.startHour
        var currentMinute = stockInfo.startMinute

        while(currentHour < endHour) {
            val updateRate = 1 + (if(random.nextFloat() <= stockInfo.globalIncreaseRate)
                random(stockInfo.globalMinIncreaseRate, stockInfo.globalMaxIncreaseRate)
            else
                -random(stockInfo.globalMinDecreaseRate, stockInfo.globalMaxDecreaseRate)) / 100.0

            val result = StockResult(currentHour % 24, currentMinute, currentValue)
            results.add(result)

            val specialTimings = stockInfo.specialTimings.filter {
                currentHour <= it.hour && it.hour <= currentHour + stockInfo.updateHour &&
                        currentMinute <= it.minute && it.minute <= currentMinute + stockInfo.updateMinute
            }.toList()

            specialTimings.forEach {
                val next = 1 + (if(random.nextFloat() <= it.increaseRate)
                    random(it.minIncreaseRate, it.maxIncreaseRate)
                else
                    -random(it.minDecreaseRate, it.maxDecreaseRate)) / 100.0

//                println("$it $next")

                currentValue *= next
            }

            currentValue *= updateRate
            currentValue = currentValue.coerceIn(stockInfo.minValue.toDouble(), stockInfo.maxValue.toDouble())
            currentHour += stockInfo.updateHour
            currentMinute += stockInfo.updateMinute


            while(currentMinute >= 60) {
                currentMinute -= 60
                currentHour++
            }
        }

        return results
    }
}