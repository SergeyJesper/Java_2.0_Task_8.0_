import java.util.Scanner;

public class ArrayClass {


    public void crArray (int x){
        String [] array = new String[x];
        Scanner sc = new Scanner(System.in);
        for (int a = 0; a < array.length; a++){
            System.out.println("Введите слово");
            array[a] = sc.nextLine();
        }
        int maxLengthString = 0;
        for(int i=0;i<array.length;i++){
            if(array[i].length()>maxLengthString){
                maxLengthString = array[i].length();
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i].length()==maxLengthString){
                System.out.println("Самое длинное слово массива: " + array[i]);
            }
        }
    }
}