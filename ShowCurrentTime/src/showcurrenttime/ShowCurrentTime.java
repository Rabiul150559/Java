
package showcurrenttime;


public class ShowCurrentTime {

    
    public static void main(String[] args) {
//        long currentTime=System.currentTimeMillis();
//        System.out.println("currenTime");
//        
//        long seconds=currentTime/1000;
//        System.out.println(seconds);
 long totalMinutes= totalSconds/60;
 long currentTime = totalMinutes % 60;
 long totalHours = totalMinutes/ 60;
 long currentHours= totalHours % 24;
        System.out.println("current time is " + currentHours + ":" + currentMinutes + ":" +
                currentScond + " GMT ");
        
      
       
    }
    
}
