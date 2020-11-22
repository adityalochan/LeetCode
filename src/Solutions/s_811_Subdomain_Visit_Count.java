package Solutions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class s_811_Subdomain_Visit_Count {

    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String cpdomain : cpdomains){
            String[] cpdomain_split = cpdomain.split(" ");
            String[] value_arr = cpdomain_split[1].split("\\.");
            int key = Integer.valueOf(cpdomain_split[0]);
            String value = "";
            for(int i=value_arr.length-1;i>=0;--i){
                value=value_arr[i]+(i<value_arr.length-1?".":"")+value;
                hm.put(value,hm.getOrDefault(value,0)+key);
            }
        }
        List<String> newList = new ArrayList<>();
        for(String hm_key: hm.keySet()){
            newList.add(""+ hm.get(hm_key)+" "+hm_key);
        }
        return newList;
    }

    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        s_811_Subdomain_Visit_Count s = new s_811_Subdomain_Visit_Count();
        List<String> output = new ArrayList<>();
        output = s.subdomainVisits(cpdomains);
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i));
        }
    }

    @Test
    public void testing(){
        String a = "9001 discuss.leetcode.com";
        String[] splitter = a.split(" ");

        String key = splitter[0];
        String value = splitter[1];

        System.out.println(key);
        System.out.println(value);

        System.out.println("-----------");

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("aditya",1);
        hm.put("james",2);

        System.out.println(hm.keySet());
    }

}
