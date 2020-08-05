class WordDictionary
{
    private static class TrieNode
	{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }
    
    TrieNode root = new TrieNode();

    public void addWord(String word)
	{
        TrieNode node = root;
        
		for(char c : word.toCharArray())
		{
            int index = c - 'a';
            if(node.children[index] == null)
                node.children[index] = new TrieNode();
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word)
    {
        return searchHelper(word, 0, root);
    }
    
    private boolean searchHelper(String word, int start, TrieNode node)
    {
        if(start == word.length())
            return node.isEnd;

        char c = word.charAt(start);
        int index = c - 'a';
        
        if(word.charAt(start) == '.')
        {
            for(int i = 0; i < 26; i++)    
            {
                if(node.children[i] != null && searchHelper(word, start + 1, node.children[i]))
                    return true;
            }
        }
        else
        {
            return node.children[index] != null && searchHelper(word, start + 1, node.children[index]);
        }
        return false;
    }
}
