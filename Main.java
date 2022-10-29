public class Main {
    public static void main(String[] args) {

System.out.println("Enter Text >");
 
        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource();
 
        // create first observer
        final ResponseHandler1 responseHandler1 = new ResponseHandler1();
 
        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler1);
        
        
        // create second observer
        final ResponseHandler2 responseHandler2 = new ResponseHandler2();
 
        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler2);
 
        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();


        ///////////////Prototype Demo ///////////////

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Name: ");  
        String ename=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Address: ");  
        String eaddress=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  

        ///////////////End Prototype Demo ///////////////

    }
}
