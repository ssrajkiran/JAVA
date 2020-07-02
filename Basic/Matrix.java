class Matrix
{
    public static void main(String [] args)
    {
        int[][] a = new int [3][3];
        int num=1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=num;
                ++num;
            }
        }  
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + " ");
            }
        System.out.println();
        }
        
    }
}