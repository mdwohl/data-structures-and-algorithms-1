

public class ArrayReverse {
  public static void main(String[] args) {
    System.out.println("inside main");
    reverseArray(new int[]{89, 2354, 3546, 23, 10, -923, 823, -12});
  }

  public static int[] reverseArray(int[] inputArr) {
    System.out.println("inside reverseArray method");
    int temp;
    int len = inputArr.length;

    for (int i = 0; i < len / 2; i++) {
      temp = inputArr[i];
      inputArr[i] =  inputArr[len - (1 + i)];
      inputArr[len - (1 + i)] = temp;
    }

    for (int i = 0; i < len; i++) {
      System.out.println(inputArr[i]);
    }

    return inputArr;
  }
}