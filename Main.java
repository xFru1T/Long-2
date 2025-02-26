import java.util.Scanner;
class Long {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print num for check a Palindrome: ");
        long num = scanner.nextInt();
        if (pNum(num)) {
            System.out.println("Palindrome");
            }
        else {
            System.out.println("no Palindrome");
            }
        }
    public static boolean pNum(long num) {
        long oNum = num;
        long rNum = 0;
        while (num != 0) {
            long dNum = num % 10;
            rNum = rNum * 10 + dNum;
            num /= 10;
            }
        return oNum == rNum;
        }
    }
