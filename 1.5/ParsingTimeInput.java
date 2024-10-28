public class ParsingTimeInput {
    public static void main(String[] args) {
        System.out.println(parseTime("10:08 AM"));//true cases
        System.out.println(parseTime("6:45 pm"));
        System.out.println(parseTime("03:12 AM"));
        System.out.println(parseTime(" 7:23    Pm "));
        System.out.println(parseTime("444AM"));
        System.out.println(parseTime("0534"));
        System.out.println(parseTime("23:59"));
        System.out.println(parseTime("800"));
        System.out.println(parseTime("0035"));
        System.out.println("-----------");
        System.out.println(parseTime("10 08 Am"));//false cases
        System.out.println(parseTime("4:14 P M"));
        System.out.println(parseTime("006:45 pm"));
        System.out.println(parseTime("012:30 am"));
        System.out.println(parseTime("9:5 PM"));
        System.out.println(parseTime("102:3"));
        System.out.println(parseTime("1:47 AMM"));
        System.out.println(parseTime("PM 7:37"));
        System.out.println(parseTime("4:67 AM"));
        System.out.println(parseTime("2553"));
        System.out.println(parseTime("noon"));
    }
    public static int parseTime(String timeStr) {
        timeStr = timeStr.trim().toLowerCase(); 
        boolean isPM = false;
        boolean hasAMPM = false;
    
        String timePart = timeStr;
        if (timeStr.endsWith("am")) {
            timePart = timeStr.substring(0, timeStr.length() - 2);
            hasAMPM = true;
        } else if (timeStr.endsWith("pm")) {
            timePart = timeStr.substring(0, timeStr.length() - 2);
            isPM = true;
            hasAMPM = true;
        }
    
        timePart = timePart.trim();
    
        if (timePart.contains(" ")) {
            return -1;  
        }
    
        int hour, minute;
        try {
            if (timePart.contains(":")) {
                String[] parts = timePart.split(":");
                if (parts.length != 2 || parts[0].length() > 2 || parts[1].length() != 2) return -1;
                hour = Integer.parseInt(parts[0]);
                minute = Integer.parseInt(parts[1]);
            } else if (timePart.length() == 3 || timePart.length() == 4) {
                int time = Integer.parseInt(timePart);
                hour = time / 100;
                minute = time % 100;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    
        if (minute < 0 || minute > 59) return -1;
        if (hasAMPM) {
            if (hour < 1 || hour > 12) return -1;
        } else {
            if (hour < 0 || hour > 23) return -1;
        }
    
        if (isPM && hour != 12) hour += 12;
        if (!isPM && hasAMPM && hour == 12) hour = 0;
    
        return hour * 60 + minute;
    }
    
    
}