public class sample2darray {
    
    public static void main(String[] args) {
        
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };

      
        System.out.println("The 2D array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
}

    

