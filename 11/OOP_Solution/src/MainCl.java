
public class MainCl {

    static int[] func(int[] gr) {
   	 int ar[]=new int[gr.length];
        for(int i=0;i<gr.length;i++)
        {
            if(gr[i]<38)
                ar[i]=gr[i];
            else
            {
                int k=0;
                for(int j=0;j<=4;j++)
                {
                    if((gr[i]+j)%5==0)
                    {
                        k = j;
                        break;                        
                    }
                }
                if(k<3)
                    ar[i]=gr[i]+k;
                else
                    ar[i]=gr[i];
            }
        }        
        return (ar);
    }
}
