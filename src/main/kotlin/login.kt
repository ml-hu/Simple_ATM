import java.util.*

var Password: Int = 123456
var totaltime: Int = 3
var Balance: Int = 2000//自己账户上面的钱
class login{

    fun login():Boolean{
        while (true){
            System.out.println("请输入密码：")
            val In : Scanner = Scanner(System.`in`)
            val enterpass: Int = In.nextInt()
        if (enterpass==Password){
            return true
            break

        }else{
            totaltime--
            if (totaltime == 0){
                System.out.println("由于输入密码多次出错，该账号已冻结，想解冻请到银行柜台办理")
                return false
                break
            }else{
                System.out.println("输入密码错误，还有$totaltime 次机会")
            }


        }

        }

    }

}