class Main {
    public static void main(String[] args) {
    pattern(5);
    }
    static void pattern(int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                 System.out.print("*");
            }
             System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                 System.out.print("*");
            }
             System.out.println();
        }
        
    }
}


/*OUTPUT
*
**
***
****
*****
****
***
**
*