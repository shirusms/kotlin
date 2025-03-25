fun main(args: Array<String>) {
    print("Enter your grade:")
    val grade=Integer.valueOf(readlnOrNull())

    if (grade>=80 ){
       println("distinction")
    }
    else if (grade>=60){
        println("credit")
    }
    else if (grade>50){
        println("pass")
    }
    else{
        println("fail")
    }
    addtwonum()
}