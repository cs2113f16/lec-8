package readability;
// originally from https://github.com/kenshin03/camus

import java.util.ArrayList;
import java.util.regex.Pattern;

/** Use SentenceModel to find sentence boundaries in text */
public class SentenceExtractor {

    public String[] getSentences(String text) {
        return text.split(Pattern.quote("."));
    }
}