import java.io.File

File("input.txt").useLines {
    val result = it.map { line ->
        val digits = line.filter { character ->
            character.isDigit()
        }

        "%s%s".format(digits.first(), digits.last())
    }

    var sum = 0

    result.forEach {value ->
        sum += value.toInt()
    }

    print(sum)
}