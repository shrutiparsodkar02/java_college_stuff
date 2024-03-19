class College {
    String collegeName;
    Department obj1;
    
    College(String name) {
        this.collegeName = name;
    }
    String getCollegeDetails(Department d1){
    	this.obj1=d1;
    	return "College Name: " + collegeName +"  department name  "+d1.deptName;
    }
    
    private class Department {
        String deptName;
        
        Department(String name) {
            this.deptName = name;
        }
        
        String getDetails() {
            return "College Name: " + collegeName + ", Department Name: " + deptName;
        }
    }
    
    public static void main(String args[]) {
        College c1 = new College("SGGS");
        Department d1 = c1.new Department("IT");
        System.out.println(d1.getDetails());
        System.out.println(c1.getCollegeDetails(d1));
    }
}

