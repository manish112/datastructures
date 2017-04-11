/**
 * 
 */
package in.manishsingh.datastructures.Queue.LinkedList;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */
public interface Queue<T> {
	
	public void enqueue(T data);
	public void dequeue();
	public void peek();
	public int size();

}
