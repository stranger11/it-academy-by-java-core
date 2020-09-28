public class Time {
    public  static void  main(String[] args){
        int time = 8000000;
        int sec = time % 60;
        int min = (time - sec) / 60;
        int osthours = min % 60;
        int hours = (min - osthours) / 60;
        int ostdays = hours % 24;
        int days = (hours - ostdays) / 24;
        int ostweeks = days % 7;
        int weeks = (days - ostweeks) / 7;
        System.out.println(weeks+" "+"недель"+" "+ostweeks+" "+"дней"+" "+ostdays+" "+"часов"+" "+osthours+" "+"минут"+" "+sec+" "+"секунд");
    }

}
