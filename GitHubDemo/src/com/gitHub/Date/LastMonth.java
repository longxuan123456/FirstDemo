package com.gitHub.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java计算当前时间上个月
 * @author gl
 * */
public class LastMonth {

    public static void main(String[] args) {

      //计算上个月
        String lastMonth = getLastMonth();

        System.out.println(lastMonth);
    }

    /**
     * 具体计算相应的方法
     *
     * */
    private static String getLastMonth() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)-1);
        date = calendar.getTime();
        String lastMonth = dateFormat.format(date);
        return lastMonth;
    }

}
