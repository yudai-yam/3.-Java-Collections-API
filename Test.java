public class Test implements CollectionTest {

    CollectionType collectionType;
    TestType testType;


    public Test(){
        System.out.println("Im a constructor!!");
    
    }

    @Override
    public void setSize(int size) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void runTest(CollectionTest.CollectionType type, CollectionTest.TestType test, int iterations) {
        for (int i=0; i<iterations; i++){
            switch(testType){
                case ADD:
                    switch(collectionType){
                        case LINKED_LIST:

                        case ARRAY_LIST:

                        case HASH_MAP:
                    }
                    break;

                case INDEX:
                    switch(collectionType){
                        case LINKED_LIST:

                        case ARRAY_LIST:

                        case HASH_MAP:
                    }
                    break;

                case SEARCH:
                    switch(collectionType){
                        case LINKED_LIST:

                        case ARRAY_LIST:

                        case HASH_MAP:
                    }
                    break;
            }
        }
     
    }

    public void displayCollection(){
        
    }


    
}
