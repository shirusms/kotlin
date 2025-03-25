fun myfunction(){
    println("This is my first function")
}
fun main(args: Array<String>) {
    myfunction()
    addtwonum()

}
fun addtwonum(){
    print("Enter the first number")
    val num1=Integer.valueOf(readlnOrNull())
    print("Enter the second number")
    val num2=Integer.valueOf(readlnOrNull())
    println("The sum of $num1 and $num2 is ${num1+num2}")


}
fun studreg(fname:String,lname:String,age:Int){
    println("Student firstname:$fname,Lastname:$lname,Age:$age")
}
