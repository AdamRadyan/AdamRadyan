// class declaration

public class student

{
    // Instance Variables
    String name;
    int height;
    int weight;
    int age;

    // Constructor Declaration of Class
    public student (String name, int height,
                   int weight, int age)
     {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;   

// method 1
public String getname()
{
    return name;
}

// method 2
public int getheight()
{
    return height;
}

// method 3
public int getweight()
{
    return weight;
}

// method 4
public int getage()
{
    return age;
}

@Override
public String toString()

{
    return("Hi my name is "+ this.getName()+
           ".\nMy height,weight and age are " +
           this.getheight()+"," + this.getweight()+
           ","+ this.getage());
}

public static void main(String[] args)
{
    student adam = new student("adam","150", "45", "13");
    System.out.println(adam.toString());
}
}
                   