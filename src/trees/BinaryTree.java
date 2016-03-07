package trees;

import java.util.*;

class TreeNode<E> {
	private E value;
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode(E val, TreeNode<E> par){
		this.parent = par;
		this.left = null;
		this.right = null;
		this.value = val;
	}
	
	public TreeNode<E> addLeftChild(E val){
		this.left = new TreeNode<E>(val, this);
		return this.left;
	}
	
	public TreeNode<E> addRightChild(E val){
		this.right = new TreeNode<E>(val, this);
		return this.right;
	}
	
	public void visit(){
		System.out.println(this.value);
	}
	
	public TreeNode<E> getLeftChild(){
		return this.left;
	}
	
	public TreeNode<E> getRightChild(){
		return this.right;
	}
	
}

public class BinaryTree<E> {
	TreeNode<E> root;
	
	public void levelOrder(){
		Queue<TreeNode<E>> q  = new LinkedList<TreeNode<E>>();
		Stack<TreeNode<E>> st = new Stack<TreeNode<E>>();
		Deque<TreeNode<E>> dq = new LinkedList<TreeNode<E>>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode<E> cur = q.remove();
			if(cur != null){
				cur.visit();
				TreeNode<E> child = cur.getLeftChild();
				if (child!=null){
				    q.add(child);
				}
				child = cur.getRightChild();
				if (child!=null){
				    q.add(child);
				}
			}
		}
		
	}

}
