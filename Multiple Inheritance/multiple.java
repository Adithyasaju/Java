interface DaoI{
    public abstract void login();
    public abstract void logout();
}
interface USI{
    public abstract void forgetpassword();
}
class DaoImpl implements DaoI,USI{
    public void login(){
        System.out.println("Login Successfull");
    }
    public void logout(){
        System.out.println("Logout Successful");
    }
    public  void forgetpassword(){
        System.out.println("Password Updated Successfully");
    }                        //if public is not given in void login(){} attempting to assign weaker access privileges; was public
}
public class multiple{
    public static void main(String[] args) {
        DaoImpl obj=new DaoImpl();
        obj.login();
        obj.logout();
        obj.forgetpassword();
    }
}


