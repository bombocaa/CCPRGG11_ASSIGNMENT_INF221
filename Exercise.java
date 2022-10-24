ublic class Exercise3 {
    public static void main(String[] args) throws Exception {
        char [][] mdArray = {{'1' ,'1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
    

        // PATTERN 1
        for (int rows= 0; rows <mdArray.length; rows++){
            System.out.println("");
            for (int column = 0; column <3; column++){
                if (rows  %2 !=0){
                    System.out.print(mdArray[rows][column]);
                    
                }

            }
        }
        // PATTERN 2
        for (int rows= 0; rows < mdArray.length; rows++){
            System.out.println("");
            for (int column = 0; column <3; column++){
                if (rows %2 ==0){
                System.out.print(mdArray[rows][column]);
            }
            else if(rows %2 != 0){
                System.out.print("");
            }
        }
    }
        // PATTERN 3
        
        for (int rows= 0; rows < mdArray.length; rows++){
            System.out.println("");
            for (int column = 0; column < 3; column++){
                if (rows == 0 || rows == 3){
                    System.out.print(mdArray[rows][column]);
                }
                if (rows == 1 || rows == 2){
                    if (column == 0 || column == 2){
                System.out.print(" ");
                } else {
                System.out.println(mdArray[rows][column]);
                break;
             }
          }
        }
    }

        // PATTERN 4
        for (int row = 0; row < mdArray.length; row++) {
            System.out.println("");
        for (int column = 0; column < 3; column++) {
            if (row == 1 || row == 3){
            System.out.print(mdArray[row][column]);
        } 
         if (row == 0 || row == 2){
           if (column == 0 || column == 2){
            System.out.print(" ");
        } else {
            System.out.print(mdArray[row][column]);
     }
    }
  } 
}
        
        // Get the SUM
        System.out.println("");
        System.out.println("5. SUM");
        int i, j, row_sum = 0, column_sum;  
        int[][] SumOfRowCols_arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        for(i = 0; i < SumOfRowCols_arr.length; i++)
        {
            column_sum = 0;
            for(j =0; j < SumOfRowCols_arr[0].length; j++)

            {
                row_sum = row_sum + SumOfRowCols_arr[i][j];
            }
        }
            System.out.println ("Sum of: " + row_sum);

   }
}
