

static int B;
static int H;
static boolean flag=false;

static{
    Scanner s=new Scanner(System.in);
    B=s.nextInt();
    H=s.nextInt();
    if(B>0 && H>0)
    {
        flag=true;
    }
    else
    {
        flag=false;
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
}

