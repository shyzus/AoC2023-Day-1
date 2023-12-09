import java.io.File

File("input.txt").useLines {
    val result = it.map { line ->

        val res = line.replace("one", "o1e")
            .replace("two", "t2o")
            .replace("three", "t3e")
            .replace("four", "f4r")
            .replace("five", "f5e")
            .replace("six", "s6x")
            .replace("seven", "s7n")
            .replace("eight", "e8t")
            .replace("nine", "n9e")

        val first = res.first { char -> char.isDigit() }
        val last = res.last{ char -> char.isDigit() }

        "%s%s".format(first, last)
    }

    var sum = 0

    result.forEach {value ->
        sum += value.toInt()
    }

    print(sum)
}