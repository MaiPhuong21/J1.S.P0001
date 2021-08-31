
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num=randomArray();
        System.out.print("Unsorted array:  ");
        display(num);
        BubbleSort(num);
        System.out.print("Sorted array:   ");
        display(num);
    }

    public static int[] randomArray() {
        System.out.print("Enter number of array: ");
        int size = sc.nextInt();
        Random random = new Random();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10);
        }
        return num;
    }

    public static void BubbleSort(int[] num) {
        for (int i = 0;i < num.length;i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
    public static void display(int[] num){
        String result = "";
        result += num[0];
        for (int i = 1;i < num.length;i++) {
            result += ", " + num[i];
        }
        System.out.println(result);
    }
    
}
