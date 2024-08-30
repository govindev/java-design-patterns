package miscellenious.adapter;

public class Client {
    public static void main(String[] args) {
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        populateEmployee(employeeClassAdapter);

        // Class adapter (two way adapter)
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        String card  = businessCardDesigner.getCard(employeeClassAdapter);
        System.out.println("Card information using class adapter : \n" + card);

        // Object adapter
        Employee employee = new Employee();
        populateEmployee(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        card = businessCardDesigner.getCard(employeeObjectAdapter);
        System.out.println("Card information using object adapter : \n" + card);
    }

    public static void populateEmployee(Employee employee) {
        employee.setFullName("Govind");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("India");
    }
}
