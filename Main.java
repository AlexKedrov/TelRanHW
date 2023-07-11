import com.daysoftheweek.DaysoftheWeek;
import com.temrature.Temp;
import com.weatherconditions.WeatherConditions;

public class Main {
    public static void main(String[] args) {

DaysoftheWeek Days = new DaysoftheWeek();

WeatherConditions Conditions = new WeatherConditions();

Temp Temprature = new Temp();

// Понедельник

        int r1 = (int) (Math.random() * Temprature.HotWeather);

        System.out.println(Days.Monday);
        System.out.println(r1 + "°C");
        if (r1 == 0) {
                System.out.println(Conditions.Cold);
                System.out.println(Conditions.SnowWeather);
                System.out.println(" ");
            }
        else if (r1 > 0 && r1 < Temprature.ColdWeather) {
                System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }
        else if (r1 >= Temprature.ColdWeather && r1 < Temprature.CoolWeather) {
                System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }
        else if (r1 >= Temprature.CoolWeather && r1 < Temprature.GoodWeather) {
                System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }
        else if (r1 >= Temprature.GoodWeather && r1 <= Temprature.HotWeather) {
                System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }




        //Вторник

        int r2 = (int) (Math.random() * Temprature.HotWeather);

        System.out.println(Days.Tuesday);
        System.out.println(r2 + "°C");

        if (r2 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }
        else if (r2 > 0 && r2 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r2 >= Temprature.ColdWeather && r2 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r2 >= Temprature.CoolWeather && r2 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r2 >= Temprature.GoodWeather && r2 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }

        //Среда
        int r3 = (int) (Math.random() * Temprature.HotWeather);

        System.out.println(Days.Wednesday);
        System.out.println(r3 + "°C");
        if (r3 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }
        else if (r3 > 0 && r3 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r3 >= Temprature.ColdWeather && r3 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r3 >= Temprature.CoolWeather && r3 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r3 >= Temprature.GoodWeather && r3 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }

        //Четверг
        int r4 = (int) (Math.random() * Temprature.HotWeather);

        System.out.println(Days.Thursday);
        System.out.println(r4 + "°C");
        if (r4 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }
        else if (r4 > 0 && r4 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r4 >= Temprature.ColdWeather && r4 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r4 >= Temprature.CoolWeather && r4 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r4 >= Temprature.GoodWeather && r4 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }

        //Пятница
        int r5 = (int) (Math.random() * Temprature.HotWeather);

        System.out.println(Days.Friday);
        System.out.println(r5 + "°C");
        if (r5 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }
        else if (r5 > 0 && r5 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r5 >= Temprature.ColdWeather && r5 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r5 >= Temprature.CoolWeather && r5 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r5 >= Temprature.GoodWeather && r5 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }

        //Суббота
        int r6 = (int) (Math.random() * Temprature.HotWeather);
        System.out.println(Days.Saturday);
        System.out.println(r6 + "°C");
        if (r6 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }
        else if (r6 > 0 && r6 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r6 >= Temprature.ColdWeather && r6 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r6 >= Temprature.CoolWeather && r6 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r6 >= Temprature.GoodWeather && r6 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }

        //Воскресенье
        int r7 = (int) (Math.random() * Temprature.HotWeather);
        System.out.println(Days.Sunday);
        System.out.println(r7 + "°C");
        if (r7 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }
        else if (r7 > 0 && r7 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r7 >= Temprature.ColdWeather && r7 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r7 >= Temprature.CoolWeather && r7 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
        else if (r7 >= Temprature.GoodWeather && r7 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
        }
    }
    }
