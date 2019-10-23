import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nameSorter {


    public List<Name> nameSorter(String[] input){
        List<Name> listOfNames = new ArrayList<>();
        for(String name:input){
            String[] temp = name.split(" ");
            listOfNames.add(new Name(
                    temp[0].substring(0,1).toUpperCase()+temp[0].substring(1)
                    ,temp[1].substring(0,1).toUpperCase()
                    ,temp[2].substring(0,1).toUpperCase()+temp[2].substring(1)
                    ,Integer.parseInt(temp[3])));

        }

        Collections.sort(listOfNames, new LastNameSorter()
                .thenComparing(new FirstNameSorter())
                .thenComparing(new MiddleNameSorter())
                .thenComparing(new AgeSorter()));
        return listOfNames;
    }
    public class Name{
        String firstName;
        String lastName;
        String middle;
        Integer age;

        public Name(String firstName,String middle, String lastName, Integer age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middle = middle;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddle() {
            return middle;
        }

        public void setMiddle(String middle) {
            this.middle = middle;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
        @Override
        public String toString(){
            StringBuilder temp= new StringBuilder();
            temp.append(this.firstName).append(" "+this.middle).append(" "+this.lastName+" ").append(age);

            return temp.toString();
        }
    }

    public class LastNameSorter implements Comparator<Name>
    {
        public int compare(Name o1, Name o2)
        {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
    public class FirstNameSorter implements Comparator<Name>
    {
        public int compare(Name o1, Name o2)
        {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
    public class MiddleNameSorter implements Comparator<Name>
    {
        public int compare(Name o1, Name o2)
        {
            return o1.getMiddle().compareTo(o2.getMiddle());
        }
    }
    public class AgeSorter implements Comparator<Name>
    {
        public int compare(Name o1, Name o2)
        {
            return o2.getAge()-o1.getAge();
        }
    }
}
