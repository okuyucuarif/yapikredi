import java.util.*;
//Yaşları küçüğe doğru sıralar.
//Eğer yaşlar eşit ise albetik olarak isme göre sıralama yapar.
// Berna ve Ali ikilisinin yaşları eşit Ali alfabetik sıralamada daha önce geldiği için onu öne koyar.

public class MyClass {
    public static class Person implements Comparable<Person> {

        private Integer age;
        private String name;
        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }


        //Bu method içinde güncelleme yapılarak sıralama büyükten küçüğe veya alfabetik oalrak büyükten küçüğe göre olabillir.
        /*
            *Aşağıda ki kod(comment içinde bulunan  yaşları büyükten küçüğe doğru sıralar.
            *Alfabetik olarak da büyükten küçüğe doğru sıralama yapar.
            if (o.age == age) {
                return o.name.compareTo(name);
            }
            return o.age.compareTo(age);
         */
        @Override
        public int compareTo(Person o) {
            if (o.age == age) {
                return name.compareTo(o.name);
            }
            return age.compareTo(o.age);
        }

        @Override
        public String toString() {
            return "Name " + name + " Age " + age;
        }
    }
    public static void main(String args[]) {
        List<Person> li = new ArrayList<Person>();
        li.add(new Person("Ali", 35));
        li.add(new Person("Berna", 35));
        li.add(new Person("Veli", 25));
        li.add(new Person("Hasan", 27));
        li.add(new Person("Cemal", 34));
        Collections.sort(li);
        for(Person p : li) {
            System.out.println(p.toString());
        }
    }
}
