import java.text.SimpleDateFormat;
import java.util.Date;

public class timeGMT {

    public static void main(String[] args) {
        long timeStamp = System.currentTimeMillis(); //获取当前时间戳

        long totalSeconds = timeStamp / 1000; //从上面方法获得的是毫秒，转化为秒

        long currentSeconds = totalSeconds % 60; //取余，得到当前秒数

        long totalMinutes = currentSeconds / 60; //得到完整的分钟

        long currentMinutes = totalMinutes % 60; //取余，得到当前分钟

        long totalHours = totalMinutes / 60; //得到完整小时

        long currentHour = totalHours % 24; //取余，得到当前小时

        long beijingTime = currentHour + 8; //北京时间=GMT时间+8小时

        if (beijingTime >= 24) {
            beijingTime %= 24;
        }

        System.out.println(timeStamp);
        System.out.println(
                "Current time is " +
                        beijingTime +
                        ":" +
                        currentMinutes +
                        ":" +
                        currentSeconds
        );

    }
}
