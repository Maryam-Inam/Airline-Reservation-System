/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ars;

import java.util.ArrayList;

public class user {
    long phone;
   public String city;
    public static String username;
   public static int userId;
   public  String password;
    static int count = 0;
    public String status;
   public ArrayList<Integer> respassid;
   public ArrayList<String> reservedpassnames;
   
   public int tot=0;
   public double tfare=0;
   public user()
   {
       
   }
   public user(int t,double tfare,ArrayList<Integer> resid,ArrayList<String> resn){
       tot=t;
       this.tfare=tfare;
       respassid=resid;
       reservedpassnames = resn;
   }
   
    public void setReservedpassid(ArrayList<Integer> reservedpassid) {
        this.respassid = reservedpassid;
    }

    public ArrayList<Integer> getReservedpassid() {
        return respassid;
    }

    public void setReservedpassnames(ArrayList<String> reservedpassnames) {
        this.reservedpassnames = reservedpassnames;
         System.out.println("size of respassnames in setmethod: "+reservedpassnames.size());
    }
    
   public ArrayList<String> getReservedpassnames(){
       for(int i=0;i<reservedpassnames.size();i++){
         System.out.println("respassnames in user: "+reservedpassnames);
                       }
       System.out.println("size of respassnames: "+reservedpassnames.size());
       return reservedpassnames;
   }
}
