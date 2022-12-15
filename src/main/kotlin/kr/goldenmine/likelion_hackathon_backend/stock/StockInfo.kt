package kr.goldenmine.likelion_hackathon_backend.stock

class StockInfo(
    val startHour: Int,
    val startMinute: Int,
    val startValue: Int,

    val minValue: Int,
    val maxValue: Int,

    val updateHour: Int,
    val updateMinute: Int,

    val increaseRate: Float,

    val globalMinIncreaseRate: Double,
    val globalMaxIncreaseRate: Double,
    val globalMinDecreaseRate: Double,
    val globalMaxDecreaseRate: Double,

    val specialTimings: List<TimingInfo>,
) {
    override fun toString(): String {
        return "StockInfo(startHour=$startHour, " +
                "startMinute=$startMinute, " +
                "startValue=$startValue, " +
                "minValue=$minValue, " +
                "maxValue=$maxValue, " +
                "updateHour=$updateHour, " +
                "updateMinute=$updateMinute, " +
                "increaseRate=$increaseRate, " +
                "globalMinIncreaseRate=$globalMinIncreaseRate, " +
                "globalMaxIncreaseRate=$globalMaxIncreaseRate, " +
                "globalMinDecreaseRate=$globalMinDecreaseRate, " +
                "globalMaxDecreaseRate=$globalMaxDecreaseRate, " +
                "specialTimings=$specialTimings)"
    }
}