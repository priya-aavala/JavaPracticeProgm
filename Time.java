public class Time {
    int hours,mins,sec;
    public Time(int hours,int mins,int sec){
        this.hours=hours;
        this.mins=mins;
        this.sec=sec;

    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hours;
        result = prime * result + mins;
        result = prime * result + sec;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        if (hours != other.hours)
            return false;
        if (mins != other.mins)
            return false;
        if (sec != other.sec)
            return false;
        return true;
    }

    public static void main(String args[]){
        Time t1=new Time(12,45,5);
        Time t2=new Time(12,45,5);
        System.out.println(t1.toString());
        System.out.println(t2.equals(t1));
    }
    
}
