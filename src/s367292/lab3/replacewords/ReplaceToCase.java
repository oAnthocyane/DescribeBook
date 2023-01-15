package s367292.lab3.replacewords;

public interface ReplaceToCase {
    default String getNameInDativeCase(String word){
        return word.substring(0, word.length()-1) + "у";
    }
    default String getNameInInstrumentalCaseW(String word){
        return word.substring(0, word.length()-2) + "ой";
    }
    default String getNameInInstrumentalCaseM(String word){
        return word.substring(0, word.length()-1) + "ом";
    }
    default String getNameInPrepositionalCase(String word){
        return word + "е";
    }
    default String getNameInGenitiveCase(String word){
        return word.substring(0, word.length()-1) + "а";
    }
    default String getNameInAccusativeCase(String word){
        return word.substring(0, word.length()-1) + "ей";
    }
}
