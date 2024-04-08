<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Employees</title>
</head>
<body>
    <div class="container mt-5">
        <h1>List of Employees</h1>

        <table class="table table-bordered mt-3">
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Number</th>
                    <th scope="col">Department</th>
                    <th scope="col">Position</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="employee" items="${employeeList}">
                    <tr>
                       <td>${employee.getId()}</td>
                        <td>${employee.getName()}</td>
                        <td>${employee.getEmail()}</td>
                        <td>${employee.getNumber()}</td>
                        <td>${employee.getDepartment()}</td>
                        <td>${employee.getPosition()}</td>
                        <td>
                            <a href="/Gestion_Employee/Modify?Id=${employee.getId()}" class="btn btn-primary btn-sm">Modify</a>
                            <a href="/Gestion_Employee/Delete?Id=${employee.getId()}" class="btn btn-danger btn-sm">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <a href="/Gestion_Employee/Add" class="btn btn-success">Add Employee</a>
    </div>
</body>
</html>
