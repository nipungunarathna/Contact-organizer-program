import java.util.*;
import java.time.*;
class Customer{
	private String id;
	private String name;
	private String phoneNumber;
	private String company;
	private double salary;
	private String birthday;
	
	Customer(String id,String name,String phoneNumber,String company,double salary,String birthday){
		this.id=id;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.company=company;
		this.salary=salary;
		this.birthday=birthday;
		
		}
	public String getId(){
		return id;
		}
	public String getName(){
		return name;
		}
	public String getPhoneNumber(){
		return phoneNumber;
		}
	public String getCompany(){
		return company;
		}
	public double getSalary(){
		return salary;
		}
	public String getBirthday(){
		return birthday;
		}
	public void setId(String id){
		this.id=id;
		}
	public void setName(String name){
		this.name=name;
		}
	public void setPhoneNumber(String number){
		this.phoneNumber=number;
		}
	public void setCompany(String company){
		this.company=company;
		}
	public void setSalary(double salary){
		this.salary=salary;
		}
	public void setBirthday(String birthday){
		this.birthday=birthday;
		}
	}
//====================================customer list class===================================
class CustomerList{
	Node start;
	public void add(Customer customer){
		Node n=new Node(customer);
		if(start==null){
			start=n;
			}
		else{
			Node temp=start;
			while(temp.next!=null){
				temp=temp.next;
				}
				temp.next=n;
			}
		}
	private Node searchNode(int index){
		int count=0;
		Node temp=start;
		while(count!=index){
			count++;
			temp=temp.next;
			}
			return temp;
		}
	public  Customer get(int index){
		if(index>=0&&index<size()){
			Node node=searchNode(index);
			return node.customer;
			}
			else
			return null;
		}
	public void remove(int index){
		Node temp=start;
		int count=0;
		if(index>0&&index<size()){
		while(count<index-1){
			count++;
			temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		else if(index==0){
			start=start.next;
			}
	}
	public void remove(Customer c){
		Node temp=start;
		int count=0;
		while(temp.customer!=c){
			temp=temp.next;
			count++;
			}
			remove(count);
			
		}
	
	
	public int size(){
		int count=0;
		Node temp=start;
		while(temp!=null){
			temp=temp.next;
			count++;
			}
			return count;
		}
	 //=========================CONVERT TO ARRAY==========================
	 public Customer[] toArray(){
		 Customer dataArray[]=new Customer[size()];
		 Node temp=start;
		 for(int i=0;i<dataArray.length;i++){
			 dataArray[i]=temp.customer;
			 temp=temp.next;
			 }
			 return dataArray;
		 }
    //---------------------------SEARCH METHOD--------------------------
     public Customer searchByNameOrPhoneNumber(String nameOrPhone){
		 Node temp=start;
		 while(temp!=null){
			 if(temp.customer.getName().equals(nameOrPhone)||temp.customer.getPhoneNumber().equals(nameOrPhone)){
				 return temp.customer;
				 }
				 temp=temp.next;
			 }
		 return null;
		 }
    

	//==============================INNER CLASS=================================
	class Node{
		private Customer customer;
		private Node next;
		Node(Customer customer){
			this.customer=customer;
			}
		
		}
	}
class Example{
	
	 static CustomerList list=new CustomerList();
		
	    //----------------------CLEAR CONSOLE --------------------
		public final static void clearConsole() { 
			try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
			System.out.print("\033[H\033[2J"); 
			System.out.flush();
			}
			} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
			}
		}
    //-----------------MAIN METHOD--------------------
    public static void main(String[] args){
		
        homepage();
    }
    //-------------------GENERATE ID----------------
    public static String generateId(){
		if(list.size()==0){
			return "C0001";
		}
		String lastId=list.get(list.size()-1).getId();
		int lastNo=Integer.parseInt(lastId.substring(1));
		return String.format("C%04d",lastNo+1);
	}
    //-----------------HOME PAGE--------------------
    public static void homepage(){
        Scanner input = new Scanner(System.in);
        	System.out.println("\t\t /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
		System.out.println("\t\t |__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
		System.out.println("\t\t  /$$| $$      | $$  \\ $$  | $$   | $$     | $$$$| $$| $$  \\ $$");
		System.out.println("\t\t |$$ | $$$$$   | $$$$$$$/  | $$   | $$$$$  | $$ $$ $$| $$  | $$");
		System.out.println("\t\t |$$ | $$__/   | $$__  $$  | $$   | $$__/  | $$  $$$$| $$  | $$");
		System.out.println("\t\t |$$ | $$      | $$  \\ $$ | $$   | $$      | $$\\  $$$| $$  | $$");
		System.out.println("\t\t |$$ | $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
		System.out.println("\t\t |__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/\n\n");
		
		System.out.println("   _____             _             _          ____                        _");
		System.out.println("  / ____|           | |           | |        / __ \\                      (_)");
		System.out.println(" | |      ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __");
		System.out.println(" | |     / _ \\| '_ \\| __/ _' |/ __| __/ __| | |  | | '__/ _' |/ _' | '_ \\| |_  / _ \\ '__|");
		System.out.println(" | |____| ( ) | | | | || |_| | |__| |_\\__ \\ | |__| | | | | | | |_| | | | | |/ / ___/ |");
		System.out.println("  \\______\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/__ \\___|_|");
		System.out.println("                                                         __/ |");
		System.out.println("                                                        |___/");
		
		System.out.println("====================================================================================================\n");
		System.out.println("\t[01] Add Contacts");
		System.out.println("\t[02] Update Contacts");
		System.out.println("\t[03] Delete Contacts");
		System.out.println("\t[04] Search Contacts");
		System.out.println("\t[05] List Contacts");
		System.out.println("\t[06] Exit\n");
     
        System.out.print("\nEnter option to continue : ");
        int option=input.nextInt();
        clearConsole();
        switch(option){
            case 1 : addContacts();break;
            case 2 : updateContacts();break;
            case 3 : deleteContacts();break;
            case 4 : searchContacts();break;
            case 5 : listContacts();break;
            case 6 : exit();break;
            default : System.out.println("Invalid option...");break;
        }

    }
    //------------------------VALIDATE PHONENUMBER---------------------------
    public static boolean isValidPhoneNumber(String phoneNumber){
        if(phoneNumber.length()==10 && phoneNumber.charAt(0)=='0'){
            for(int i=1; i<phoneNumber.length(); i++){
                if(!Character.isDigit(phoneNumber.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;

    }
    //-------------------VALIDATE SALARY----------------------
    public static boolean isValidSalary(double salary){
        return salary>0;
    }
    // -------------------BIRTHDAY VALIDATION----------------
	public static boolean isValidBirthday(String birthday){
        String y=birthday.substring(0,4);
		int year=Integer.parseInt(y);
		String m=birthday.substring(5,7);
		int month=Integer.parseInt(m);
		String d=birthday.substring(8,10);
		int day=Integer.parseInt(d);
		LocalDate currentDate = LocalDate.now();
		int currentMonthValue = currentDate.getMonthValue();
		int currentYear=currentDate.getYear();    
		int currentMonthDate=currentDate.getDayOfMonth();
			
		if(year%4!=0 & month==2){
			if(day>28){
				return false;
			}else{
				return true;
			}
		}
		if(year%4==0 & month==2){
			if(day>29){
				return false;
			}else{
				return true;
			}
		}
		if(month==4 || month==6 || month==9 || month==11){
			if(day>30){
				return false;					
			}
		}
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			if(day>31){
				return false;
			}	
		}
		if(month>12){
			return false;
		}
		if(year<currentYear){
			return true;
			}else if(year==currentYear){
									
				if(month>currentMonthValue){
					return true;
				}else if(month==currentMonthValue){
									
					if(day<=currentMonthDate){
						return true;
					}
				}
			}
					return false;
    }
    

    //-----------------ADD CONTACTS--------------------
    public static void addContacts(){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("======================ADD CONTACTS================");
            String id = generateId();
            System.out.println("\n"+id);
            System.out.println("=============");
            System.out.print("Name : ");
            String name=input.next();
            String phoneNumber;
            L1:do{
                System.out.print("Phone Number : ");
                phoneNumber  = input.next();
                if(!isValidPhoneNumber(phoneNumber)){
                    System.out.println("\n\tInvalid phone number...");
                    System.out.print("\nDo you want to input phone number again : ");
                    char ch = input.next().charAt(0);
                    if(ch=='Y'||ch=='y'){
                        System.out.print("\033[5A");
                        System.out.print("\033[0J");
                        continue L1;
                    }else if(ch=='N'||ch=='n'){
                        clearConsole();
                        homepage();
                    }
                }

            }while(!isValidPhoneNumber(phoneNumber));

            System.out.print("Company Name : ");
            String companyName  = input.next();
            double salary;

            L2:do{
                System.out.print("Salary : ");
                salary=input.nextDouble();
                if(!isValidSalary(salary)){
                    System.out.println("\n\tInvalid salary...");
                    System.out.print("\nDo you want to input salary again : ");
                    char ch=input.next().charAt(0);
                    if(ch=='Y'||ch=='y'){
                        System.out.print("\033[5A");
                        System.out.print("\033[0J");
                        continue L2;
                    }else if(ch=='N'||ch=='n'){
                        clearConsole();
                        homepage();
                    }
                }

            }while(!isValidSalary(salary));
            String birthday;

            L3:do{
                System.out.print("Birthday : ");
                birthday = input.next();
                if(!isValidBirthday(birthday)){
                    System.out.println("\n\tInvalid birthday...");
                    System.out.print("\nDo you want to input birthday again : ");
                    char ch=input.next().charAt(0);
                    if(ch=='Y'||ch=='y'){
                        System.out.print("\033[5A");
                        System.out.print("\033[0J");
                        continue L3;
                    }else if(ch=='N'||ch=='n'){
                        clearConsole();
                        homepage();
                    }
                }

            }while(!isValidBirthday(birthday));
			
			
            
            Customer c =new Customer(id,name,phoneNumber,companyName,salary,birthday);
			list.add(c);
			
           

            System.out.println("\n\tContact has been added successfully...");
            System.out.print("\nDo you want to add another contact : ");
            char ch=input.next().charAt(0);
            if(ch=='Y'||ch=='y'){
                clearConsole();
                addContacts();
            }else if(ch=='N'||ch=='n'){
                clearConsole();
                homepage();
            }

        }while(true);

    }
   
    //--------------------------PRINT DETAILS---------------------------
    public static void printDetails(Customer customer){
        System.out.println("Contact Id : "+customer.getId());
        System.out.println("Name : "+customer.getName());
        System.out.println("Phone Number : "+customer.getPhoneNumber());
        System.out.println("Companu Name : "+customer.getCompany());
        System.out.println("Salary : "+customer.getSalary());
        System.out.println("Birthday : "+customer.getBirthday());
    }
    //--------------------------SEARCH CONTACT-------------------------
    public static void searchContacts(){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("=====================SEARCH CONTACTS======================");
            System.out.print("\nSearch contact by name or phone number : ");
            String nameOrPhone=input.next();
			Customer customer= list.searchByNameOrPhoneNumber(nameOrPhone);

            if(customer == null){
                System.out.println("\n\tNo contact found for "+nameOrPhone);
                System.out.print("\nDo you want to try a new search : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    searchContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }else{
                printDetails(customer);
                System.out.print("\nDo you want to search another contact : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    searchContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }

        }while(true);
    }
    //--------------------------UPDATE NAME----------------------------
    public static void updateName(Customer customer){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Name");
        System.out.println("===================");
        System.out.print("\nInput new name : ");
        String newName = input.next();
        customer.setName(newName);
    }
    //--------------------------UPDATE PHONE NUMBER----------------------------
    public static void updatePhoneNumber(Customer customer){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Phonenumber");
        System.out.println("========================");
        System.out.print("\nInput new phone number : ");
        String newPhoneNumber = input.next();
		customer.setPhoneNumber(newPhoneNumber );
    }
    //--------------------------UPDATE COMPANY----------------------------
    public static void updateCompanyName(Customer customer){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Company Name");
        System.out.println("===========================");
        System.out.print("\nInput new company name : ");
        String newCompanyName = input.next();
       customer.setCompany(newCompanyName );
    }
    //--------------------------UPDATE SALARY----------------------------
    public static void updateSalary(Customer customer){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Salary");
        System.out.println("==================");
        System.out.print("\nInput new salary : ");
        double newSalary = input.nextDouble();
        customer.setSalary(newSalary);
    }
    //--------------------------UPDATE CONTACTS-----------------------
    public static void updateContacts(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("=======================UPDATE CONTACTS================");
            System.out.print("\nSearch contact by name or phone number : ");
            String nameOrPhone=input.next();
            Customer customer= list.searchByNameOrPhoneNumber(nameOrPhone);

            if(customer == null){
                System.out.println("\n\tNo contact found for "+nameOrPhone);
                System.out.print("\nDo you want to try a new search : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    updateContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }
            else{
                printDetails(customer);

                System.out.println("\nWhat do you want to update");
                System.out.println("\n\t[01] Name");
                System.out.println("\t[02] Phone number");
                System.out.println("\t[03] Company Name");
                System.out.println("\t[04] Salary");
                System.out.println("\nEnter an option to continue...");
                int option=input.nextInt();
                switch(option){
                    case 1 : updateName(customer);break;
                    case 2 : updatePhoneNumber(customer);break;
                    case 3 : updateCompanyName(customer);break;
                    case 4 : updateSalary(customer);break;
                    default : System.out.println("\n\tInvalid option...");
                }
                System.out.println("\nContact has been update successfully.");
                System.out.print("\nDo you want to update another contact : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    updateContacts();
                }else if(ch=='N'|| ch=='n'){
                    clearConsole();
                    homepage();
                }
            }
        }while(true);
    }
    
    //--------------------------DELETE CONTACTS-----------------------
    public static void deleteContacts(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("======================DELETE CONTACTS================");
            System.out.print("\nSearch contact by name or phone number : ");
            String nameOrPhone=input.next();
            Customer customer= list.searchByNameOrPhoneNumber(nameOrPhone);

            if( customer==null){
                System.out.println("\n\tNo contact found for "+nameOrPhone);
                System.out.print("\nDo you want to try a new search : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    deleteContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }else{
                printDetails(customer);
                L1:do{
                    System.out.print("\nDo you want to delete this contact : ");
                    char ch=input.next().charAt(0);
                    if(ch=='Y'||ch=='y'){
                        list.remove(customer);
                        System.out.println("\nContact has been deleted successfully...");
                        break L1;
                    }else if(ch=='N'||ch=='n'){
                        break L1;
                    }

                }while(true);

                System.out.println("\nDo you want to delete another contact : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    deleteContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
                
            }

        }while(true);

    }
    //--------------------------LIST CONTACTS------------------------
    public static void listContacts(){
        Scanner input = new Scanner(System.in);
        System.out.println("=======================SORT CONTACTS==========================");
        System.out.println("\n[01] Sorting by name");
        System.out.println("\n[02] Sorting by salary");
        System.out.println("\n[03] Sorting by birthday");
        System.out.print("\nEnter option to continue : ");
        int option=input.nextInt();
        switch(option){
            case 1 : sortByName();break;
            case 2 : sortBySalary();break;
            case 3 : sortByBirthday();break;
            default : System.out.println("\n\tInvalid option...");
        }

    }
    //--------------------------SORT BY NAME-------------------------
    public static void sortByName(){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("============LIST CONTACT BY NAME============\n");
            System.out.println("+---------------------------------------------------------------------------------------------------+");
            System.out.println("|  Contact Id  |     Name     |   Phone Number   |    Company    |    Salary    |      Birthday     |");
            System.out.println("+---------------------------------------------------------------------------------------------------+");

            sortingByName();

            System.out.println("+---------------------------------------------------------------------------------------------------+");
            System.out.print("\nDo you want to go homepage : ");
            char ch=input.next().charAt(0);
            if(ch=='Y'||ch=='y'){
                clearConsole();
                homepage();
            }else if(ch=='N'|| ch=='n'){
                clearConsole();
                listContacts();
            }


        }while(true);
    }
    //--------------------------SORT BY SALARY-------------------------
    public static void sortBySalary(){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("============LIST CONTACT BY NAME============\n");
            System.out.println("+---------------------------------------------------------------------------------------------------+");
            System.out.println("|  Contact Id  |     Name     |   Phone Number   |    Company    |    Salary    |      Birthday     |");
            System.out.println("+---------------------------------------------------------------------------------------------------+");

            sortingBySalary();

            System.out.println("+---------------------------------------------------------------------------------------------------+");
            System.out.print("\nDo you want to go homepage : ");
            char ch=input.next().charAt(0);
            if(ch=='Y'||ch=='y'){
                clearConsole();
                homepage();
            }else if(ch=='N'|| ch=='n'){
                clearConsole();
                listContacts();
            }


        }while(true);
    }
    //--------------------------SORT BY BIRTHDAY-------------------------
    public static void sortByBirthday(){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("============LIST CONTACT BY NAME============\n");
            System.out.println("+---------------------------------------------------------------------------------------------------+");
            System.out.println("|  Contact Id  |     Name     |   Phone Number   |    Company    |    Salary    |      Birthday     |");
            System.out.println("+---------------------------------------------------------------------------------------------------+");

            sortingByBirthday();

            System.out.println("+---------------------------------------------------------------------------------------------------+");
            System.out.print("\nDo you want to go homepage : ");
            char ch=input.next().charAt(0);
            if(ch=='Y'||ch=='y'){
                clearConsole();
                homepage();
            }else if(ch=='N'|| ch=='n'){
                clearConsole();
                listContacts();
            }


        }while(true);
    }
    //-------------------------NAME SORT---------------------------
    public static void sortingByName(){
        Customer [] tempArray=list.toArray();

       
        for(int j=1; j<tempArray.length; j++){
            for(int i=0;i<j;i++){
                if(tempArray[i].getName().compareTo(tempArray[j].getName())>0){
					
                    Customer tempVar=tempArray[i];
                    tempArray[i]=tempArray[j];
                    tempArray[j]=tempVar;
                }
            }
        }

        for(int i=0; i<tempArray.length; i++) {
            System.out.printf("| %-13s| %-13s| %-16s| %-16s| %-12.2f| %-16s|\n",tempArray[i].getId(),tempArray[i].getName(),tempArray[i].getPhoneNumber(),tempArray[i].getCompany(),tempArray[i].getSalary(),tempArray[i].getBirthday());
        }

    }
    //-------------------------SALARY SORT---------------------------
    public static void sortingBySalary(){
       Customer [] tempArray=list.toArray();;

        for(int i=0; i<tempArray.length; i++){
            tempArray[i]=list.get(i);
        }
        for(int j=1; j<tempArray.length; j++){
            for(int i=0; i<j; i++){
                if(tempArray[i].getSalary()<tempArray[j].getSalary()){
                    Customer tempVar=tempArray[i];
                    tempArray[i]=tempArray[j];
                    tempArray[j]=tempVar;
                }
            }
        }

        for(int i=0; i<tempArray.length; i++) {
            System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12.2f| %-12s|\n",tempArray[i].getId(),tempArray[i].getName(),tempArray[i].getPhoneNumber(),tempArray[i].getCompany(),tempArray[i].getSalary(),tempArray[i].getBirthday());
        }

    }

    //-------------------------BIRTHDAY SORT---------------------------
    public static void sortingByBirthday(){
        Customer [] tempArray=list.toArray();
        
        for(int i=0; i<tempArray.length; i++){
             tempArray[i]=list.get(i);
        }
        for(int j=1; j<tempArray.length; j++){
            for(int i=0; i<j; i++){
                if(tempArray[i].getBirthday().compareTo(tempArray[j].getBirthday())>0){
                    Customer tempVar=tempArray[i];
                    tempArray[i]=tempArray[j];
                    tempArray[j]=tempVar;
                }
            }
        }

        for(int i=0; i<tempArray.length; i++) {
            System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12.2f| %-12s|\n",tempArray[i].getId(),tempArray[i].getName(),tempArray[i].getPhoneNumber(),tempArray[i].getCompany(),tempArray[i].getSalary(),tempArray[i].getBirthday());
       
            }

    }
    //-----------------------EXIT--------------------------
    public static void exit(){
        System.exit(0);
    }

}
