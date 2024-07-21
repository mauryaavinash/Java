class Example1{
    private String name;
    private String address;
    private String age;

    // deafult constructor
    public Example1(){

    }
    // parametrized constructor
     public Example1(String name, String address){
            this.name = name;
            this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
    
}
