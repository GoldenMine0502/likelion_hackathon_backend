import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kr.goldenmine.likelion_hackathon_backend.stock.StockInfo
import kr.goldenmine.likelion_hackathon_backend.stock.TimingInfo
import org.junit.jupiter.api.Test
import java.io.File

class StockInfoTest {

    @Test
    fun testStockInfo() {
        val gson = Gson()

        val file = File("stockinfo.json")
        if(!file.exists()) file.createNewFile()

        val stockInfo = StockInfo(
            12,
            0,
            100,
            50,
            150,
            0,
            30,
            0.5F,
            0.0,
            3.0,
            0.0,
            3.0,
            listOf(
                TimingInfo(
                    16,
                    0,
                    1.0F,
                    10.0,
                    20.0,
                    0.0,
                    0.0,
                ),
                TimingInfo(
                    20,
                    0,
                    1.0F,
                    10.0,
                    20.0,
                    0.0,
                    0.0,
                )
            )
        )

        file.bufferedWriter().use {
            gson.toJson(stockInfo, it)
        }

        file.bufferedReader().use {
            val type = object : TypeToken<StockInfo>() {}.type
            val readStockInfo = gson.fromJson<StockInfo>(it, type)

            println(readStockInfo)
        }
    }
}