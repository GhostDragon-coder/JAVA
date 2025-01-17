public class Main2 {

    public static void main(String[] args) {

        int [] myArray = {1, 2, 3, 4, 5};
        myArray[0] = myArray[0] + myArray[myArray.length - 1];
        myArray[myArray.length - 1] = myArray[0] - myArray[myArray.length - 1];
        myArray[0] = myArray[0] - myArray[myArray.length - 1];

        System.out.println("Сумма первого и среднего элемента: " + (myArray[0] + myArray[myArray.length / 2]));

    }
}