import com.bridgelabz.hashtable.FrequencyTable;
import com.bridgelabz.hashtable.MyHashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class TestMyHashTable {
    MyHashTable<String, Integer> myHashTable;
    FrequencyTable<String> myFrequencyTable;
    @BeforeEach
    public void setUp() {
        myHashTable = new MyHashTable<>();
        myFrequencyTable = new FrequencyTable<>(0);
    }

    @Test
    public void frequencyOfwords() {
        String sentense = "Paranoids are not " +
                "paranoid because they are paranoid but " +
                "because they keep putting themselves " +
                "deliberately into paranoid avoidable " +
                "situations";
        String [] words = sentense.toLowerCase(Locale.ROOT).split(" ");
        for(String word : words){
            myFrequencyTable.add(word);
        }
        Assertions.assertEquals(1, myFrequencyTable.get("paranoids"));
    }
}
