fun main(args: Array<String>) {
    println("Enter number:")
    val num=Integer.valueOf(readlnOrNull())
    if (num%2==0){
        println("$num is even number")
    }
    else{
        println("$num is an odd number")
    }
    println("Enter you age:")
    val age=Integer.valueOf(readlnOrNull())
    if (age>=18){
        println("THe person is elligible to vote")
    }
    else{
        println("The person is underage")
    }






}