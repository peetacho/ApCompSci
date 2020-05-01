 /**
 * 
 * Main method. Uses Arraylist.
 *
 * @author Peter Chow
 * @version 05/01/20
 */

import java.util.*;
public class ElectionTesterV8
{
    //do all of this with arraylist
    public static void main(String[] args)
    {
        List<Candidate> candidateList = new ArrayList<Candidate>();
        //ArrayList<Integer> candidateVotes = new ArrayList<Integer>();
        
        // create candidateList
        candidateList.add( new Candidate("Lucy Robertson", 6000));
        candidateList.add( new Candidate("Marie Grace", 2400));
        candidateList.add( new Candidate("Rusty Jordan", 1800));
        candidateList.add( new Candidate("Mia Garcia", 3200));
        candidateList.add( new Candidate("John Smith", 2100));
        candidateList.add( new Candidate("Peter Chow", 100));
        candidateList.add( new Candidate("Mann Chow", 5010));
        
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

    //overloaded insertCandidate method

    public static void insertCandidate(List<Candidate> itemList, int location, String newName, int newVotes)
    {
        itemList.add(location - 1, new Candidate(newName, newVotes));
    }

    public static void insertCandidate(List<Candidate> itemList, String candidateToReplace, String newName, int newVotes)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < itemList.size(); index++){
            if(itemList.get(index).getName().equals(candidateToReplace)){
                location = index;
            }
        }
        itemList.add(location, new Candidate(newName, newVotes));
    }

    public static void deleteByLoc(List<Candidate> itemList, int location)
    {
        // delete item from ArrayList
        itemList.remove(location);
    }

    public static void deleteByName(List<Candidate> itemList, String find)
    {
        int location = 0;
        int index;

        // find location of item you want to delete
        for(index = 0; index < itemList.size(); index++)
        {
            if(itemList.get(index).getName().equals(find))
            {
                location = index;
                break;
            }
        }
        
        // delete item from ArrayList
        if (index != itemList.size()){
            itemList.remove(location);
        }
    }
}