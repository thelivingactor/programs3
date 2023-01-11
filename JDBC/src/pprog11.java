import java.lang.StringBuilder;
public class pprog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command ="G()(al)";
		StringBuilder result = new StringBuilder(100);
        int j=1;
        for(int i=1;i<=command.length();i++)
        {
            if(command.charAt(i)=='('&&command.charAt(i+1)==')' )
            {
             result.setCharAt(j,'o');
            }
            else if(command.charAt(i)=='('&&command.charAt(i+1)=='a'&&command.charAt(i+2)=='l'&&command.charAt(i+3)==')')
            {
            result.setCharAt(j,'a');
            result.setCharAt(j+1,'l');
            j++;
            }
            else if(command.charAt(i)=='G')
            {
            result.setCharAt(j,'G');
            }
            j++;
        }
        System.out.println(result);

	}
}


