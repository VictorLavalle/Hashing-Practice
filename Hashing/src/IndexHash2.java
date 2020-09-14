/**
 * @author Victor Lavalle
 * This class create an index from a string 
 * multiplying by powers.
 * 
 * 1.Separate the digits of the number entered 
 *    and multiply by powers of 10
 * 
 * 2. Split the word into its letters, and convert
 *    the letter to its numerical value, multiply by
 *    powers of 27 and add the result.
 */
public class IndexHash2 {
    
    //Blank Space at first and doesn't include the "Ñ,n" and numbers
    char alphabet[]={
        ' ','a','b','c','d','e','f','g','h','i','j',
        'k','l','m', 'n','o','p','q','r','s','t',
        'u','v','w','x','y','z'
        ,'A','B','C','D','E','F','G','H','I',
        'J','K','L','M','N','O','P','Q','R'
        ,'S','T','U','V','X','Y','Z',};
     
    
    //Check when capturing a string if the string are numbers
    //then parse it and returns a boolean to access to the 
    // correct function
    public boolean isNumber(String string){
        try{
        int value= Integer.parseInt(string);
        return true;
        }catch(NumberFormatException e){
        return false;
        }
    }  
    
    //When the the captured string is only numbers 
    //this function make the work of hashing it
    //Example:
    // 7546=7(10^3)+5(10^2) +4(10^1) +6(10^0) 
    public int numberHash(String input){
        int inputValue=0, i =0;
        char[] chars = input.toCharArray();
       for(char ch : chars){
             inputValue+=((Character.getNumericValue(ch))
                *Math.pow(10, chars.length-(i+1)));
             i++;                
       }
        return inputValue;
    }
    
    //When there's no numbers in the string, this
    //function make the work of hashing it
    //Example
    // cats=3(27^3)+1(27^2) +20(27^1) +19*(27^0 )
    public int stringHash(String word){
        int Valor=0;
        for(int i=0;i<word.length();i++){
            for(int j=0;j<alphabet.length;j++){
                if(word.charAt(i)==alphabet[j]){
                    Valor+= (j*Math.pow(27, word.length()-(i+1)));
                break;
                }          
            }
        }
            return Valor;
    }
    
    //Function to aplly the hashing according
    //of the input string
    public int Hashing(String input){    
        int key=0;
        
        if(!isNumber(input)){  key= stringHash(input);}
        
        else{ key=numberHash(input); }
        
    return key;
    }

    }
    

