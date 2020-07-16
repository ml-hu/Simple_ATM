import java.util.*

fun save(){
    //存钱操作
    println("请输入要存储的金额：")
    var Input: Scanner = Scanner(System.`in`)
    var Inputmoney: Int = Input.nextInt()
    Balance += Inputmoney
    System.out.println("此时现金$Balance")

}