 /**
 * 
 * Main method. Uses Array
 *
 * @author Peter Chow
 * @version 05/01/20
 */

public class ElectionTesterV1
{
    public static void main(String[] args)
    {
        Candidate[] candidateList = new Candidate[5];

        // create inventory
        candidateList[0] = new Candidate("Lucy Robertson", 6000);
        candidateList[1] = new Candidate("Marie Grace", 2400);
        candidateList[2] = new Candidate("Tyler Murphy", 1800);
        candidateList[3] = new Candidate("Mia Garcia", 3200);
        candidateList[4] = new Candidate("John Smith", 2100);
        System.out.println("      Raw Election Data       ");
        System.out.println("______________________________");
        
        printCandidates(candidateList);
        int votesTotal = findTotal(candidateList);
        
        System.out.println();
        System.out.println();
        printTable(candidateList, votesTotal);
    }

    public static void printCandidates(Candidate[] itemList)
    {
        for(int i = 0; i < itemList.length; i++)
           System.out.println(itemList[i]);
    }
    
    public static void printTable(Candidate[] itemList, int votesTotal)
    {
        System.out.println("Election Results: ");
        System.out.println();
        System.out.println("                          Votes           % of Total");
        System.out.println("Candidate                Received            Votes");
        System.out.println("-----------------------------------------------------");
        int totalVotes = findTotal(itemList);
        for(int i = 0; i < itemList.length; i++){
            double percentOfTotal = (itemList[i].getVotes() / (double)totalVotes)*100;
            System.out.printf("%-27s%-18d%-18.2f%n",itemList[i].getName(), itemList[i].getVotes(),
                                percentOfTotal);
        }

       

        System.out.println();
        System.out.println("Total number of votes cast in election: " + votesTotal);
    }
    
    
    public static int findTotal(Candidate[] itemList)
    {
        int votesTotal = 0;
        int index;

        if (itemList.length != 0)
        {
            votesTotal = itemList[0].getVotes();
            index = 0;

            for (int i = 1; i < itemList.length; i++)
            {
                votesTotal += itemList[i].getVotes();
            }
        }
        return votesTotal;
    }
    
}