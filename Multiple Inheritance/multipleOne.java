//interface-->interface=>extends
interface DaoI{
    public abstract void login();
    public abstract void logout();
}
interface USI extends DaoI{
    public abstract void forgetpassword();
}
class USImpl implements USI{                             //Impl->implementation
    public void login(){
        System.out.println("Login Successfull");
    }
    public void logout(){
        System.out.println("Logout Successful");
    }
    public  void forgetpassword(){
        System.out.println("Password Updated Successfully");
    }
}
public class multipleOne{
    public static void main(String[] args) {
        USImpl obj=new USImpl();
        obj.login();
        obj.logout();
        obj.forgetpassword();
    }
}