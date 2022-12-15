package kr.goldenmine.likelion_hackathon_backend.stock

class StockInfo(
    val startHour: Int, // 시작 시간
    val startMinute: Int, // 시작 분
    val startValue: Int, // 시작 값

    val minValue: Int, // 최솟값
    val maxValue: Int, // 최댓값

    val updateHour: Int, // 업데이트마다 지나는 시간
    val updateMinute: Int, // 업데이트마다 지나는 분

    val globalIncreaseRate: Float, // 주식이 상승할 확률. 0.6이라 적으면 60% 확률로 주식이 증가함.

    val globalMinIncreaseRate: Double, // 주식이 증가하는 최소비율
    val globalMaxIncreaseRate: Double, // 주식이 증가하는 최대비율
    val globalMinDecreaseRate: Double, // 주식이 감소하는 최소비율
    val globalMaxDecreaseRate: Double, // 주식이 감소하는 최대비율

    val specialTimings: List<TimingInfo>, // 특정한 이벤트 지정
) {
    override fun toString(): String {
        return "StockInfo(startHour=$startHour, " +
                "startMinute=$startMinute, " +
                "startValue=$startValue, " +
                "minValue=$minValue, " +
                "maxValue=$maxValue, " +
                "updateHour=$updateHour, " +
                "updateMinute=$updateMinute, " +
                "increaseRate=$globalIncreaseRate, " +
                "globalMinIncreaseRate=$globalMinIncreaseRate, " +
                "globalMaxIncreaseRate=$globalMaxIncreaseRate, " +
                "globalMinDecreaseRate=$globalMinDecreaseRate, " +
                "globalMaxDecreaseRate=$globalMaxDecreaseRate, " +
                "specialTimings=$specialTimings)"
    }
}