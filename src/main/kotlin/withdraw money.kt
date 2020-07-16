import java.util.*

fun wiithdraw(){
    println("请输入要提取的金额：")
    var withdraw: Scanner = Scanner(System.`in`)
    var withdrawmoney: Int = withdraw.nextInt()
    while (true){
    if(withdrawmoney>Balance){
        println("金额不足，请重新输入")
    }else{
        println("取款成功，收好现金")
        Balance-=withdrawmoney
        break
    }
    }
}