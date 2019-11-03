import java.util.Scanner;

//public class Main {

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++)
//        {
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-15s%03d%n", s1, x);
//
//        }
//        System.out.println("================================");
//
//    }



//    private static final Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        int i;
//        for (i=1;i<=10;i++){
//            System.out.printf("%d x %d = %d%n", N,i,N*i);
//        }
//
//       scanner.close();
//    }



//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int s = a + b;
//            System.out.print(s);
//            for (double j=1; j<n;j++){
//                s+= ((Math.pow(2, j))*b);
//                System.out.print(" " + s);
//            }
//
//        }
//        in.close();
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n = sc.nextLine();
//        int i = 1;
//        System.out.println(i + " " + n);
//        while (sc.hasNextLine() == true){
//            i = i + 1;
//            n = sc.nextLine();
//            System.out.println(i + " " + n);
//        }
//    }


//public class Solution {

//    static boolean flag = true;
//    static int B, H;
//    static int area;

//    static {
//        Scanner sc = new Scanner(System.in);
//        B = sc.nextInt();
//        sc.nextLine();
//        H=sc.nextInt();
//        if (B>0 && H>0){
//            flag = true;
//        } else {
//            flag = false;
//            System.out.println("bbbbbbb");
//        }
//    }

//        public static void main(String[] args){
//            if(flag){
//                int area=B*H;
//                System.out.print(area);
//            }
//        }
//    }


//class Result {
//    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

//    public static String findDay(int day, int month, int year) {

//        String y = Integer.toString(year);
//        String m = Integer.toString(month);
//        String d = Integer.toString(day);

//        Calendar c = Calendar.getInstance();
//        c.set(year, month, day);

//        int p = c.get(Calendar.DAY_OF_WEEK);
//        String s = days.get(p-1);
//        return s;
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int month = in.nextInt();
//        int day = in.nextInt();
//        int year = in.nextInt();

//        System.out.println(findDay(day, month, year));

//    }
//}

//   public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//            int month = Integer.parseInt(firstMultipleInput[0]);
//            int day = Integer.parseInt(firstMultipleInput[1]);
//            int year = Integer.parseInt(firstMultipleInput[2]);

//            String res = Result.findDay(month, day, year);

//            bufferedWriter.write(res);
//            bufferedWriter.newLine();

//            bufferedReader.close();
//            bufferedWriter.close();
//        }


//    }


//public class Solution {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();

//        Locale indiaLocale = new Locale("en", "IN");
//        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
//        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
//    }
//}
//public class Solution {
//    public static String getSmallestAndLargest(String s, int k) {
//        String largest = "";
//        int i = 0;
//        String smallest = s.substring(0,k);
//        for (i=0; i <= (s.length()-k); i++) {
//            if ((s.substring(i,i+k)).compareTo(largest) > 0){
//                largest = s.substring(i, i+k);
//            } else {
//                if ((s.substring(i,i+k)).compareTo(smallest) < 0){
//                    smallest = s.substring(i,i+k);
//                }
//        }
//        }
//        return smallest+"\n"+largest;
//        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


//public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();

//        System.out.println(getSmallestAndLargest(s, k));
//        }
//        }


public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(palindrome(A));

    }

    public static String palindrome(String mot){
        String res = "";
        for (int i = 0; i < mot.length(); i++){
            char c = mot.charAt(mot.length() - 1 - i);
            if ((mot.charAt(i)) != c){
                //if ((mot.substring(i,i+1)).compareTo((mot.substring((mot.length()-1-i),(mot.length()-i))))!=0){
                res = "No";
                return res;
            }
            res = "Yes";
        }
        return res;
    }
}

