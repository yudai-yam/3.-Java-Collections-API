import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class Tester implements CollectionTest{

    private int size;

    LinkedList<Person> linked_list;
    ArrayList<Person> array_list;
    HashMap<Integer, Person> hash_map;

    @Override
    public void setSize(int size) {
        this.size = size;   
    }


    public void initializeLinkedList(){
        linked_list = new LinkedList<Person>();
        for (int j=0; j<size; j++){
            int k = j+1;
            Random random = new Random();
            linked_list.add(new Person("Person" + k, random.nextInt(100)));
        }
    }

    public void initializeArrayList(){
        array_list = new ArrayList<Person>();
        for (int j=0; j<size; j++){
            int k = j+1;
            Random random = new Random();
            array_list.add(new Person("Person" + k, random.nextInt(100)));
        }
    }

    public void initializeHashMap(){
        hash_map = new HashMap<Integer, Person>();
        for (int j=0; j<size; j++){
            int k = j+1;
            Random random = new Random();
            hash_map.put(k, new Person("Person" + k, random.nextInt(100)));
        }
    }


    public Person linkedListIndex(LinkedList<Person> linked_list){
        Person target = linked_list.get(size/2);
        return target;
    }

    public Person arrayListIndex(ArrayList<Person> array_list){
        Person target = array_list.get(size/2);
        return target;
    }

    public Person hashMapIndex(HashMap<Integer,Person> hash_map){
        Person target = hash_map.get(size/2);
        return target;
    }


    public Person searchLinkedList(LinkedList<Person> linked_list){
        for (Person list_person : linked_list){
            if (list_person.getName().equals("Person"+Integer.toString(size/2))){
                return list_person;
            }
        }
        return null;
    }

    public Person searchArrayList(ArrayList<Person> array_list){
        for(Person array_person : array_list) {
            if(array_person.getName().equals("Person"+Integer.toString(size/2))){
                return array_person;
            }
        }
        return null;
    }
    public Person searchHashMap(HashMap<Integer, Person> hash_map){
        for (Map.Entry<Integer, Person> mapElement : hash_map.entrySet()) {
            if (mapElement.getValue().getName().equals("Person"+Integer.toString(size/2))){
                return mapElement.getValue();
            }
        }
        return null;
    }


    @Override
    public void runTest(CollectionType type, TestType test, int iterations) {
        for (int i=0; i<iterations; i++){
            switch(test){
                case ADD:
                    switch(type){
                        case LINKED_LIST:
                            initializeLinkedList();
                        break;

                        case ARRAY_LIST:                          
                           initializeArrayList();
                        break;

                        case HASH_MAP:
                            initializeHashMap();
                        break;
                    }
                    break;

                case INDEX:
                    switch(type){
                        case LINKED_LIST:
                            linkedListIndex(linked_list);                   
                        break;

                        case ARRAY_LIST:
                            arrayListIndex(array_list);   
                        break;

                        case HASH_MAP:
                            hashMapIndex(hash_map);
                        break;
                    }
                    break;

                case SEARCH:
                    switch(type){
                        case LINKED_LIST:
                            searchLinkedList(linked_list);
                        break;

                        case ARRAY_LIST:
                            searchArrayList(array_list);
                        break;

                        case HASH_MAP:          
                            searchHashMap(hash_map);                           
                        break;
                    }
                    break;
            }
        }        
    }
}

