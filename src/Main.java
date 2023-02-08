import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите номер задания:\n" +
                "1) Определение високосного года\n" +
                "2) Изменение слова копейка в зависимости от числа (не знаю зачем вам это) :D \n" +
                "3) Определения дня недели при условии, что 1 января - понедельник\n" +
                "4) Определение знака зодика");
        int num = input.nextInt();
        switch (num){
            case 1 -> zadan1();
            case 2 -> zadan2();
            case 3 -> zadan3();
            case 4 -> zadan4();
            default -> System.out.println("Неверно выбран номер задания!!!");
        }
    }
    public static void zadan1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите год (если год до н.э., вводите его со знаком минус): ");
        int year = input.nextInt();
        //----------------------
        String vivod = "" + Math.abs(year) + " год";
        if (year < 0){
            vivod = vivod + " до нашей эры - ";
        } else { vivod = vivod + " нашей эры - "; }
        if (year%4==0){
            vivod = vivod + "високосный";

        } else { vivod = vivod + "не високосный"; }
        System.out.println(vivod);
    }
    public static void zadan2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите колличество копеек: ");
        int kop = input.nextInt();
        if (kop < 0){
            System.out.println("В долг я вам денег не дам-_-");
        } else if (kop==0) {
            System.out.println("Ой... а у вас нет деняг:) Но работу я не смогу вам порекомендовать:( но вы всегда можете найти подработку на zz.ru!! (это реклама, но не оплаченная))");
        } else if (kop%10==1 & kop%100!=11){
            System.out.print("У вас " + kop + " копейка");
        } else if (kop%10==0 | kop%100/10==1 | kop%10>4) {
            System.out.println("У вас " + kop + " копеек");
        } else {
            System.out.print("У вас " + kop + " копейки");
        }
    }
    public static void zadan3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите какой день по счёту в году: ");
        String[] names = new String[]{"понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
        int day = input.nextInt();
        if (day > 365){
            System.out.println("По-моему день немного выходит за рамки года... Но предположим что это уже следующие года;)");
        }
        if (day < 1){
            System.out.println("По-моему вы как-то слишком мало взяли... нет?");
        } else {
            System.out.println(day + " день от понедельника 1 января - это " + names[day%7-1]);
        }
    }
    public static void zadan4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = input.nextInt();
        System.out.print("Введите число месяца: ");
        int day = input.nextInt();
        /*switch (month){
            case 1 -> {
                if (day>0 & day<21){
                    System.out.print("По гороскопу, ваш знак зодиака - козерог");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - водолей");
                }
            }
            case 2 -> {
                if (day>0 & day<19){
                    System.out.print("По гороскопу, ваш знак зодиака - водолей");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - рыбы");
                }
            }
            case 3 -> {
                if (day>0 & day<21){
                    System.out.print("По гороскопу, ваш знак зодиака - рыбы");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - овен");
                }
            }
            case 4 -> {
                if (day>0 & day<21){
                    System.out.print("По гороскопу, ваш знак зодиака - овен");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - телец");
                }
            }
            case 5 -> {
                if (day>0 & day<21){
                    System.out.print("По гороскопу, ваш знак зодиака - телец");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - близнецы");
                }
            }
            case 6 -> {
                if (day>0 & day<22){
                    System.out.print("По гороскопу, ваш знак зодиака - близнецы");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - рак");
                }
            }
            case 7 -> {
                if (day>0 & day<23){
                    System.out.print("По гороскопу, ваш знак зодиака - рак");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - лев");
                }
            }
            case 8 -> {
                if (day>0 & day<24){
                    System.out.print("По гороскопу, ваш знак зодиака - лев");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - дева");
                }
            }
            case 9 -> {
                if (day>0 & day<24){
                    System.out.print("По гороскопу, ваш знак зодиака - дева");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - весы");
                }
            }
            case 10 -> {
                if (day>0 & day<24){
                    System.out.print("По гороскопу, ваш знак зодиака - весы");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - скорпион");
                }
            }
            case 11 -> {
                if (day>0 & day<23){
                    System.out.print("По гороскопу, ваш знак зодиака - скорпион");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - стрелец");
                }
            }
            case 12 -> {
                if (day>0 & day<22){
                    System.out.print("По гороскопу, ваш знак зодиака - стрелец");
                } else {
                    System.out.print("По гороскопу, ваш знак зодиака - козерог");
                }
            }
        }*/
        int[] daysInMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int[] daysInZnakah = new int[]{29,30,29,31,31,31,31,30,33,30,30,30};
        String[] namesZnakov = new String[]{"козерог","водолей","рыбы","овен","телец","близнецы","рак","лев","дева","весы","скорпион","стрелец"};
        int daysBefore = 0;
        for (int i = 1; i<month;i++){
            daysBefore += daysInMonth[i-1];
        }
        daysBefore = daysBefore + day + 9;
        int numMonth = 0;
        for (int i=0;daysBefore>daysInZnakah[i];i++){
            daysBefore -= daysInZnakah[i];
            numMonth = i + 1;
        }
        System.out.println(numMonth + "   " + daysBefore);
        System.out.println("По гороскопу, ваш знак зодиака - " + namesZnakov[numMonth]);//а ведь сначала код был в 6 раз больше!!!

    }
}