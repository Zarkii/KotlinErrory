class Main {
}
fun main(args : Array<String>){
    try{
        println(5/0)
    }
    catch (e: ArithmeticException){
        println("nie dzieli sie przez zero")
    }
}