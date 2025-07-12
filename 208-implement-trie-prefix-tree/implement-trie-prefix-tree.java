
class Trie {
	static class TrieNode{
		TrieNode[] children;
		boolean eow;
		TrieNode(){
			children=new TrieNode[26];
			for(int i=0;i<26;i++) {
				children[i]=null;
			}
			eow=false;
		}
	}
	TrieNode root;
	Trie(){
		root=new TrieNode();
		
	}
	void insert(String word) {
		TrieNode curr=root;
		for(int i=0;i<word.length();i++) {
			int idx=word.charAt(i)-'a';
			if(curr.children[idx]==null) 
				curr.children[idx]=new TrieNode();
			if(i==word.length()-1)
				curr.children[idx].eow=true;
			curr=curr.children[idx];
		}
	}
	boolean search(String key) {
		TrieNode curr=root;
		for(int i=0;i<key.length();i++) {
			int idx=key.charAt(i)-'a';
			if(curr.children[idx]==null)
					return false;
			if(i==key.length()-1 && curr.children[idx].eow==false)
					return false;
			curr=curr.children[idx];
		}
		return true;
	}
	boolean startsWith(String prefix) {
		TrieNode curr=root;
		for(int i=0;i<prefix.length();i++) {
			int idx=prefix.charAt(i)-'a';
			if(curr.children[idx]==null) {
				return false;
			}
			curr=curr.children[idx];
		}
		return true;
	}
}