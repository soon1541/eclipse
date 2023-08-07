package java07_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

   public HashMapTest() {
      // HashMap : 키와 value를 가지는 컬렉션

      HashMap<Integer, MemberVO> hm = new HashMap<Integer, MemberVO>();
      hm.put(200, new MemberVO(200, "홍길동", "010-1111-2222", "강남구"));
      hm.put(100, new MemberVO(100, "이순신", "010-2222-3333", "영등포구"));
      hm.put(300, new MemberVO(300, "안중근", "010-3333-4444", "송파구"));
      hm.put(400, new MemberVO(400, "최길동", "010-9569-8888", "강동구"));

      // get() : 키값이 있을 경우 키에 해당하는 객체를 얻어오기
      MemberVO vo = hm.get(300);
      System.out.println(vo.toString() + "\n--------------------------");

      // keySet : hashMap의 키값들만 Set으로 리턴해준다.
      Set<Integer> leyList = hm.keySet();
      Iterator<Integer> ii = leyList.iterator();

      while (ii.hasNext()) {
         Integer key = ii.next();
         MemberVO m = hm.get(key);
         System.out.println(m.toString());
      }
      System.out.println("------------------------");
      // entrySet() : key, value를 하나의 세트(entry)로 만들어 Set으로 리턴한다
      Set entryList = hm.entrySet();
      Iterator iii = entryList.iterator();

      while (iii.hasNext()) {
         Map.Entry<Integer, MemberVO> entry = (Map.Entry) iii.next();
         Integer key = entry.getKey();
         MemberVO value = entry.getValue();
         System.out.println(value.toString() +", 키값"+ key.toString());
      }
   }

   public static void main(String[] args) {
      HashMapTest hm = new HashMapTest();

   }

}