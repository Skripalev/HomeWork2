public class Main { public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача №1");
        var dog=8;
var cat=3.6;
var paper=763789;
System.out.println(dog);
System.out.println(cat);
System.out.println(paper);
        System.out.println("Задача №2");
System.out.println(dog+4);
System.out.println(cat+4);
System.out.println(paper+4);
        System.out.println("Задача №3");
System.out.println(dog-3.5);
System.out.println(cat-1.6);
System.out.println(paper-7639);
        System.out.println("Задача №4");
var friend=19;
System.out.println(friend);
System.out.println(friend+2);
System.out.println((friend+2)/7);
        System.out.println("Задача №5");
var frog=3.5;
System.out.println(frog);
System.out.println(frog*10);
System.out.println((frog*10)/3.5);
System.out.println(((frog*10)/3.5)+4);
        System.out.println("Задача №6");
var boxer1=78.2;
var boxer2=82.7;
var totalMass=(boxer1+boxer2);
System.out.println("Общий вес боксеров "+(totalMass)+" кг.");
var difference=(boxer1-boxer2);
System.out.println("Разница между боксерами "+(difference)+" кг.");
        System.out.println("Задача №7");
var remainder= (boxer1-boxer2)%totalMass;
        System.out.println("Разница между боксерами "+remainder+" кг.");
//Все равно получил отрицательное значение, не понимаю как это решить((
// Могу боксеров местами поменять и получу сразу положительное число, но это же будет расходится с условиями!?))
//Если можно подскажите примерное направление куда думать)))
System.out.println("Задача №8");
var totalTime = 640;
var oneWorker = 8;
var quantityWorker = (totalTime/oneWorker);
System.out.println("Всего работников в компании — "+quantityWorker+" человек.");
var quantityWorker2 = quantityWorker+94;
System.out.println("Если в компании работает "+ quantityWorker2+(", то всего ")+ totalTime/quantityWorker2+" часов работы может быть поделено между сотрудниками.");




}
}

