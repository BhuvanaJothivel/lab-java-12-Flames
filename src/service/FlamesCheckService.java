package service;

public class FlamesCheckService {

	
	public char findFlames(String name1, String name2) {
		String temp1 = name1.trim();
		String temp2 = name2.trim();
		temp1 = name1.toLowerCase();
		temp2 = name2.toLowerCase();
		String temp1_split[] = name1.split(" ");
		String temp2_split[] = name2.split(" ");
		temp1 = "";
		temp2 = "";
		for (int i = 0; i < temp1_split.length; i++) {
			temp1 = temp1 + temp1_split[i];
		}
		for (int i = 0; i < temp2_split.length; i++) {
			temp2 = temp2 + temp2_split[i];
		}
		StringBuilder sb1 = new StringBuilder(temp1);// converting to string builder
        StringBuilder sb2 = new StringBuilder(temp2);
       
        int m=sb1.length();
        int n=sb2.length();
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(sb1.charAt(i) == sb2.charAt(j))
                {
                    sb1.replace(i, i+1, "0"); // replacing matching characters into "0"
                    sb2.replace(j,j+1,"0");
                }
            }
        }
 
        int x1=0;
        int y1=0;
        String s1="";
        String s2="";
        s1 = sb1.toString();
        s2 = sb2.toString();
            for(int i=0;i<s1.length();i++){ //length of string to remove 0 and find the length
                if(s1.charAt(i)!='0'){
                    System.out.print(" "+s1.charAt(i));
                    x1 +=1;
                    
                 }
            }
            System.out.println();
            System.out.println("First String: "+x1);
    
            for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!='0'){
                System.out.print(" "+s2.charAt(i));
                y1 +=1;
                
                }
            } 
            System.out.println();
            System.out.println("Second String: "+y1);
       
        
        int x = x1+y1; // total length of remaining characters in both the strings
        System.out.println("Length is: "+x);
     
        String flames = "flames";
        StringBuilder sb3 = new StringBuilder(flames);
        
        char flameResult = 0;
        
        while(sb3.length()!=1)
        {
            int y = x%sb3.length(); 
            String temp;
            
            if(y!=0)
            {
                temp = sb3.substring(y)+sb3.substring(0, y-1); // taking substring (counting purpose)
                
            }
            else
            {
                temp = sb3.substring(0, sb3.length()-1); // taking substring (counting purpose)
                
            }
            sb3 = new StringBuilder(temp);
            flameResult = sb3.charAt(0);
            
        }
        System.out.println(flameResult);
        
        switch(flameResult)
        {
            case 'f':
                System.out.println("Friends");
                break;
            case 'l':
                System.out.println("Love");
                break;
            case 'a':
                System.out.println("Affection");
                break;
            case 'm':
                System.out.println("Marriage");
                break;
            case 'e':
                System.out.println("Enemies");
                break;
            case 's':
                System.out.println("Sibling");
                break;
                
        }
        
        return flameResult;
    }

}
