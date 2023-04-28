
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/*Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля
Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их
В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.

 */

public class HW_8 {
    public static void main(String[] args) {
            Person person1 = new Person ("Dima","Olegov",22,12567,Person.Type.MALE);
            Person person2 = new Person("Kirill", "Olegovna", 24, 12346, Person.Type.MALE);
            Person person3 = new Person("Igor", "Volochak", 25, 12306, Person.Type.MALE);
            Person person4 = new Person("Alena", "Kontratec", 18, 12996, Person.Type.FAMALE);
            Person person5 = new Person("Alex", "Rotov", 19, 13700, Person.Type.MALE);
            Person person6 = new Person("Vlad", "Ivanova", 21, 18346, Person.Type.FAMALE);
            Map map = new HashMap<>();
            map.put(0,person1);
            map.put(1,person2);
            map.put(2,person3);
            map.put(3,person4);
            map.put(4,person5);
            map.put(5,person6);

        System.out.println(howIsOlder(map));
        }
public static Map howIsOlder(Map mapa){
        Map tempMap = new HashMap<>();
        int count = 0;
    for (int i = 0; i < mapa.size(); i++){
        Person tempPerson = (Person) mapa.get(i);
        if (tempPerson.getAge() >= 20){
            tempMap.put(count, tempPerson);
            count++;
        }
        }return  tempMap;
    }
}