package Solutions;

import org.junit.Assert;
import org.junit.Test;

public class citi {

    public static void main(String[] args) {
        citi c = new citi();

    }
//    @Test
//    public void shouldInvertCheckSpace() {
//        //String inverted = Inverter.invert("%^%&^^&**((&%%^(#$%@");
//        StringBuilder s = new StringBuilder("'%^%&^^&**((&%%^(#$%@')");
//        s.reverse();
//        //Assert.assertEquals(inverted,"aaaa    aaaa    aaaa");
//    }
//
//
//    package com.codility.tasks.invert;
//
//import com.codility.tasks.invert.Inverter;
//import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Test;
//
//    public class InverterTest {
//
//        @Test
//        public void shouldInvert() {
//            String inverted = Inverter.invert("code");
//
//            Assert.assertEquals(inverted,"edoc");
//        }
//
//        @Test
//        public void shouldInvertEmptyString() {
//            String inverted = Inverter.invert("");
//
//            Assert.assertEquals(inverted,"");
//        }
//
//        @Test
//        public void shouldInvertSingleCharacter() {
//            String inverted = Inverter.invert("a");
//
//            Assert.assertEquals(inverted,"a");
//        }
//
//        @Test
//        public void shouldInvertNotEqual() {
//            String inverted = Inverter.invert("codility");
//
//            Assert.assertNotEquals(inverted,"gdfgf");
//        }
//
//        @Test
//        public void shouldInvertCheckSpace() {
//            String inverted = Inverter.invert("aaaa    aaaa    aaaa");
//
//            Assert.assertEquals(inverted,"aaaa    aaaa    aaaa");
//        }
//
//        @Test
//        public void shouldInvertCheckSpecialCharacter() {
//            String inverted = Inverter.invert("%^%#%$%^^*&*^&%&^%#$^");
//
//            Assert.assertEquals(inverted,"^$#%^&%&^*&*^^%$%#%^%");
//        }
//
//
//        def fun(n,k):
//        allin = 0
//        d1 = dict()
//    while(1):
//            if n==2:
//        d1[n] = "he bet 1"
//                break
//                if n%2==0 and allin<k:
//        d1[n] = "all in"
//        allin+=1
//        n=int(n/2)
//        else:
//        d1[n] = "he bet 1"
//        n-=1
//        print("at the beginning: 1\n")
//        count=1
//                for key in sorted(d1):
//                if count%10==2:
//        temp = str(count)+"nd"
//        elif count%10==3:
//        temp = str(count)+"rd"
//        elif count==1:
//        temp = str(count)+"st"
//                else:
//        temp = str(count)+"th"
//        print("After {} round: {} ({})".format(temp,key,d1[key]))
//        count+=1
//
//        print("\nHe played all-in {} times".format(allin))
//
//
//        print("Enter N and K: ")
//        a = [int(x) for x in input().split()]
//        fun(a[0],a[1])
//
//    }
//
//
//    public int solution(int N, int K) {
//        int bet = 0;
//        String s = "";
//        Map<Integer, String> map = new HashMap<>();
//
//        while(true)    {
//            if(N==2){
//                map.put(N,"he bets 1");
//                break;
//            }
//            if(N%2==0 && bet<K){
//                map.put(N,"john bets all in");
//                bet+=1;
//                N=N/2;
//            }else {
//                map.put(N,"john bets 1");
//                N-=1;
//            }
//            System.out.println("moving to beginning: 1");
//            int count=1;
//
//        }
//
//        return bet;
//
//    }
}
