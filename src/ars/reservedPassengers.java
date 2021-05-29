package ars;

public class reservedPassengers {
public int respassid; 
public String passname;
public String ailine;
public String journeyDate;
public String deptime;
public static String flightno;
public String from;
public String to;
public String Sclass;


    public reservedPassengers(String ailine, String journeyDate, String deptime,String from, String to, String Sclass) {
        this.respassid = respassid;
        this.ailine = ailine;
        this.journeyDate = journeyDate;
        this.deptime = deptime;
        this.from = from;
        this.to = to;
        this.Sclass = Sclass;
    }

    public int getRespassid() {
        return respassid;
    }

    public void setRespassid(int respassid) {
        this.respassid = respassid;
    }
    

}
