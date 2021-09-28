import java.util.Scanner;
public class java
{
    int width;
    int height;
    int depth;

    java(int w,int h, int d)
    {
        width=w;
        height=h;
        depth=d;

    }
    int volume()
    {
        return width*height*depth;

    }

}
class boxMain
{
    public static void main(String[] args) {
        System.out.println("enter width, height, depth ");
        Scanner w = new Scanner(System.in);
        java obj=new java(w.nextInt(),w.nextInt(),w.nextInt());
        int a=obj.volume();

        System.out.println("volume = "+a);
    }
}
