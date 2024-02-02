// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Armstrong{
    
    public static void main(String [] args)
    {
        int num = 154,temp,r;
        double sum = 0;
        temp = num;
        while(num>0)
        {
            r = num%10;
            num=num/10;
            sum= sum + r*r*r;
        }
    
        if(sum==temp)
        {
            System.out.println("Armstrong number" +temp);
        }
        else
        System.out.println("Not Armstrong number" +temp);
    }
    
}