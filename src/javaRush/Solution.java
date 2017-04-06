package javaRush;


/*Working with conditional operator (if, else if). Type in console number and view in console day of the week*/


import java.io.*;
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
            String a = bufferedReader.readLine();
            String b = bufferedReader.readLine();
            String c = bufferedReader.readLine();
            String d = bufferedReader.readLine();

            int x = Integer.parseInt(a);
            int x1 = Integer.parseInt(b);
            int x2 = Integer.parseInt(c);
            int x3 = Integer.parseInt(d);

            if(x > x1 || x > x2 || x > x3 ){
                System.out.println(x);
            }else if(x1 > x || x1 > x2 || x1 > x3){
                System.out.println(x1);
            }else if(x2 > x || x2 > x1 || x2 > x3){
                System.out.println(x2);
            }else if(x3 > x || x3 > x1 || x3 > x2){
                System.out.println(x3);
            }else if(x == x1 && x == x2 && x == x3){
                System.out.println(x);
            }
        }
    }




















       /* public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String a = bufferedReader.readLine();
            String b = bufferedReader.readLine();

            int x = Integer.parseInt(a);
            int x1 = Integer.parseInt(b);

            if(x < x1){
                System.out.println(x);
            }else if(x > x1){
                System.out.println(x1);
            }else if(x == x1){
                System.out.println(x);
            }
        }
    }
*/


       /* public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String a = bufferedReader.readLine();
            String b = bufferedReader.readLine();
            String c = bufferedReader.readLine();

            int x = Integer.parseInt(a);
            int x2 = Integer.parseInt(b);
            int x3 = Integer.parseInt(c);

            if (x == x2 && x2 == x3) System.out.println(x + " " + x2 + " " + x3);
            if ((x == x2) && (x != x3)) System.out.println(x + " " + x2);
            if ((x2 == x3) && (x2 != x)) System.out.println(x2 + " " + x3);
            if ((x == x3) && (x != x2)) System.out.println(x + " " + x3);
            }
        }
*/


      /*  public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
            String a = bufferedReader.readLine();

            double time = Double.parseDouble(a);
            double x = time%5;
            if(x >= 0 && x < 3.0){
                System.out.println("зелёный");
            }else if(x >= 3.0 && x < 4.0){
                System.out.println("желтый");
            }else if(x >= 4.0 && x < 5.0){
                System.out.println("красный");
            }
        }
    }

*/

        /*
        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String A = reader.readLine();
            String B = reader.readLine();
            String C = reader.readLine();

            int x = Integer.parseInt(A);
            int x1 = Integer.parseInt(B);
            int x2 = Integer.parseInt(C);

            if ((x + x1) > x2 && (x + x2) > x1 && (x1 + x2) > x) {
                System.out.println("Треугольник существует.");
            } else {
                System.out.println("Треугольник не существует.");
            }
        }
    }
*/

       /* public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String number = reader.readLine();
            int num = Integer.parseInt(number);
            if(num == 1){
                System.out.println("Monday");
            }else if (num == 2){
                System.out.println("Tuesday");
            }else if(num == 3){
                System.out.println("Wednesday");
            }else if(num == 4){
                System.out.println("Thursday");
            }else if(num == 5){
                System.out.println("Friday");
            }else if(num == 6){
                System.out.println("Saturday");
            }else if(num == 7){
                System.out.println("Sunday");
            }
        }
    }

*/

    // Count number of the day in year.

       /* public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String A = reader.readLine();
            int x = Integer.parseInt(A);
            if (x % 100==0 && x % 400!=0) { x = 365;
            } else if (x % 100 == 0 && x % 400 == 0 || x%4==0) x = 366;
            else x = 365; System.out.println("количество дней в году: " + x);
        }*/