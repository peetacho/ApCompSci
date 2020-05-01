/**
 *
 * @author 
 * @version 
 */
import java.util.*;
public class ElectionTesterV2
{
    //do all of this with arraylist
    public static void main(String[] args)
    {
        List<Candidate> candidateList = new ArrayList<Candidate>();
        //ArrayList<Integer> candidateVotes = new ArrayList<Integer>();
        
        // create candidateList
        candidateList.add( new Candidate("Lucy Robertson", 6000));
        candidateList.add( new Candidate("Marie Grace", 2400));
        candidateList.add( new Candidate("Tyler Murphy", 1800));
        candidateList.add( new Candidate("Mia Garcia", 3200));
        candidateList.add( new Candidate("John Smith", 2100));

        System.out.println("      Raw Election Data       ");
        System.out.println("______________________________");
        
        printCandidates(candidateList);
        //int votesTotal = findTotal(candidateList);
        
        System.out.println();
        System.out.println();
        printTable(candidateList);
    }

    public static void printCandidates(List<Candidate> candidateList)
    {
        for(Candidate item: candidateList)
           System.out.println(item);
    }
    
    public static void printTable(List<Candidate> candidateList)
    {
        System.out.println("Election Results: ");
        System.out.println();
        System.out.println("                          Votes           % of Total");
        System.out.println("Candidate                Received            Votes");
        System.out.println("-----------------------------------------------------");

        int totalVotes = findTotal(candidateList);

        for(Candidate item: candidateList)
        {
            double percentOfTotal = (item.getVotes() / (double)totalVotes)*100;
            System.out.printf("%-27s%-18d%-18.2f%n",item.getName(),item.getVotes(),percentOfTotal);
        }
        
        System.out.println();
        System.out.println("Total number of votes cast in election: " + totalVotes);
    }
    
    public static int findTotal(List<Candidate> candidateList)
    {
        int votesTotal = 0;
        int index;

        if (candidateList.size() != 0)
        {
            votesTotal = candidateList.get(0).getVotes();
            index = 0;

            for (int i = 1; i < candidateList.size(); i++)
            {
                votesTotal += candidateList.get(i).getVotes();
            }
        }
        return votesTotal;
    }
        
    
}