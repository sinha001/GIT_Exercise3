public class pattern2{
    public static void main(String args[])
    {
        int noOfExec = 5;
        for(int i = 0;i<noOfExec;i++)
        {
            for(int j= 0;j<=noOfExec-i;j++)
            {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}