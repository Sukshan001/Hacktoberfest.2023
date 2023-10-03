class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));


        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }



        for(char mapKey : map.keySet()){
            
                pq.add(mapKey);

            }
            

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
           char curr = pq.remove();
             for(int i=0; i<map.get(curr); i++){
               sb.append(curr);
           }
        }

        return sb.toString();
 
        
    }
}
