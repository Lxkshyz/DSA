package DataStructures.Strings;

public class HourFormat {
    public static void main(String[] args){
        String format = "04:00:00PM";
        System.out.println(calc(format));
    }
    public static String calc(String example){
        String period = example.substring(8,10);
        String left = example.substring(2,8);
        int hour = Integer.parseInt(example.substring(0,2));


        if (period.equals("AM")){
            return (hour == 12 ? "00" : example.substring(0,8)) + left;
        }
        else{
            return (hour == 12 ? "12" : (hour+12)) + left;
        }

    }
}
