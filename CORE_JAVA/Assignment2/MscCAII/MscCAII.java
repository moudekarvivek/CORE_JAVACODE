package MscCAII;

public class MscCAII
{
int SemITotal,SemIITotal;

public MscCAII()
{
}

public MscCAII(int m3,int m4)
{
	this.SemITotal=m3;
	this.SemIITotal=m4;
}

public void setsumtotal(int m3,int m4)
{
this.SemITotal=m3;
this.SemIITotal=m4;
}

public int gettotal()
{
return this.SemITotal + this.SemIITotal;
}

}

