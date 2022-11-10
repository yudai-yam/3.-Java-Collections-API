import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

/**
 * It implements CollectionTest interface and it performs certain tasks (populating API, searching, and indexing)
 * based on the command.
 * @author Yudai Yamase
 */
public class Tester implements CollectionTest{

    private int size;

    LinkedList<Person> linked_list;
    ArrayList<Person> array_list;
    HashMap<Integer, Person> hash_map;

    /**
     * It sets the size of API.
     * @param size the size of API
     */
    @Override
    public void setSize(int size) {
        this.size = size;   
    }


    /**
     * It initializes linkedlist, whose type is Person, which contains its name and age.
     */
    public void initializeLinkedList(){
        linked_list = new LinkedList<Person>();
        for (int j=0; j<size; j++){
            int k = j+1;
            Random random = new Random();
            linked_list.add(new Person("Person" + k, random.nextInt(100)));
        }
    }

    /**
     * It initializes arraylist, whose type is Person, which contains its name and age.
     */
    public void initializeArrayList(){
        array_list = new ArrayList<Person>();
        for (int j=0; j<size; j++){
            int k = j+1;
            Random random = new Random();
            array_list.add(new Person("Person" + k, random.nextInt(100)));
        }
    }

    /**
     * It initializes hashmap, whose type is Person, which contains its name and age.
     */
    public void initializeHashMap(){
        hash_map = new HashMap<Integer, Person>();
        for (int j=0; j<size; j++){
            int k = j+1;
            Random random = new Random();
            hash_map.put(k, new Person("Person" + k, random.nextInt(100)));
        }
    }


    /**
     * It seaches the item through linkedlist based on the index 
     * @param linked_list linkedlist which contains type Person
     * @return returns target Person object that has designated index
     */
    public Person linkedListIndex(LinkedList<Person> linked_list){
        Person target = linked_list.get(size/2);
        return target;
    }

    /**
     * It seaches the item through arraylist based on the index 
     * @param array_list linkedlist which contains type Person
     * @return returns target Person object that has designated index
     */
    public Person arrayListIndex(ArrayList<Person> array_list){
        Person target = array_list.get(size/2);
        return target;
    }

    /**
     * It seaches the item through hashmap based on the index 
     * @param hash_map hashmap which contains type Person
     * @return returns target Person object that has designated index
     */
    public Person hashMapIndex(HashMap<Integer,Person> hash_map){
        Person target = hash_map.get(size/2);
        return target;
    }

    /**
     * It seaches the item through linkedlist based on the value (person's name)
     * @param linked_list linkedlist which contains type Person
     * @return if the item is found, it returns the target Person, else null
     */
    public Person searchLinkedList(LinkedList<Person> linked_list){
        for (Person list_person : linked_list){
            if (list_person.getName().equals("Person"+Integer.toString(size/2))){
                return list_person;
            }
        }
        return null;
    }

    
    /**
     * It seaches the item through arraylist based on the value (person's name)
     * @param array_list arraylist which contains type Person
     * @return if the item is found, it returns the target Person, else null
     */
    public Person searchArrayList(ArrayList<Person> array_list){
        for(Person array_person : array_list) {
            if(array_person.getName().equals("Person"+Integer.toString(size/2))){
                return array_person;
            }
        }
        return null;
    }
    
    /**
     * It seaches the item through hashmap based on the value (person's name)
     * @param hash_map hashmap which contains type Person
     * @return if the item is found, it returns the target Person, else null
     */
    public Person searchHashMap(HashMap<Integer, Person> hash_map){
        for (Map.Entry<Integer, Person> mapElement : hash_map.entrySet()) {
            if (mapElement.getValue().getName().equals("Person"+Integer.toString(size/2))){
                return mapElement.getValue();
            }
        }
        return null;
    }


    /**
     * Override runTest method in CollectionTest interface. It performs add, index, or seach for linkedlist, arraylist,
     * or hashmap based on the command. It iterates certain amount of time.\
     * 
     * @param type It can be linkedlist, arraylist, or hashmap. 
     * @param test It can be add, index, or search. This method performs one of the operations based on this parameter
     * @param iterations It defines how many times it keeps looping.
     */
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

