package Training;
public class TenMinWalk {
	  public static boolean isValid(char[] walk) {
	    char a;
	     int x=0,y=0;
	    for(int i=0;i<walk.length;i++)
	      {
	      a=walk[i];
	     
	      if(a=='n')y++;
	      if(a=='s')y--;
	      if(a=='w')x++;
	      if(a=='e')x--;
	    }
	    return walk.length==10&&y==0&&x==0;
	  }
	}
