/**
 * @author Victor Lavalle
 * This class create an index from a word summing digits
 * example: 
 * " " = 0
* a = 1, b=2,...
 */

public class IndexHash {
    
    //Blank Space at first and doesn't include the "Ñ,n"
    char alphabet[]={
        ' ','a','b','c','d','e','f','g','h','i','j',
        'k','l','m', 'n','o','p','q','r','s','t',
        'u','v','w','x','y','z'
        ,'A','B','C','D','E','F','G','H','I',
        'J','K','L','M','N','O','P','Q','R'
        ,'S','T','U','V','X','Y','Z',
        '0','1','2','3','4','5','6','7','8','9'};

    /*
    *This function receives a string and compares
    *each letter of it according to the number of the
    *"alphabet" arrangement and it'll be summing the
    *values of all the letters of the string
    */
    public int Hashing(String word){
        int wordValue=0;
          for(int i=0;i<word.length();i++){
              for(int j=0;j<alphabet.length;j++){
                  if(word.charAt(i)==alphabet[j]){
                    wordValue+=j;
                break;
                }   
            }
        }
        return wordValue;
    }
}
