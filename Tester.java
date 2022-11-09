import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Tester implements CollectionTest{

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
                                Random random = new Random();
                                list.add(new Person("Person" + k, random.nextInt(100)));
                            }
                    
                        break;

                        case ARRAY_LIST:                          
                            for (int j=0; j<size; j++){
                                int k = j+1;
                                Random random = new Random();
                                al.add(new Person("Person" + k, random.nextInt(100)));
                            }
                        break;

                        case HASH_MAP:
                            for (int j=0; j<size; j++){
                                int k = j+1;
                                Random random = new Random();
                                hash_map.put(k, new Person("Person" + k, random.nextInt(100)));
                            }
                            
                        break;
                    }
                    break;

                case INDEX:
                    switch(type){
                        case LINKED_LIST:
                            
                        break;

                        case ARRAY_LIST:
                            //int array_index = size/2;
                            //System.out.println("The person's name is: " + al.get(array_index).getName() + "and the age is: " + al.get(array_index).getAge());
                        break;

                        case HASH_MAP:
                            //int hash_index = size/2;
                            //System.out.println("The person's name is: " + hash_map.get(hash_index).getName() + "and the age is: " + hash_map.get(hash_index).getAge());
                        break;
                    }
                    break;

                case SEARCH:
                    switch(type){
                        case LINKED_LIST:
                            for (Person list_person : list){
                                if (list_person.getName().equals("Person10")){
                                    break;
                                }
                            }
                        break;

                        case ARRAY_LIST:
                            for(Person array_person : al) {
                                if(array_person.getName().equals("Person10")){
                                    break;
                                }
                            }
                        break;

                        case HASH_MAP:          
                            
                            
                        break;
                    }
                    break;
            }
        }        
    }
}

