package kr.goldenmine.likelion_hackathon_backend.stock

class TimingInfo(
    val hour: Int, // 이벤트 발생 시간
    val minute: Int, // 이벤트 발생 분

    val increaseRate: Float, // 주식이 상승할 확률. 0.6이라 적으면 60% 확률로 주식이 증가함.

    val minIncreaseRate: Double, // 주식이 증가하는 최소비율
    val maxIncreaseRate: Double, // 주식이 증가하는 최대비율
    val minDecreaseRate: Double, // 주식이 감소하는 최소비율
    val maxDecreaseRate: Double, // 주식이 감소하는 최대비율
) {
    override fun toString(): String {
        return "TimingInfo(hour=$hour, " +
                "minute=$minute, " +
                "increaseRate=$increaseRate, " +
                "minIncreaseRate=$minIncreaseRate, " +
                "maxIncreaseRate=$maxIncreaseRate, " +
                "minDecreaseRate=$minDecreaseRate, " +
                "maxDecreaseRate=$maxDecreaseRate)"
    }
}