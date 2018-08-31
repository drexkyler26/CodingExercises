package dev.paulpalac.exercises;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println(getDurationString(11111113945L));
        System.out.println(getDurationString(65,45));
    }

    private static String getDurationString(long minutes, long seconds) {
        if( (minutes < 0) || (seconds < 0) || (seconds > 59) ){
            return "Invalid Value";
    }

        long hours = minutes / 60;
        long remainMinutes = minutes % 60;
        return hours +"h " +remainMinutes +"m " +seconds +"s";
    }
    private static String getDurationString(long seconds) {
        if(seconds < 0){
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        long remainSeconds = seconds % 60;
        return getDurationString(minutes, remainSeconds);
    }
}
