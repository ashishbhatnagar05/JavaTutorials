package example.spring.data;

public interface CustomerDAO {
	public void insert(Customer customer);

	public Customer findByCustomerId(int custId);
}