package project1;

public class GenericSorting<T extends Comparable<T>> 
{
	private T[][] grid;
	
	public GenericSorting(T[][] grid)
	{
		this.grid = grid;
	}
	
	public T[][] getGrid()
	{
		return this.grid;
	}
	
	public void setGrid(T[][] grid) 
	{
		this.grid = grid;
	}
	
	public void sort() 
	{
      int colOut = 0;
      for(int rowOut = 0; rowOut < grid.length; rowOut++)
      {
         int rowTotalOut = 0;
         while(rowTotalOut < grid[rowOut].length)
         {
            int colIn = 0;
            for(int rowIn = 0; rowIn < grid.length; rowIn++)
            {
               int rowTotalIn = 0;
               while(rowTotalIn < grid[rowIn].length)
               {
                  if(grid[rowIn][colIn].compareTo(grid[rowOut][colOut]) > 0)
                  {
                     T temp = grid[rowOut][colOut];
                     grid[rowOut][colOut] = grid[rowIn][colIn];
                     grid[rowIn][colIn] = temp;
                  }
                  rowTotalIn++;
                  if(rowIn % 2 == 0)
                     colIn++;
                  else
                     colIn--;
               }
               if(rowIn % 2 == 0)
                  colIn--;
               else
                  colIn++;
            }
            
            rowTotalOut++;
            if(rowOut % 2 == 0)
               colOut++;
            else
               colOut--;
            
         }
         if(rowOut % 2 == 0)
            colOut--;
         else
            colOut++;
      }
	}
	
	public void print2DArray() 
	{
		for(int i = 0; i < grid.length; i++) 
		{
			for(int j = 0; j < grid[i].length; j++) 
			{
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
