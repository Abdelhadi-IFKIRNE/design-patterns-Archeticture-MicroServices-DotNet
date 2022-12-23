package org.example.security;

public class SecurityContext {
    private static String username;
    private static String password;
    private static String[] roles={};
     public static void authenticate(String u,String p,String[] rls){
         if(u.equals("abdelhadi")&&p.equals("1234")){
             username=u;
             password=p;
             roles=rls;
         }else {
             throw new RuntimeException("Unauthorized access...!");
         }
    }

    public static boolean hasRole(String r){
        for (String s:roles) {
            if(s.equals(r))
                return true;
        }
        return false;
    }
}
