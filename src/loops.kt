fun main(args: Array<String>) {
    var num=10

    while (num>=5){
        println(num)
        num--
    }
    val students= arrayOf("James","Daniel","Mark","Ann","Abigael")
    students.sort()
    for (i in students){
        println(i)
    }
    val nambari= arrayOf(23,15,45,1,8,20,-2,3,2,0,41,-45)
    nambari.sort()
    for (n in nambari){
        println(n)
    }
}