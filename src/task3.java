public class task3 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные:");
        for (int i = 0; i<Array.length;i++)
        {
            if (Array[i] % 2 ==0)
            {
                System.out.println(Array[i] + " ");
            } }
        System.out.println();
    }
}
