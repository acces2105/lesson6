import java.awt.desktop.SystemSleepListener;
import java.util.Arrays;
import java.util.Scanner;

public class ProgramLesson6{
    public static void main(String[] args) {
        System.out.println("Привет мир! Введи целое число как длину массива");
        int arrayLegth = getArrayLength();

        int[] array = fillArray(arrayLegth);
        System.out.println(Arrays.toString(array));

        int max = getMax(array);
        System.out.println("Maximum в массиве :" + max);

        int min = getMin(array);
        System.out.println("Minimum в массиве :" + min);

        double avg = getAvg(array);
        System.out.println("Среднее " + avg);

    }

    private static double getAvg(int[] array) {
        double avg = 0;
        for (int digit: array) {
            avg += digit;
        }
        avg /= array.length;
        return avg;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int digit: array) {
            if (digit > max) {
                max = digit; 
            }

        }
        return max;
    }

    private static int getMin (int[] array) {
        int min = array[array.length - 1];
        if (array.length > 1) {
            for (int i = array.length - 2; i >= 0; i--) {
                int digit = array[i];
                if (digit < min) {
                    min = digit;
                }

            }

        }
        return min;
    }
    private static int[] fillArray(int arrayLegth) {
        int[] digits = new int[arrayLegth];
        for (int i = 0; i < arrayLegth; i++) {
            digits[i] = Math.round((float) Math.random() * 1000);// [0,1000)
        }
        return digits;
    }

    private static int getArrayLength() {
        Scanner scanner = new Scanner (System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Ожидается ввод целого числа");
            scanner.next();
        }
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Неверно указан 0 или отрицательное значение"+"повторите ввод");
            return getArrayLength();
        }
        return scanner.nextInt();
    }


}


    //public static void main(String[] args) {
      //  System.out.println(
        //        "Вычисление max, min, avg в массивах: \n" +
          //              "Условие: Заполните массив (длина запрашивается у пользователя через консоль) случайными\n" +
            //            "числами, используя метод Math.random(), который возвращает значение в промежутке [0, 1].\n" +
              //          "Реализуйте 3 метода, рассчитывающих минимальное, максимальное и среднее значения среди\n" +
                //        "заполненных значений массива.\n" +
                  //      "Вычисление ряда Фибоначчи, используя массив как промежуточный кэш:\n" +
                    //    "Условие: Если запрашивается значение, которое ранее было вычислено, то оно берется из\n" +
  //                      "массива (без вычисления). В противном случае – значение рассчитывается и кладётся в массив.\n" +
    //                    "________________________________________________________________________________________________");
      // Scanner scanner = new Scanner(System.in);
      // System.out.println("Приветствую Вас. Введите ваше имя !");
      // String userName = scanner.nextLine();
      // while (!scanner.hasNextLine()) {
      //     System.out.println("Введите текст");
      //     scanner.next();
      // }
      // System.out.println("Добро пожаловать, " + userName + ". Веедите целое число как длину массива: ");
      // int value = scanner.nextInt();
      // System.out.println("Подтверждаем, что Вы ввели целое число " + value);

      // int[] numbers = new int[value];
      // int[] numbers1 = new int[]{10, 1, 5 ,5};
      // String[] string = {"Привет", "Мир"};

      // System.out.println(Arrays.toString(numbers1));
      // System.out.println(Arrays.toString(string));


      // System.out.println("Вы создали массив длинной " + value + "чисел");
       // printArray(numbers);
       //System.out.println(Arrays.toString(numbers));
       //System.out.println(Integer.valueOf(numbers));

       // System.out.println("-----------------------------------");

      // fillArray(numbers);

      /// printArray(numbers);
       //printArray(numbers));
      // System.out.println(String.valueOf(numbers));
   // }

    //public static void printArray(int [] numbers) {
      //  for (int i = 0; i < numbers.length; i++) {
        //    System.out.println(numbers[i]);
       // }
   // }

  // public static void fillArray(int[] numbers){
  //  numbers[0] = '0';
   // numbers[1] = '0';
   // numbers[2] = '0';
   /// numbers[3] = '0';
  //  numbers[4] = '0';
//    numbers[5] = '0';
  //  numbers[6] = '0';
    //numbers[7] = '0';
//    numbers[8] = '0';
  //  numbers[9] = '0';
   // }

   // public static String[] weekDays(){
        //Math.random()//[0,1)
     //   Random random = new Random();
    //    if (random.nextInt())
    //    return new String[]{"Среда","Четверг"};
    //}


