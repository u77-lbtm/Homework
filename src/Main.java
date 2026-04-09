public class Main {
    public static void main(String[] args) {
        //присвоить переменным разные значения
//        переменной dog значение 8.0;
//        переменной cat значение 3.6;
//        переменной paper значение 763789.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4
        var dog2 = dog+4;
        var cat2 = cat+4;
        var paper2 = paper+4;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        //dog уменьшить на 3.5;
        // cat уменьшить на 1.6;
        // paper уменьшить на 7639.
        var dog3 = dog2-3.5;
        var cat3 = cat2-1.6;
        var paper3 = paper2+7639;
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);

//        переменную friend значением 19.
        var friend = 19;
        var friend2 = friend+2;
        var friend3 = friend2-7;
        System.out.println(friend);
        System.out.println(friend2);
        System.out.println(friend3);

        //frog значением 3.5.
        var frog = 3.5;
        var frog2 = frog*10;
        var frog3 = frog2/3.5;
        var frog4 = frog3+4;
        System.out.println(frog);
        System.out.println(frog2);
        System.out.println(frog3);
        System.out.println(frog4);

//Масса одного боксера — 78.2 кг.
//
//Масса второго боксера — 82.7 кг.
        var b1 = 78.2;
        var b2 = 82.7;
        var sum= b1 + b2;
        var dif= b2 - b1;
        System.out.println(sum + "кг");
        System.out.println(dif + "кг");
        //остаток от деления между двумя весами
        var d= b2%b1;
        System.out.println(d);
        //640 часов работы поделено между сотрудниками
        var sumHour = 640;
        var personHour = 8;
        var persons = sumHour / personHour;
        System.out.println("Всего работников в компании —" + persons + "человек");
        //если в компании работает на 94 человека больше
        var persons2 = persons+94;
        var totalHour = persons2*8;
        System.out.println("Если в компании работает " + persons2 + " человек, то всего " + totalHour+" часов работы может быть поделено между сотрудниками");



    }
}