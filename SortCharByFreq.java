class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char ch : s.toCharArray())
        {
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)->(hmap.get(b)-hmap.get(a)));
        maxheap.addAll(hmap.keySet());
        StringBuilder result = new StringBuilder();
        while(!maxheap.isEmpty())
        {
            char current = maxheap.remove();
            for(int i=0;i<hmap.get(current);i++)
            {
                result.append(current);
            }
        }
        return result.toString();
        
    }
}
