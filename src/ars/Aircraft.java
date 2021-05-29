/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ars;

/**
 *
 * @author HP
 */
public class Aircraft {
    int regNo;
    int fuelch;
    public Aircraft()
    {
        regNo=0;
        fuelch=0;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setFuelch(int fuelch) {
        this.fuelch = fuelch;
    }

    public int getRegNo() {
        return regNo;
    }

    public int getFuelch() {
        return fuelch;
    }
    
}
