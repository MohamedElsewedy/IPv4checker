fun main(){
    //valid
    test(
        name = " (0-255) and correctly formatted, it should return true",
        result = isIPv4AddressValid("192.168.1.1"),
        correctResult = true
    )

    test(
        name = " MAX and correctly formatted, it should return true",
        result = isIPv4AddressValid("255.255.255.255"),
        correctResult = true
    )

    test(
        name = " MIN and correctly formatted, it should return true",
        result = isIPv4AddressValid("0.0.0.0"),
        correctResult = true
    )
   //invalid
    test(
        name = " when a segment contains a leading zero, it should return false",
        result = isIPv4AddressValid("192.168.01.1"),
        correctResult = false
    )

    test(
        name = "when a segment is out of range (0-255), it should return false",
        result = isIPv4AddressValid("256.100.50.25"),
        correctResult = false
    )

    test(
        name = "when an address has fewer than four segments, it should return false",
        result = isIPv4AddressValid("192.168.1"),
        correctResult = false
    )

    test(
        name = "invalid , when an address has more than four segments, it should return false",
        result = isIPv4AddressValid("192.168.1.1.1"),
        correctResult = false
    )

    test(
        name = " when there are multiple dots between segments, it should return false",
        result = isIPv4AddressValid("192..168.1.1"),
        correctResult = false
    )

    test(
        name = "when a segment contains non-numeric characters, it should return false",
        result = isIPv4AddressValid("192.168.one.1"),
        correctResult = false
    )
    test(
        name = "when the address has spaces after or before the ip , it should return false",
        result = isIPv4AddressValid(" 192.168.1. 1"),
        correctResult = false
    )
    test(
        name = "when the address negative , it should return false",
        result = isIPv4AddressValid(" 192.168.-1.1"),
        correctResult = false
    )
}

fun test(name:String,result: Boolean,correctResult: Boolean){
    if (result == correctResult){
        println("Success - $name")
    } else{
        println("Failed - $name")
    }
}