package Unit4;
/*
3.用 this 返回实例对象本身
this 可以作为 return 语句的参数返回当前对象的引用.
 */
public class Unit4_8 {
    static class Login{
        String password;
        Login(){
            password = "1111111111";
        }
        Login modifyPassword(){
            password = "2222222222";
            return this;// 等同于 return password；
        }

    }
    static class Example4_8{
        public static void main(String[] args){
            Login login = new Login();
            System.out.println("初识密码"+login.password);
            Login newlogin = login.modifyPassword();
            System.out.println("更改后的密码为"+newlogin.password);
        }
    }
}
