import java.util.*

fun changepwd(){
    //改密码
    var inputtime: Int = 3
    while (true){
        System.out.println("请输入原始密码：")
        var original: Scanner= Scanner(System.`in`)
        var orignalpwd: Int = original.nextInt()
        if (orignalpwd==Password){
            println("请输入修改后的密码：")
            val terminal:Scanner = Scanner(System.`in`)
            Password = terminal.nextInt()
            println("修改成功")
            break;
        }else{
            println("输入密码错误")
            inputtime--
            if (inputtime==0){
                println("输入密码次数过多，暂时不能修改")
            }
        }
    }

}