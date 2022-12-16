package kr.goldenmine.likelion_hackathon_backend.stock

class StockResult(
    val hour: Int,
    val minute: Int,
    val value: Double,
) {
    override fun toString(): String {
        return "StockResult(hour=$hour, " +
                "minute=$minute, " +
                "value=$value)"
    }
}