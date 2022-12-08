class pattern3 {
    public static void main(String[] args)
    {
      int i,j,k;
      for (i=0;i<10;i++) {
        if (i<5) {
          for (j=0;j<=i;j++) {
              System.out.print("*");
          }
          System.out.println();
        }
        else
        {
          for (k=2;k>=i-k;k++) {
            System.out.print("*");
        }
        System.out.println();
    }
      }
    }
  }