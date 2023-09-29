import axios from "axios";

const BASE_URL = "http://localhost:8181/employee"

class EmployeeService{

// method to get all employ detele
getAllEmployee(){
    return axios.get(BASE_URL);
}

//methord to save employee
saveEmployee(employeeData){
    return axios.post(BASE_URL, employeeData);
}

updateEmployee(id, employee){
    return axios.put(`${BASE_URL}/${id}`,employee);
}

getEmployeeById(id){
    return axios.get(`${BASE_URL}/${id}`);
}

deleteEmployee(id){
    return axios.delete(BASE_URL+"/"+id);
}

}
export default new EmployeeService();