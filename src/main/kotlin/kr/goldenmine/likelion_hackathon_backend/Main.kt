package kr.goldenmine.likelion_hackathon_backend

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.opencsv.CSVWriter
import kr.goldenmine.likelion_hackathon_backend.stock.Stock
import kr.goldenmine.likelion_hackathon_backend.stock.StockInfo
import java.io.File

fun main(args: Array<String>) {
    val gson = Gson()

    val file = File("stockinfo.json")
    if(!file.exists()) file.createNewFile()

    file.bufferedReader().use { reader ->
        val type = object : TypeToken<StockInfo>() {}.type
        val readStockInfo = gson.fromJson<StockInfo>(reader, type)

        val stock = Stock(readStockInfo)
        val results = stock.createStockResult(24)

        val resultJson = File("result.json")
        val resultCsv = File("result.csv")

        if(!resultJson.exists()) resultJson.createNewFile()
        if(!resultCsv.exists()) resultCsv.createNewFile()

        resultJson.bufferedWriter().use { writer ->
            gson.toJson(results, writer)
        }

        resultCsv.bufferedWriter().use { writer ->
            val csvWriter = CSVWriter(writer)

            csvWriter.writeNext(arrayOf("시", "분", "값"))

            for(result in results) {
                val array = arrayOf(result.hour.toString(), result.minute.toString(), result.value.toString())

                csvWriter.writeNext(array)
            }
        }
    }
}