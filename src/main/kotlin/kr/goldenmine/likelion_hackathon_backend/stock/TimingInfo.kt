package kr.goldenmine.likelion_hackathon_backend.stock

class TimingInfo(
    val hour: Int,
    val minute: Int,

    val increaseRate: Float,

    val minIncreaseRate: Double,
    val maxIncreaseRate: Double,
    val minDecreaseRate: Double,
    val maxDecreaseRate: Double,
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