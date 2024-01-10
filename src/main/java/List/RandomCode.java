package List;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class RandomCode {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6, 7, 8));
        List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7, 11, 8, 9, 10));
        List<Integer> list4 = new ArrayList<Integer>(Arrays.asList());
        //, 2, 3, 4, 5, 6, 7, 8, 9, 10

        List<Integer> intersectLists = list1.stream().distinct().filter(list2 :: contains).filter(list3 :: contains).filter(list4::contains).collect(Collectors.toList());


        Set<Long> orderItemIds = new HashSet<>();

        System.out.println(intersectLists);


        /*Set<String> result = list.stream()  .distinct()  .filter(otherList::contains)  .collect(Collectors.toSet());
        Set<String> commonElements = new HashSet(Arrays.asList("red", "green"));
        Assert.assertEquals(commonElements, result);*/
        
        //System.out.println(getISTTimestamp("2022-03-04 00:00:00"));
    }

    public static Long getISTTimestamp(String dateTime) {
        if (dateTime == null || dateTime.trim().length() == 0 || dateTime.equalsIgnoreCase("0000-00-00 00:00:00"))
            return null;

        SimpleDateFormat sdfIndia = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        TimeZone tzInIndia = TimeZone.getTimeZone("Asia/Kolkata");
        sdfIndia.setTimeZone(tzInIndia);
        try {
            return sdfIndia.parse(dateTime).getTime();
        } catch (Exception ex) {
            return null;
        }
    }
}
