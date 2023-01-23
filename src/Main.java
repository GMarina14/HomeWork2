public class Main
{
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1()
    {
        System.out.println("Task #1");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2()
    {
        System.out.println("Task #2");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        var newVar=4;

        dog+=newVar;
        cat+=newVar;
        paper+=newVar;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task3()
    {
        System.out.println("Task #3");

        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        dog-=3.5;
        cat-=1.6;
        paper-=7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task4()
    {
        System.out.println("Task #4");

        var friend=19;
        System.out.println(friend);

        friend+=2;
        System.out.println(friend);

        friend/=7;
        System.out.println(friend);
    }
    public static void task5()
    {
        System.out.println("Task #5");

        var frog=3.5;
        System.out.println(frog);

        frog*=10;
        System.out.println(frog);

        frog/=3.5;
        System.out.println(frog);

        frog+=4;
        System.out.println(frog);

    }
    public static void task6()
    {
        System.out.println("Task #6");
        var firstBoxer=78.2;
        var secondBoxer=82.7;

        var combinedWeight=firstBoxer+secondBoxer;
        System.out.println("The total weight of both boxers is "+combinedWeight);

        var differenceWeight=secondBoxer-firstBoxer;
        System.out.println("The weight difference between boxers is " + differenceWeight);

    }

    public static void task7()
    {
        System.out.println("Task #7");
        var firstBoxer=78.2;
        var secondBoxer=82.7;

        var firstMethod=secondBoxer-firstBoxer;
        System.out.println("Substract the smaller number from larger "+firstMethod);

        var secondMethod=secondBoxer%firstBoxer;
        System.out.println("The modulo operation "+secondMethod);
    }

    public static void task8()
    {
        System.out.println("Task #8");
        var totalHours=640;
        var hoursOfWork=8;

        var employees=totalHours/hoursOfWork;
        System.out.println("The total number of employees of the company is " +employees);

        employees+=94;
        totalHours=hoursOfWork*employees;
        System.out.println("If the total number of employees of the company is " + employees
                +", then " +totalHours+ " hours of work can be divided among employees ");

    }
}