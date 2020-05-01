 /**
 * 
 * Main method. Uses Arraylist.
 *
 * @author Peter Chow
 * @version 05/01/20
 */

import java.util.*;
public class ElectionTesterV4
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
        
        // prints original results
        System.out.println();
        System.out.println("Original Results");
        printTable(candidateList);
        System.out.println();

        // prints only name change results
        System.out.println("<< Changing Marie Grace to Earl Rossburg >>");
        changeName(candidateList,"Marie Grace","Earl Rossburg");
        printTable(candidateList);
        System.out.println();

        // prints vote change results
        System.out.println("<< Changing Lucy Robertson votes to 4500 >>");
        changeVotes(candidateList,"Lucy Robertson",4500);
        printTable(candidateList);
        System.out.println();

        // prints candidate change results
        System.out.println("<< John Smith is replaced by Peter Chow, who has 100 votes >>");
        changeCandidateAndVotes(candidateList,"John Smith","Peter Chow",100);
        printTable(candidateList);
        System.out.println();

    }

    public static void printCandidates(List<Candidate> candidateList)
    {
        for(Candidate item: candidateList)
           System.out.println(item);
    }
    
    public static void printTable(List<Candidate> candidateList)
    {
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

    public static void changeName(List<Candidate> candidateList, String find, String replace)
    {
       for(int i = 0; i < candidateList.size(); i++)
          if(candidateList.get(i).getName().equals(find))
               candidateList.get(i).setName(replace);
    }

    public static void changeVotes(List<Candidate> candidateList, String find, int votes)
    {
       for(int i = 0; i < candidateList.size(); i++)
          if(candidateList.get(i).getName().equals(find))
               candidateList.get(i).setVotes(votes);
    }

    public static void changeCandidateAndVotes(List<Candidate> candidateList, String candidateToReplace, String newName, int newVotes)
    {
       for(int i = 0; i < candidateList.size(); i++)
          if(candidateList.get(i).getName().equals(candidateToReplace)){
               candidateList.get(i).setName(newName);
               candidateList.get(i).setVotes(newVotes);
          }
    }    

}