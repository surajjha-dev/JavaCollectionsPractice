package List;

import org.omg.Messaging.SyncScopeHelper;
import sun.reflect.generics.tree.Tree;

import java.util.Base64;


/*      Input: k = 3, n =  4
        list1 = 1->3->5->7->NULL
        list2 = 2->4->6->8->NULL
        list3 = 0->9->10->11->NULL
        Output: 0->1->2->3->4->5->6->7->8->9->10->11 */
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode createNode(int n) {
        TreeNode tn = new TreeNode();
        tn.value = n;
        tn.left = null;
        tn.right = null;
        return tn;
    }
}

public class Testing {

    static Integer res = 0;


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();

        rootToLeafSum(treeNode, "");
    }

    public static void rootToLeafSum(TreeNode treeNode, String concatValue) {
        if (treeNode.left == null && treeNode.right == null) {
            res += Integer.valueOf(concatValue);
            return;
        }

        if (treeNode.left != null)
            rootToLeafSum(treeNode.left, concatValue + String.valueOf(treeNode.value));
        else if (treeNode.right != null)
            rootToLeafSum(treeNode.right, concatValue + String.valueOf(treeNode.value));

    }
}

/*


		[2]
	[5]		[6]
[1]				[8]

251 + 268



              [2]
	[5]	   [6]
   [1]        [7]		[8]

251 + 257 + 268 = 776




["the","day","is","sunny","the","the","the","sunny","is","is"] , k = 4 -  ["the","is","sunny","day"] , k= 2 -  ["the","is"]


class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode createNode(int n) {
        TreeNode tn = new TreeNode();
        tn.value = n;
        tn.left = null;
        tn.right = null;
        return tn;
    }
}

             [2]
	[5]	   [6]
   [1]        [7]		[8]

public class Testing {

    static Integer res = 0;


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();

        rootToLeafSum(treeNode, ""); // 2 root node passed here
    }

     // O(n)
    public static void rootToLeafSum(TreeNode treeNode, String concatValue) {

        if (treeNode.left == null && treeNode.right == null) {
            res += Integer.valueOf(concatValue + String.valueOf(treeNode.value)); // 251 // 2
            return;
        }

        if (treeNode.left != null)
            rootToLeafSum(treeNode.left, concatValue + String.valueOf(treeNode.value)); // 5 concatvalue = 2 // concatValue = 25 // 1
        if (treeNode.right != null)
            rootToLeafSum(treeNode.right, concatValue + String.valueOf(treeNode.value));

    }

    public static List<String> frequencyCount(List<String> values, int k) {

             Map<String, Integer> frequency = new HashMap<>();

            for (String val : values) {
                if (frequency.containsKey(val)) {
                   frequency.put(val, frequency.get(val) + 1);
                } else
                   frequency.put(val, 1);
            }
            //O(n)

            Collections.sort(frequency, new StringComprator()); // O(nlogn)
            List<String> result = new ArrayList<>();

            int count = 0;
            for (Entry<String, Integer> entry : frequency.getEntrySet())  {
                if (count < k)  {
                    result.add(entry.getKey());
                    count++;
                }
            }
            //O(n)

             return result;
    }

}

    public class StringComprator extends Comporable {
       int CompareTo(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
               if (entry1.getValue() < entry2.getValue())
                   return -1;
               else if (entry1.getValue() > entry2.getValue())
                   return +1;
               else
                  return 0;
       }

    }



*/
