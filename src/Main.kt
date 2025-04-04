
fun main() {


}
fun isIPv4AddressValid(ip: String): Boolean {
    if (ip.trim() != ip) {
        return false
    }

    val segments = ip.split(".")

    if (segments.size != 4) {
        return false
    }


    for (segment in segments) {

        if (segment.isEmpty()) {
            return false
        }

        if (segment.length > 1 && segment[0] == '0') {
            return false
        }

        try {
            val value = segment.toInt()

            if (value < 0 || value > 255) {
                return false
            }
        } catch (e: NumberFormatException) {
            return false
        }
    }

    return true
}