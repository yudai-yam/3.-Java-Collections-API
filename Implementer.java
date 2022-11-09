import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

public class Implementer implements CollectionTest {

    private CollectionType collectionType;
    private TestType testType;
    private int size;

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void runTest(CollectionType type, TestType test, int iterations) {
        for (int i=0; i<iterations; i++){

            LinkedList<Person> list = new LinkedList<Person>();
            ArrayList<Person> al = new ArrayList<Person>();
            HashMap<Integer, Person> hash_map = new HashMap<Integer, Person>();

            switch(test){
                case ADD:
                    switch(type){
                        case LINKED_LIST:
                            for (int j=0; j<size; j++){
                                int k = j+1;
                                list.add(new Person("Person" + k, ThreadLocalRandom.current().nextInt(0, 100 + 1)));
                            }
                            System.out.println(list);
                        break;

                        case ARRAY_LIST:                          
                            for (int j=0; j<size; j++){
                                int k = j+1;
                                al.add(new Person("Person" + k, ThreadLocalRandom.current().nextInt(0, 100 + 1)));
                            }
                            System.out.println(al);
                        break;

                        case HASH_MAP:
                            for (int j=0; j<size; j++){
                                int k = j+1;
                                hash_map.put(k, new Person("Person" + k, ThreadLocalRandom.current().nextInt(0, 100 + 1)));
                            }
                            System.out.println(al);
                            
                        break;
                    }
                    break;

                case INDEX:
                    switch(type){
                        case LINKED_LIST:
                            int list_index = size/2;
                            System.out.println("The person's name is: " + list.get(list_index).getName() + "and the age is: " + list.get(list_index).getAge());
                        break;

                        case ARRAY_LIST:
                            int array_index = size/2;
                            System.out.println("The person's name is: " + al.get(array_index).getName() + "and the age is: " + al.get(array_index).getAge());
                        break;

                        case HASH_MAP:
                            int hash_index = size/2;
                            System.out.println("The person's name is: " + hash_map.get(hash_index).getName() + "and the age is: " + hash_map.get(hash_index).getAge());
                        break;
                    }
                    break;

                case SEARCH:
                    switch(type){
                        case LINKED_LIST:
                            for (Person list_person : list){
                                if (list_person.getName().equals("Person5")){
                                    System.out.println("Found! The age is "+list_person.getAge());
                                }
                            }
                        break;

                        case ARRAY_LIST:
                            for(Person array_person : al) {
                                if(array_person.getName().equals("Person5")) {
                                    System.out.println("Found! The age is "+array_person.getAge());
                                }
                            }
                        break;

                        case HASH_MAP:
                        /*for (hash_map hash_person : hash_map.entrySet()) {
                            if (hash_person.getName().equals("Person5", hash_map.get)) {
                                return hash_map.getKey();
                            }
                        }*/
                        break;
                    }
                    break;
            }
        }
     
    }


    public void displayCollection(){
        
    }


    
}
