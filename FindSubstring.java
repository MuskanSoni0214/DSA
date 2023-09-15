public class FindSubstring {
    public static void main(String[] args) {
        String searchMe="Green Eggs and Hams";
        String findMe="Eggs";

        int searchMeLength=searchMe.length();
        int findMeLength=findMe.length();

        boolean foundit = false;

        for(int i = 0; i<=(searchMeLength-findMeLength); i++)
        {
            if(searchMe.regionMatches(i,findMe,0,findMeLength))
            {
                foundit=true;
                System.out.println("Substring is found "+searchMe.substring(i,i+findMeLength));
                break;
            }
            else
            {
                System.out.println("Match not found.");
                break;
            }
        }
    }
}
