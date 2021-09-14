class FindMinMaxWithoutBranch
{
    public static int findMin(int x, int y) {
        return y + ((x - y) & ((x - y) >> 31));
    }
 
    public static int findMax(int x, int y) {
        return x - ((x - y) & ((x - y) >> 31));
    }
 
    public static void main(String[] args)
    {
        int x = 2, y = 4;
 
        System.out.println("min(" + x + ", " + y + ") is " + findMin(x, y));
        System.out.println("max(" + x + ", " + y + ") is " + findMax(x, y));
    }
}





