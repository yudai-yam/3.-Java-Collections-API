import java.util.ArrayList;
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
            switch(testType){
                case ADD:
                    switch(collectionType){
                        case LINKED_LIST:
                        break;

                        case ARRAY_LIST:
                            ArrayList<String> al = new ArrayList<String>();
                            for (int j=0; i<size; j++){
                                al.add("something");
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
