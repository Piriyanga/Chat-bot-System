package PL;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.LexedTokenFactory;
import edu.stanford.nlp.process.PTBTokenizer;

public class NLP {

    NLP(String txt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String[] tokenize(String input) {
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        Reader reader = new StringReader(input);
        LexedTokenFactory<CoreLabel> tokenFactory = new CoreLabelTokenFactory();
        PTBTokenizer<CoreLabel> ptbt = new PTBTokenizer<CoreLabel>(reader, tokenFactory, "");
        List<CoreLabel> tokens = ptbt.tokenize();
        
        int size = tokens.size();
        String[] tokenStrings = new String[size];
        
        for (int i = 0; i < size; i++) {
            tokenStrings[i] = tokens.get(i).toString();
        }
        
        return tokenStrings;
    }
}