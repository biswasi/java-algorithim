//You have been given a string s, which is supposed to be a sentence. However, someone forgot to put spaces between the different words, and for some reason they capitalized the first letter of every word. Return the sentence after making the following amendments:

//Put a single space between the words.
//Convert the uppercase letters to lowercase

String transformText(String s) {
    char[]inputArray=s.toCharArray();
    StringBuilder output=new StringBuilder();
    output.append(inputArray[0]);
    for(int i=1;i<inputArray.length;i++)
    {
        if(Character.isUpperCase(inputArray[i]))
        output.append(" ").append(inputArray[i]);
        else output.append(inputArray[i]);       
    }
    return output.toString().toLowerCase();
}
