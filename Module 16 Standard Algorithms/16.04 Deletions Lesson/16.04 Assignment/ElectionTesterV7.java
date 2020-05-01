 /**
 * 
 * Main method. Uses Array
 *
 * @author Peter Chow
 * @version 05/01/20
 */

public class ElectionTesterV7
{
    public static void main(String[] args)
    {
        Candidate[] candidateList = new Candidate[7];

        // create inventory
        candidateList[0] = new Candidate("Lucy Robertson", 6000);
        candidateList[1] = new Candidate("Marie Grace", 2400);
        candidateList[2] = new Candidate("Rusty Jordan", 1800);
        candidateList[3] = new Candidate("Mia Garcia", 3200);
        candidateList[4] = new Candidate("John Smith", 2100);
        candidateList[5] = new Candidate("Peter Chow", 100);
        candidateList[6] = new Candidate("Mann Chow", 5010);
        
        // prints original results
        System.out.println();
        System.out.println("Original Results");
        printTable(candidateList);
        System.out.println();

        // prints delete by location results
        System.out.println();
        System.out.println("<< Delete location 4 >>");
        deleteByLoc(candidateList,3);
        printTable(candidateList);
        System.out.println();

        // prints delete by name results
        System.out.println();
        System.out.println("<< Delete Lucy Robertson >>");
        deleteByName(candidateList,"Lucy Robertson");
        printTable(candidateList);
        System.out.println();

        // prints insert candidate results
        System.out.println();
        System.out.println("<< In position 4, add Hamilton Wilde, 9300 votes >>");
        insertCandidate(candidateList,4,"Hamilton Wilde",9300);
        printTable(candidateList);
        System.out.println();

        // prints insert candidate results
        System.out.println();
        System.out.println("<< Before Rusty Jordan, add Ada Hopper, 1111 >>");
        insertCandidate(candidateList,"Rusty Jordan","Ada Hopper",1111);
        printTable(candidateList);
        System.out.println();   

    }

    public static void printCandidates(Candidate[] itemList)
    {
        for(int i = 0; i < itemList.length; i++)
           System.out.println(itemList[i]);
    }
    
    public static void printTable(Candidate[] itemList)
    {
        System.out.println();
        System.out.println("                          Votes           % of Total");
        System.out.println("Candidate                Received            Votes");
        System.out.println("-----------------------------------------------------");
        int totalVotes = findTotal(itemList);
        for(int i = 0; i < itemList.length; i++){
            if(itemList[i] != null){
                double percentOfTotal = (itemList[i].getVotes() / (double)totalVotes)*100;
                System.out.printf("%-27s%-18d%-18.2f%n",itemList[i].getName(), itemList[i].getVotes(),
                                percentOfTotal);
            }
        }

        System.out.println();
        System.out.println("Total number of votes cast in election: " + totalVotes);
    }
    
    
    public static int findTotal(Candidate[] itemList)
    {
        int votesTotal = 0;


        if (itemList.length != 0) 
        {
            votesTotal = itemList[0].getVotes();


            for (int i = 1; i < itemList.length; i++)
            {
                if(itemList[i] != null){
                    votesTotal += itemList[i].getVotes();
                }
                else if (itemList[i] == null){
                    //do nothing
                }
            }
        }
        return votesTotal;
    }
    
    public static void changeName(Candidate[] candidateList, String find, String replace)
    {
       for(int index = 0; index < candidateList.length; index++)
          if(candidateList[index].getName().equals(find))
               candidateList[index].setName(replace);
    }

    public static void changeVotes(Candidate[] candidateList, String find, int votes)
    {
       for(int index = 0; index < candidateList.length; index++)
          if(candidateList[index].getName().equals(find))
               candidateList[index].setVotes(votes);
    }

    public static void changeCandidateAndVotes(Candidate[] candidateList, String candidateToReplace, String newName, int newVotes)
    {
       for(int index = 0; index < candidateList.length; index++)
          if(candidateList[index].getName().equals(candidateToReplace)){
                candidateList[index].setName(newName);
                candidateList[index].setVotes(newVotes);
          }
    }

    //overloaded insertCandidate method

    public static void insertCandidate(Candidate[] itemList, int location, String newName, int newVotes)
    {
        //move items down in the array - last item is lost
        for(int index = itemList.length - 1; index > location; index--){
            itemList[index] = itemList[index-1];
        }
        itemList[location] = new Candidate(newName, newVotes);
    }

    public static void insertCandidate(Candidate[] itemList, String candidateToReplace, String newName, int newVotes)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int i = 0; i < itemList.length; i++){
            
            if(itemList[i] != null){
                if(itemList[i].getName().equals(candidateToReplace)){
                location = i;
                }
            }
            else if (itemList[i] == null){
                //do nothing
            }
        }

        //move items down in the array - last item is lost
        for(int index = itemList.length - 1; index > location; index--){
            itemList[index] = itemList[index-1];
        }

        itemList[location] = new Candidate(newName, newVotes);
    }

    public static void deleteByLoc(Candidate[] itemList, int location)
    {
        if ((location > 0) && (location < itemList.length))
        {
            //move items up in the array -
            for(int index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
    }

    public static void deleteByName(Candidate[] itemList, String find)
    {
        int location = 0;
        int index;

        // find location of item you want to delete
        for(index = 0; index < itemList.length; index++)
            if((itemList[index] != null) && (itemList[index].getName().equals(find)))
            {
                location = index;
                break;
            }
            else if(itemList[index] == null)
            {
                location = -1;
                break;
            }

        if ((index != itemList.length) && (location >= 0))
        { 
            //move items up in the array
            for(index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
    }

}