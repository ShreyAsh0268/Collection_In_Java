package collection_and_multithreding_and_file_handling;
import java.util.*;
/*
 Q5. WAP to create an Employee class and store  5 employee objects in the ArrayList collection and perform the following operation on it.
	Case 1: View All Employee Data
	Case 2: Search Employee by using its id.
	Case 3: Delete Employee by using its id.
	Case 4: update employee name by using its id.
	Case 5: find the same name employee 

 */
class Employee{
	int eid;
	String name;
	double sal;
	String mno;
	String sector;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
}
public class Q5_WAP_to_create_an_Employee_class_ArrayList_collection_and_perform_the_operation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of employee you want add");
		int size = s.nextInt();
		
		ArrayList al = new ArrayList();
		Employee emp[] = new Employee[size];
		for(int i=0;i<size;i++) {
			emp[i]=new Employee();
			
			System.out.println("Enter Emp Id");
			int id = s.nextInt();
			s.nextLine();
			
			System.out.println("Enter Emp Name");
			String name = s.nextLine();
			
			System.out.println("Enter Emp Salary");
			double sal = s.nextDouble();
			s.nextLine();
			
			System.out.println("Enter Emp Mobail Number");
			String mno = s.nextLine();
			
			System.out.println("Enter Emp Sector");
			String sec = s.nextLine();
			
			emp[i].setEid(id);
			emp[i].setName(name);
			emp[i].setSal(sal);
			emp[i].setMno(mno);
			emp[i].setSector(sec);
			
			al.add(emp[i]);
		}
		
		int choice=0;
		do {
			System.out.println("Case 1: View All Employee Data\r\n"
					+ "	Case 2: Search Employee by using its id.\r\n"
					+ "	Case 3: Delete Employee by using its id.\r\n"
					+ "	Case 4: update employee name by using its id.\r\n"
					+ "	Case 5: find the same name employee "
					+ "\n Enter Your Choice : ");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Id\tName\t\t\tSalary\t\tMob.No\t\tSector");
				for(Object obj : al) {
					Employee e = (Employee)obj;
					System.out.println(e.getEid()+"\t"+e.getName()+"\t"+e.getSal()+"\t\t"+e.getMno()+"\t"+e.getSector());
				}
				break;
			case 2:
				System.out.println("Enter Id for Serching");
				int cid = s.nextInt();
				
				for(Object obj : al) {
					Employee e = (Employee)obj;
					if(cid==e.getEid()) {
						System.out.println("Id\tName\t\t\tSalary\t\tMob.No\t\tSector");
						System.out.println(e.getEid()+"\t"+e.getName()+"\t"+e.getSal()+"\t\t"+e.getMno()+"\t"+e.getSector());
					}
					else {
						System.out.println("Employee not found");
					}
				}
				break;
			case 3:
				System.out.println("Enter Id for Deleate");
				int did = s.nextInt();
				for(Object ob:al){
					Employee e = (Employee)ob;
					if(did==e.getEid()) {
						al.remove((1-did));
						System.out.println(" Removed Sucefully ");
						break;
					}
					else {
						System.out.println("No Employee Found..With This Id");
					}
				}
				break;
			case 4:
				System.out.println("Enter Id for Update");
				int uid = s.nextInt();
				s.nextLine();
				for(Object ob:al){
					Employee e = (Employee)ob;
					if(uid==e.getEid()) {
						System.out.println("Enter Updated Name");
						String uName=s.nextLine();
						e.setName(uName);
						break;
					}
					else {
						System.out.println("No Employee Found..With This Id");
					}
				}

				break;
			case 5:
				for (int i = 0; i < al.size(); i++) {
				    Employee e1 = (Employee) al.get(i);

				    for (int j = i + 1; j < al.size(); j++) {
				        Employee e2 = (Employee) al.get(j);

				        if (e1.getName().equals(e2.getName())) {
				            System.out.println("Duplicate found:");
				            System.out.println(e1.getName());
				            System.out.println(e2.getName());
				        }
				    }
				}

				break;
				default:
			}
		}while(choice!=0);
	}

}
