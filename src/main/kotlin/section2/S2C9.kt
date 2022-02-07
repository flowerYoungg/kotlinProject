package section2

//enum class
//열거형 클래스


fun main() {
    Direction.values().forEach {
        println(it)
    }

    val direction = Direction.EAST
    when(direction){
        Direction.NORTH -> {
            println("N")
        }
        Direction.SOUTH -> {
            println("S")
        }
        Direction.WEST -> {
            println("W")
        }
        Direction.EAST -> {
            println("E")
        }
    }

    val color = Color.RED
    when(color){
        Color.RED -> {
            println(Color.RED.colorName)
        }
        Color.GREEN -> {
            println(Color.GREEN.colorName)
        }
        Color.BLUE -> {
            println(Color.BLUE.colorName)
        }
    }

    println(Device.DEVICEON.status)
    Device.DEVICEON.status = "OFF"
    println(Device.DEVICEON.status)
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val colorName : String) {
RED("빨강"),
    GREEN("초록"),
    BLUE("파랑")
}

enum class Device(var status : String) {
    DEVICEON("ON"),
    NETWORK("OFF"),
    LOCATION("SEOUL")
}