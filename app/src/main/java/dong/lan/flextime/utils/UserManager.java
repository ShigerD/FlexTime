package dong.lan.flextime.utils;

import dong.lan.flextime.bean.User;

/**
 * 项目：FlexTime
 * 作者：梁桂栋
 * 日期： 3/12/2016  15:33.
 */
public class UserManager {
    private static boolean isLogin =false;
    private static User user = null;
    private static UserManager manager = null;
    public static UserManager getManager()
    {
        if(manager==null)
            manager = new UserManager();
        return manager;
    }

   public void initUser(User u)
   {
       isLogin = u != null;
       if(!isLogin)
           user = new User("default");
   }
    public User getUser()
    {
        return user;
    }
    public boolean isLogin()
    {
        return isLogin;
    }

    public void setLogin(boolean login)
    {
        isLogin = login;
    }
}
