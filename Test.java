import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class Test implements CollectionTest {

    CollectionType collectionType;
    TestType testType;
    private int size;


    public Test(){
        System.out.println("Im a constructor!!");
    }

    @Override
    public void setSize(int size) {
        this.size = size;

    }

    @Override
    public void runTest(CollectionTest.CollectionType type, CollectionTest.TestType test, int iterations) {
        for (int i=0; i<iterations; i++){

            ArrayList<Person> al = new ArrayList<Person>();

            switch(testType){
                case ADD:
                    switch(collectionType){
                        case LINKED_LIST:
                        break;

                        case ARRAY_LIST:                          
                            for (int j=0; j<size; j++){
                                int k = j+1;
                                al.add(new Person("Person" + k, ThreadLocalRandom.current().nextInt(0, 100 + 1)));
                            }
                            System.out.println(al);
                        break;

                        case HASH_MAP:
                        break;
                    }
                    break;

                case INDEX:
                    switch(collectionType){
                        case LINKED_LIST:
                        break;

                        case ARRAY_LIST:
                            int index = size/2;
                            System.out.println("The person's name is: " + al.get(index).getName() + "and the age is: " + al.get(index).getAge());
                        break;

                        case HASH_MAP:
                        break;
                    }
                    break;

                case SEARCH:
                    switch(collectionType){
                        case LINKED_LIST:
                        break;

                        case ARRAY_LIST:
                            for(Person person : al) {
                                if(person.getName().equals("Person5")) {
                                    System.out.println("Found! The age is "+person.getAge());
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

    public void displayCollection(){
        
    }


    
}
