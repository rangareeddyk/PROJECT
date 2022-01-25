class data
{
private String name;
public String getName()
{
return this.name;
}
public void setName(String name)
{
this.name=name;
}
}

public class accessmodifiers
{
public static void main(String[] args)
{
data d=new data();
d.setName("rangareddy");
System.out.println(d.getName());
}
}