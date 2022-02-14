import java.util.*;

//Part A

public class Delimiters {

    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /**
     * Constructs a Delimiters object were open is the open delimiter and close is
     * the
     * close delimiter.
     * Precondition: open and close are non-empty strings
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /**
     * Returns an ArrayList of delimiters from the array tokens, as described in
     * part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimiters = new ArrayList<String>();

        for (String s : tokens) {
            if (s.equals(openDel) || s.equals(closeDel)) {
                delimiters.add(s);
            }
        }
        return delimiters;
    }

    public static void main(String[] args) {
        Delimiters d1 = new Delimiters("(", ")");
        String[] tokens = { "(", "x + y", ")", " * 5" };
        ArrayList<String> res1 = d1.getDelimitersList(tokens);
        System.out.println("It should print [(, )] and it prints" + res1);

        Delimiters d2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = { "<q>", "yy", "</q>", "zz", "</q>" };
        ArrayList<String> res2 = d2.getDelimitersList(tokens2);
        System.out.println("It should print [<q>, </q>, </q>] and it prints " + res2);
    }
}
