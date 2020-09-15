public class ArrayReverse {
  public static void main(String[] args) {
    int[] sampleArray = new int[]{89, 2354, 3546, 23, 10, -923, 823, -12};
    reverseArray(sampleArray);
    for (int i = 0; i < sampleArray.length; i++) {
      System.out.println(sampleArray[i]);
    }
  }

  public static int[] reverseArray(int[] inputArr) {
    int temp;
    int len = inputArr.length;

    for (int i = 0; i < len / 2; i++) {
      temp = inputArr[i];
      inputArr[i] =  inputArr[len - (1 + i)];
      inputArr[len - (1 + i)] = temp;
    }

    return inputArr;
  }
}